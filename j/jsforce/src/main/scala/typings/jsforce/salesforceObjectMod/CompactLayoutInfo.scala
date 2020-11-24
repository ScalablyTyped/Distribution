package typings.jsforce.salesforceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompactLayoutInfo extends js.Object {
  
  var compactLayouts: js.Array[js.Object] = js.native
  
  var defaultCompactLayoutId: String = js.native
  
  var recordTypeCompactLayoutMappings: js.Array[js.Object] = js.native
}
object CompactLayoutInfo {
  
  @scala.inline
  def apply(
    compactLayouts: js.Array[js.Object],
    defaultCompactLayoutId: String,
    recordTypeCompactLayoutMappings: js.Array[js.Object]
  ): CompactLayoutInfo = {
    val __obj = js.Dynamic.literal(compactLayouts = compactLayouts.asInstanceOf[js.Any], defaultCompactLayoutId = defaultCompactLayoutId.asInstanceOf[js.Any], recordTypeCompactLayoutMappings = recordTypeCompactLayoutMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactLayoutInfo]
  }
  
  @scala.inline
  implicit class CompactLayoutInfoOps[Self <: CompactLayoutInfo] (val x: Self) extends AnyVal {
    
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
    def setCompactLayoutsVarargs(value: js.Object*): Self = this.set("compactLayouts", js.Array(value :_*))
    
    @scala.inline
    def setCompactLayouts(value: js.Array[js.Object]): Self = this.set("compactLayouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCompactLayoutId(value: String): Self = this.set("defaultCompactLayoutId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTypeCompactLayoutMappingsVarargs(value: js.Object*): Self = this.set("recordTypeCompactLayoutMappings", js.Array(value :_*))
    
    @scala.inline
    def setRecordTypeCompactLayoutMappings(value: js.Array[js.Object]): Self = this.set("recordTypeCompactLayoutMappings", value.asInstanceOf[js.Any])
  }
}
