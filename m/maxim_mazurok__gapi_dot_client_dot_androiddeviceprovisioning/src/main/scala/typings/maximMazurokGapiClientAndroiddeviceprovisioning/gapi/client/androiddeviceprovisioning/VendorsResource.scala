package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.anon.KeyOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VendorsResource extends StObject {
  
  var customers: CustomersResource = js.native
  
  /** Lists the vendors of the partner. */
  def list(): Request[ListVendorsResponse] = js.native
  def list(request: KeyOauthtoken): Request[ListVendorsResponse] = js.native
}
