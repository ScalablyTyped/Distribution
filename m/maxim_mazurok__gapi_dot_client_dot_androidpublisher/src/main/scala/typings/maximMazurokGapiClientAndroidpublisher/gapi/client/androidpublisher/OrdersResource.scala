package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.OrderId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersResource extends js.Object {
  
  /** Refund a user's subscription or in-app purchase order. */
  def refund(): Request[Unit] = js.native
  def refund(request: OrderId): Request[Unit] = js.native
}
