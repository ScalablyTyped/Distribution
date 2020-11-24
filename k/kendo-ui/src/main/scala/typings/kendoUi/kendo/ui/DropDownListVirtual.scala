package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownListVirtual extends js.Object {
  
  var itemHeight: js.UndefOr[Double] = js.native
  
  var mapValueTo: js.UndefOr[String] = js.native
  
  var valueMapper: js.UndefOr[js.Function] = js.native
}
object DropDownListVirtual {
  
  @scala.inline
  def apply(): DropDownListVirtual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownListVirtual]
  }
  
  @scala.inline
  implicit class DropDownListVirtualOps[Self <: DropDownListVirtual] (val x: Self) extends AnyVal {
    
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
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setMapValueTo(value: String): Self = this.set("mapValueTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapValueTo: Self = this.set("mapValueTo", js.undefined)
    
    @scala.inline
    def setValueMapper(value: js.Function): Self = this.set("valueMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMapper: Self = this.set("valueMapper", js.undefined)
  }
}
