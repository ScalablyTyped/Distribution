package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.AccesstokenAllowMissing
import typings.maximMazurokGapiClientAndroidpublisher.anon.AllowMissing
import typings.maximMazurokGapiClientAndroidpublisher.anon.AltAutoConvertMissingPrices
import typings.maximMazurokGapiClientAndroidpublisher.anon.AutoConvertMissingPrices
import typings.maximMazurokGapiClientAndroidpublisher.anon.AutoConvertMissingPricesCallback
import typings.maximMazurokGapiClientAndroidpublisher.anon.CallbackFields
import typings.maximMazurokGapiClientAndroidpublisher.anon.MaxResults
import typings.maximMazurokGapiClientAndroidpublisher.anon.Sku
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InappproductsResource extends StObject {
  
  /** Deletes an in-app product (i.e. a managed product or a subscriptions). */
  def delete(): Request[Unit] = js.native
  def delete(request: Sku): Request[Unit] = js.native
  
  /** Gets an in-app product, which can be a managed product or a subscription. */
  def get(): Request[InAppProduct] = js.native
  def get(request: Sku): Request[InAppProduct] = js.native
  
  def insert(request: AltAutoConvertMissingPrices, body: InAppProduct): Request[InAppProduct] = js.native
  /** Creates an in-app product (i.e. a managed product or a subscriptions). */
  def insert(request: AutoConvertMissingPrices): Request[InAppProduct] = js.native
  
  /**
    * Lists all in-app products - both managed products and subscriptions. If an app has a large number of in-app products, the response may be paginated. In this case the response field
    * `tokenPagination.nextPageToken` will be set and the caller should provide its value as a `token` request parameter to retrieve the next page.
    */
  def list(): Request[InappproductsListResponse] = js.native
  def list(request: MaxResults): Request[InappproductsListResponse] = js.native
  
  /** Patches an in-app product (i.e. a managed product or a subscriptions). */
  def patch(request: AutoConvertMissingPricesCallback): Request[InAppProduct] = js.native
  def patch(request: CallbackFields, body: InAppProduct): Request[InAppProduct] = js.native
  
  def update(request: AccesstokenAllowMissing, body: InAppProduct): Request[InAppProduct] = js.native
  /** Updates an in-app product (i.e. a managed product or a subscriptions). */
  def update(request: AllowMissing): Request[InAppProduct] = js.native
}
