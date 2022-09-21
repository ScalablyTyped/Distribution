package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.KeyMerchantIdOauthtokenPrettyPrint
import typings.maximMazurokGapiClientContent.anon.PrettyPrintProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductdeliverytimeResource extends StObject {
  
  def create(request: AccesstokenAlt, body: ProductDeliveryTime): Request[ProductDeliveryTime] = js.native
  /** Creates or updates the delivery time of a product. */
  def create(request: KeyMerchantIdOauthtokenPrettyPrint): Request[ProductDeliveryTime] = js.native
  
  /** Deletes the delivery time of a product. */
  def delete(): Request[Unit] = js.native
  def delete(request: PrettyPrintProductId): Request[Unit] = js.native
  
  /** Gets `productDeliveryTime` by `productId`. */
  def get(): Request[ProductDeliveryTime] = js.native
  def get(request: PrettyPrintProductId): Request[ProductDeliveryTime] = js.native
}
