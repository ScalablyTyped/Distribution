package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchasesResource extends js.Object {
  
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
  implicit class PurchasesResourceOps[Self <: PurchasesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProducts(value: ProductsResource): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptions(value: SubscriptionsResource): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoidedpurchases(value: VoidedpurchasesResource): Self = this.set("voidedpurchases", value.asInstanceOf[js.Any])
  }
}
