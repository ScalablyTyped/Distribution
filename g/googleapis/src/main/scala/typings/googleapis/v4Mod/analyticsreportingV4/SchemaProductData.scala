package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of the products in an e-commerce transaction.
  */
@js.native
trait SchemaProductData extends js.Object {
  
  /**
    * The total revenue from purchased product items.
    */
  var itemRevenue: js.UndefOr[Double] = js.native
  
  /**
    * The product name, supplied by the e-commerce tracking application, for
    * the purchased items.
    */
  var productName: js.UndefOr[String] = js.native
  
  /**
    * Total number of this product units in the transaction.
    */
  var productQuantity: js.UndefOr[String] = js.native
  
  /**
    * Unique code that represents the product.
    */
  var productSku: js.UndefOr[String] = js.native
}
object SchemaProductData {
  
  @scala.inline
  def apply(): SchemaProductData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductData]
  }
  
  @scala.inline
  implicit class SchemaProductDataOps[Self <: SchemaProductData] (val x: Self) extends AnyVal {
    
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
    def setItemRevenue(value: Double): Self = this.set("itemRevenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemRevenue: Self = this.set("itemRevenue", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    
    @scala.inline
    def setProductQuantity(value: String): Self = this.set("productQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductQuantity: Self = this.set("productQuantity", js.undefined)
    
    @scala.inline
    def setProductSku(value: String): Self = this.set("productSku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductSku: Self = this.set("productSku", js.undefined)
  }
}
