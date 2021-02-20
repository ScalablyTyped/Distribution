package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Directories
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileAppsResource extends StObject {
  
  /** Gets one mobile app by ID. */
  def get(): Request[MobileApp] = js.native
  def get(request: Alt): Request[MobileApp] = js.native
  
  /** Retrieves list of available mobile apps. */
  def list(): Request[MobileAppsListResponse] = js.native
  def list(request: Directories): Request[MobileAppsListResponse] = js.native
}
