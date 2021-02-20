package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductSet extends StObject {
  
  /** The list of product IDs making up the set of products. */
  var productId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The interpretation of this product set. "unknown" should never be sent and is ignored if received. "whitelist" means that the user is entitled to access the product set.
    * "includeAll" means that all products are accessible, including products that are approved, products with revoked approval, and products that have never been approved. "allApproved"
    * means that the user is entitled to access all products that are approved for the enterprise. If the value is "allApproved" or "includeAll", the productId field is ignored. If no
    * value is provided, it is interpreted as "whitelist" for backwards compatibility. Further "allApproved" or "includeAll" does not enable automatic visibility of "alpha" or "beta"
    * tracks for Android app. Use ProductVisibility to enable "alpha" or "beta" tracks per user.
    */
  var productSetBehavior: js.UndefOr[String] = js.native
  
  /**
    * Additional list of product IDs making up the product set. Unlike the productID array, in this list It's possible to specify which tracks (alpha, beta, production) of a product are
    * visible to the user. See ProductVisibility and its fields for more information. Specifying the same product ID both here and in the productId array is not allowed and it will result
    * in an error.
    */
  var productVisibility: js.UndefOr[js.Array[ProductVisibility]] = js.native
}
object ProductSet {
  
  @scala.inline
  def apply(): ProductSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSet]
  }
  
  @scala.inline
  implicit class ProductSetMutableBuilder[Self <: ProductSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductId(value: js.Array[String]): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProductIdVarargs(value: String*): Self = StObject.set(x, "productId", js.Array(value :_*))
    
    @scala.inline
    def setProductSetBehavior(value: String): Self = StObject.set(x, "productSetBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSetBehaviorUndefined: Self = StObject.set(x, "productSetBehavior", js.undefined)
    
    @scala.inline
    def setProductVisibility(value: js.Array[ProductVisibility]): Self = StObject.set(x, "productVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductVisibilityUndefined: Self = StObject.set(x, "productVisibility", js.undefined)
    
    @scala.inline
    def setProductVisibilityVarargs(value: ProductVisibility*): Self = StObject.set(x, "productVisibility", js.Array(value :_*))
  }
}
