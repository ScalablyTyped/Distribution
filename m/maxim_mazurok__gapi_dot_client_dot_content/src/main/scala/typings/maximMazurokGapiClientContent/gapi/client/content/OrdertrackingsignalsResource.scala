package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.MerchantIdOauthtokenPrettyPrint
import typings.maximMazurokGapiClientContent.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdertrackingsignalsResource extends js.Object {
  
  /** Creates new order tracking signal. */
  def create(request: MerchantIdOauthtokenPrettyPrint): Request[OrderTrackingSignal] = js.native
  def create(request: UploadType, body: OrderTrackingSignal): Request[OrderTrackingSignal] = js.native
}
