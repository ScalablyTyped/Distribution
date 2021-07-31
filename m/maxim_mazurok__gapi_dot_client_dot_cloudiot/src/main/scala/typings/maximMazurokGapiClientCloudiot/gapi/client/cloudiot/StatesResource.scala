package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudiot.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatesResource extends StObject {
  
  /** Lists the last few versions of the device state in descending order (i.e.: newest first). */
  def list(): Request[ListDeviceStatesResponse] = js.native
  def list(request: Alt): Request[ListDeviceStatesResponse] = js.native
}
