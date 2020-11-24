package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaEditAllOrderDealsResponse extends js.Object {
  
  /**
    * List of all deals in the proposal after edit.
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.native
  
  /**
    * The latest revision number after the update has been applied.
    */
  var orderRevisionNumber: js.UndefOr[String] = js.native
}
object SchemaEditAllOrderDealsResponse {
  
  @scala.inline
  def apply(): SchemaEditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditAllOrderDealsResponse]
  }
  
  @scala.inline
  implicit class SchemaEditAllOrderDealsResponseOps[Self <: SchemaEditAllOrderDealsResponse] (val x: Self) extends AnyVal {
    
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
    def setDealsVarargs(value: SchemaMarketplaceDeal*): Self = this.set("deals", js.Array(value :_*))
    
    @scala.inline
    def setDeals(value: js.Array[SchemaMarketplaceDeal]): Self = this.set("deals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeals: Self = this.set("deals", js.undefined)
    
    @scala.inline
    def setOrderRevisionNumber(value: String): Self = this.set("orderRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderRevisionNumber: Self = this.set("orderRevisionNumber", js.undefined)
  }
}
