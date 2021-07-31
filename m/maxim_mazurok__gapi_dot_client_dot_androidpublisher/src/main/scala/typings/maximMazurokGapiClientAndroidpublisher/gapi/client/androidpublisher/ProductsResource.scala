package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.ProductId
import typings.maximMazurokGapiClientAndroidpublisher.anon.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends StObject {
  
  /** Acknowledges a purchase of an inapp item. */
  def acknowledge(request: ProductId): Request[Unit] = js.native
  def acknowledge(request: Token, body: ProductPurchasesAcknowledgeRequest): Request[Unit] = js.native
  
  /** Checks the purchase and consumption status of an inapp item. */
  def get(): Request[ProductPurchase] = js.native
  def get(request: Token): Request[ProductPurchase] = js.native
}
