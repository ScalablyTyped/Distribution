package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContaineranalysis.anon.Accesstoken
import typings.maximMazurokGapiClientContaineranalysis.anon.Alt
import typings.maximMazurokGapiClientContaineranalysis.anon.Callback
import typings.maximMazurokGapiClientContaineranalysis.anon.Fields
import typings.maximMazurokGapiClientContaineranalysis.anon.Filter
import typings.maximMazurokGapiClientContaineranalysis.anon.Key
import typings.maximMazurokGapiClientContaineranalysis.anon.Name
import typings.maximMazurokGapiClientContaineranalysis.anon.Oauthtoken
import typings.maximMazurokGapiClientContaineranalysis.anon.PageSize
import typings.maximMazurokGapiClientContaineranalysis.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OccurrencesResource extends StObject {
  
  /** Creates new occurrences in batch. */
  def batchCreate(request: Alt): Request[BatchCreateOccurrencesResponse] = js.native
  def batchCreate(request: Callback, body: BatchCreateOccurrencesRequest): Request[BatchCreateOccurrencesResponse] = js.native
  
  def create(request: Callback, body: Occurrence): Request[Occurrence] = js.native
  /** Creates a new occurrence. */
  def create(request: Fields): Request[Occurrence] = js.native
  
  /** Deletes the specified occurrence. For example, use this method to delete an occurrence when the occurrence is no longer applicable for the given resource. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets the specified occurrence. */
  def get(): Request[Occurrence] = js.native
  def get(request: Key): Request[Occurrence] = js.native
  
  /**
    * Gets the access control policy for a note or an occurrence resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if
    * the resource is a note or occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Gets the note attached to the specified occurrence. Consumer projects can use this method to get a note that belongs to a provider project. */
  def getNotes(): Request[Note] = js.native
  def getNotes(request: Key): Request[Note] = js.native
  
  /** Gets a summary of the number and severity of occurrences. */
  def getVulnerabilitySummary(): Request[VulnerabilityOccurrencesSummary] = js.native
  def getVulnerabilitySummary(request: Filter): Request[VulnerabilityOccurrencesSummary] = js.native
  
  /** Lists occurrences referencing the specified note. Provider projects can use this method to get all occurrences across consumer projects referencing the specified note. */
  /** Lists occurrences for the specified project. */
  def list(): Request[ListNoteOccurrencesResponse] = js.native
  def list(request: Accesstoken): Request[ListNoteOccurrencesResponse] = js.native
  def list(request: PageSize): Request[ListOccurrencesResponse] = js.native
  
  /** Updates the specified occurrence. */
  def patch(request: Name): Request[Occurrence] = js.native
  def patch(request: PrettyPrint, body: Occurrence): Request[Occurrence] = js.native
  
  /**
    * Sets the access control policy on the specified note or occurrence. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the
    * resource is a note or an occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns the permissions that a caller has on the specified note or occurrence. Requires list permission on the project (for example, `containeranalysis.notes.list`). The resource
    * takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
