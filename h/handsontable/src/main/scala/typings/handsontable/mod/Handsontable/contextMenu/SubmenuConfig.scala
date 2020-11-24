package typings.handsontable.mod.Handsontable.contextMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmenuConfig extends js.Object {
  
  var items: js.Array[SubmenuItemConfig] = js.native
}
object SubmenuConfig {
  
  @scala.inline
  def apply(items: js.Array[SubmenuItemConfig]): SubmenuConfig = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmenuConfig]
  }
  
  @scala.inline
  implicit class SubmenuConfigOps[Self <: SubmenuConfig] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: SubmenuItemConfig*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SubmenuItemConfig]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
