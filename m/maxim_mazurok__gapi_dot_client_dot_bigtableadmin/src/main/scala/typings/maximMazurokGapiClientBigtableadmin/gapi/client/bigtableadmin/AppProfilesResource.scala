package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigtableadmin.anon.Alt
import typings.maximMazurokGapiClientBigtableadmin.anon.AppProfileId
import typings.maximMazurokGapiClientBigtableadmin.anon.Callback
import typings.maximMazurokGapiClientBigtableadmin.anon.Fields
import typings.maximMazurokGapiClientBigtableadmin.anon.IgnoreWarnings
import typings.maximMazurokGapiClientBigtableadmin.anon.Key
import typings.maximMazurokGapiClientBigtableadmin.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppProfilesResource extends StObject {
  
  /** Creates an app profile within an instance. */
  def create(request: AppProfileId): Request[AppProfile] = js.native
  def create(request: Callback, body: AppProfile): Request[AppProfile] = js.native
  
  /** Deletes an app profile from an instance. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /** Gets information about an app profile. */
  def get(): Request[AppProfile] = js.native
  def get(request: Alt): Request[AppProfile] = js.native
  
  /** Lists information about app profiles in an instance. */
  def list(): Request[ListAppProfilesResponse] = js.native
  def list(request: Key): Request[ListAppProfilesResponse] = js.native
  
  /** Updates an app profile within an instance. */
  def patch(request: IgnoreWarnings): Request[Operation] = js.native
  def patch(request: Name, body: AppProfile): Request[Operation] = js.native
}
