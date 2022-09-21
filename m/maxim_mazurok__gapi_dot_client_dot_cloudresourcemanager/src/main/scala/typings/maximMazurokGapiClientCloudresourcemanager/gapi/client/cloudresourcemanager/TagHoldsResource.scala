package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Filter
import typings.maximMazurokGapiClientCloudresourcemanager.anon.KeyOauthtoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.NameOauthtoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagHoldsResource extends StObject {
  
  def create(request: KeyOauthtoken, body: TagHold): Request[Operation] = js.native
  /** Creates a TagHold. Returns ALREADY_EXISTS if a TagHold with the same resource and origin exists under the same TagValue. */
  def create(request: Parent): Request[Operation] = js.native
  
  /** Deletes a TagHold. */
  def delete(): Request[Operation] = js.native
  def delete(request: NameOauthtoken): Request[Operation] = js.native
  
  /** Lists TagHolds under a TagValue. */
  def list(): Request[ListTagHoldsResponse] = js.native
  def list(request: Filter): Request[ListTagHoldsResponse] = js.native
}
