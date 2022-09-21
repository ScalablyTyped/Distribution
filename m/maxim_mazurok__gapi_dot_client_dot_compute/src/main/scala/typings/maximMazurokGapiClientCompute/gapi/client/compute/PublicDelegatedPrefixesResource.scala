package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.Oauthtoken
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintProjectPublicDelegatedPrefix
import typings.maximMazurokGapiClientCompute.anon.ProjectPublicDelegatedPrefixQuotaUser
import typings.maximMazurokGapiClientCompute.anon.RegionRequestIdResource
import typings.maximMazurokGapiClientCompute.anon.RegionUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicDelegatedPrefixesResource extends StObject {
  
  /** Lists all PublicDelegatedPrefix resources owned by the specific project across all scopes. */
  def aggregatedList(): Request[PublicDelegatedPrefixAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[PublicDelegatedPrefixAggregatedList] = js.native
  
  /** Deletes the specified PublicDelegatedPrefix in the given region. */
  def delete(): Request[Operation] = js.native
  def delete(request: PrettyPrintProjectPublicDelegatedPrefix): Request[Operation] = js.native
  
  /** Returns the specified PublicDelegatedPrefix resource in the given region. */
  def get(): Request[PublicDelegatedPrefix] = js.native
  def get(request: RegionUploadType): Request[PublicDelegatedPrefix] = js.native
  
  def insert(request: Oauthtoken, body: PublicDelegatedPrefix): Request[Operation] = js.native
  /** Creates a PublicDelegatedPrefix in the specified project in the given region using the parameters that are included in the request. */
  def insert(request: RegionRequestIdResource): Request[Operation] = js.native
  
  /** Lists the PublicDelegatedPrefixes for a project in the given region. */
  def list(): Request[PublicDelegatedPrefixList] = js.native
  def list(request: Filter): Request[PublicDelegatedPrefixList] = js.native
  
  def patch(request: PrettyPrintProjectPublicDelegatedPrefix, body: PublicDelegatedPrefix): Request[Operation] = js.native
  /**
    * Patches the specified PublicDelegatedPrefix resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing
    * rules.
    */
  def patch(request: ProjectPublicDelegatedPrefixQuotaUser): Request[Operation] = js.native
}
