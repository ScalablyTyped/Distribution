package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DpcsResource extends StObject {
  
  /** Lists the DPCs (device policy controllers) that support zero-touch enrollment. */
  def list(): Request[CustomerListDpcsResponse] = js.native
  def list(request: Alt): Request[CustomerListDpcsResponse] = js.native
}
