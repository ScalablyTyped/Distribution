package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.ProjectPublicAdvertisedPrefix
import typings.maximMazurokGapiClientCompute.anon.PublicAdvertisedPrefixQuotaUser
import typings.maximMazurokGapiClientCompute.anon.RequestIdResourceUploadTypeUploadprotocolUserIp
import typings.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicAdvertisedPrefixesResource extends StObject {
  
  /** Deletes the specified PublicAdvertisedPrefix */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.PublicAdvertisedPrefix): Request[Operation] = js.native
  
  /** Returns the specified PublicAdvertisedPrefix resource. */
  def get(): Request[PublicAdvertisedPrefix] = js.native
  def get(request: ProjectPublicAdvertisedPrefix): Request[PublicAdvertisedPrefix] = js.native
  
  /** Creates a PublicAdvertisedPrefix in the specified project using the parameters that are included in the request. */
  def insert(request: RequestIdResourceUploadTypeUploadprotocolUserIp): Request[Operation] = js.native
  def insert(request: Xgafv, body: PublicAdvertisedPrefix): Request[Operation] = js.native
  
  /** Lists the PublicAdvertisedPrefixes for a project. */
  def list(): Request[PublicAdvertisedPrefixList] = js.native
  def list(request: MaxResults): Request[PublicAdvertisedPrefixList] = js.native
  
  /** Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: PublicAdvertisedPrefixQuotaUser): Request[Operation] = js.native
  def patch(
    request: typings.maximMazurokGapiClientCompute.anon.PublicAdvertisedPrefix,
    body: PublicAdvertisedPrefix
  ): Request[Operation] = js.native
}
