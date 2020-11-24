package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer.anon.OauthtokenPqlQuery
import typings.maximMazurokGapiClientAdexchangebuyer.anon.ProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends js.Object {
  
  /** Gets the requested product by id. */
  def get(): Request[Product] = js.native
  def get(request: ProductId): Request[Product] = js.native
  
  /** Gets the requested product. */
  def search(): Request[GetOffersResponse] = js.native
  def search(request: OauthtokenPqlQuery): Request[GetOffersResponse] = js.native
}
