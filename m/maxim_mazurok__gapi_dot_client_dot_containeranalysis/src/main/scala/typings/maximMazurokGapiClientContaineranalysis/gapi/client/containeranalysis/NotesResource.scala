package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContaineranalysis.anon.Callback
import typings.maximMazurokGapiClientContaineranalysis.anon.Key
import typings.maximMazurokGapiClientContaineranalysis.anon.NoteId
import typings.maximMazurokGapiClientContaineranalysis.anon.Oauthtoken
import typings.maximMazurokGapiClientContaineranalysis.anon.PageSize
import typings.maximMazurokGapiClientContaineranalysis.anon.Parent
import typings.maximMazurokGapiClientContaineranalysis.anon.PrettyPrint
import typings.maximMazurokGapiClientContaineranalysis.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotesResource extends StObject {
  
  def batchCreate(request: Callback, body: BatchCreateNotesRequest): Request[BatchCreateNotesResponse] = js.native
  /** Creates new notes in batch. */
  def batchCreate(request: Parent): Request[BatchCreateNotesResponse] = js.native
  
  /** Creates a new note. */
  def create(request: NoteId): Request[Note] = js.native
  def create(request: QuotaUser, body: Note): Request[Note] = js.native
  
  /** Deletes the specified note. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets the specified note. */
  def get(): Request[Note] = js.native
  def get(request: Key): Request[Note] = js.native
  
  /**
    * Gets the access control policy for a note or an occurrence resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if
    * the resource is a note or occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists notes for the specified project. */
  def list(): Request[ListNotesResponse] = js.native
  def list(request: PageSize): Request[ListNotesResponse] = js.native
  
  var occurrences: OccurrencesResource = js.native
  
  def patch(request: PrettyPrint, body: Note): Request[Note] = js.native
  /** Updates the specified note. */
  def patch(request: typings.maximMazurokGapiClientContaineranalysis.anon.Resource): Request[Note] = js.native
  
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
