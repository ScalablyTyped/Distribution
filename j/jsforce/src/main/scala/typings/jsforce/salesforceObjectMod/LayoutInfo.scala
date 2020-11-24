package typings.jsforce.salesforceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutInfo extends js.Object {
  
  var layouts: js.Array[js.Object] = js.native
  
  var recordTypeMappings: js.Array[js.Object] = js.native
}
object LayoutInfo {
  
  @scala.inline
  def apply(layouts: js.Array[js.Object], recordTypeMappings: js.Array[js.Object]): LayoutInfo = {
    val __obj = js.Dynamic.literal(layouts = layouts.asInstanceOf[js.Any], recordTypeMappings = recordTypeMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutInfo]
  }
  
  @scala.inline
  implicit class LayoutInfoOps[Self <: LayoutInfo] (val x: Self) extends AnyVal {
    
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
    def setLayoutsVarargs(value: js.Object*): Self = this.set("layouts", js.Array(value :_*))
    
    @scala.inline
    def setLayouts(value: js.Array[js.Object]): Self = this.set("layouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTypeMappingsVarargs(value: js.Object*): Self = this.set("recordTypeMappings", js.Array(value :_*))
    
    @scala.inline
    def setRecordTypeMappings(value: js.Array[js.Object]): Self = this.set("recordTypeMappings", value.asInstanceOf[js.Any])
  }
}
