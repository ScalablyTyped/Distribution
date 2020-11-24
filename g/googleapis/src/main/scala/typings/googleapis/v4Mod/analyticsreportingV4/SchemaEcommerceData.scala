package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * E-commerce details associated with the user activity.
  */
@js.native
trait SchemaEcommerceData extends js.Object {
  
  /**
    * Action associated with this e-commerce action.
    */
  var actionType: js.UndefOr[String] = js.native
  
  /**
    * The type of this e-commerce activity.
    */
  var ecommerceType: js.UndefOr[String] = js.native
  
  /**
    * Details of the products in this transaction.
    */
  var products: js.UndefOr[js.Array[SchemaProductData]] = js.native
  
  /**
    * Transaction details of this e-commerce action.
    */
  var transaction: js.UndefOr[SchemaTransactionData] = js.native
}
object SchemaEcommerceData {
  
  @scala.inline
  def apply(): SchemaEcommerceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEcommerceData]
  }
  
  @scala.inline
  implicit class SchemaEcommerceDataOps[Self <: SchemaEcommerceData] (val x: Self) extends AnyVal {
    
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
    def setActionType(value: String): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setEcommerceType(value: String): Self = this.set("ecommerceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcommerceType: Self = this.set("ecommerceType", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: SchemaProductData*): Self = this.set("products", js.Array(value :_*))
    
    @scala.inline
    def setProducts(value: js.Array[SchemaProductData]): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    
    @scala.inline
    def setTransaction(value: SchemaTransactionData): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
