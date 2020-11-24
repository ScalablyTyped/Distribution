package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItem extends js.Object {
  
  var lineItem: String = js.native
  
  var lineItems: String = js.native
  
  var scope: js.Array[String] = js.native
}
object LineItem {
  
  @scala.inline
  def apply(lineItem: String, lineItems: String, scope: js.Array[String]): LineItem = {
    val __obj = js.Dynamic.literal(lineItem = lineItem.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItem]
  }
  
  @scala.inline
  implicit class LineItemOps[Self <: LineItem] (val x: Self) extends AnyVal {
    
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
    def setLineItem(value: String): Self = this.set("lineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItems(value: String): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
}
