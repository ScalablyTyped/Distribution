package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.AccountIdAlt
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.ProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends StObject {
  
  /** Gets the requested product by ID. */
  def get(): Request[Product] = js.native
  def get(request: ProductId): Request[Product] = js.native
  
  /** List all products visible to the buyer (optionally filtered by the specified PQL query). */
  def list(): Request[ListProductsResponse] = js.native
  def list(request: AccountIdAlt): Request[ListProductsResponse] = js.native
}
