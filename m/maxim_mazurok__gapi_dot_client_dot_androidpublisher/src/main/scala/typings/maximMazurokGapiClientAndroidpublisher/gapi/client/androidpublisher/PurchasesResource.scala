package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchasesResource extends StObject {
  
  var products: ProductsResource = js.native
  
  var subscriptions: SubscriptionsResource = js.native
  
  var voidedpurchases: VoidedpurchasesResource = js.native
}
object PurchasesResource {
  
  @scala.inline
  def apply(
    products: ProductsResource,
    subscriptions: SubscriptionsResource,
    voidedpurchases: VoidedpurchasesResource
  ): PurchasesResource = {
    val __obj = js.Dynamic.literal(products = products.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], voidedpurchases = voidedpurchases.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasesResource]
  }
  
  @scala.inline
  implicit class PurchasesResourceMutableBuilder[Self <: PurchasesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProducts(value: ProductsResource): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptions(value: SubscriptionsResource): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoidedpurchases(value: VoidedpurchasesResource): Self = StObject.set(x, "voidedpurchases", value.asInstanceOf[js.Any])
  }
}
