package typings.jqueryFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistData extends js.Object {
  
  var active: String | Null = js.native
  
  var expanded: js.Array[String] = js.native
  
  var focus: String | Null = js.native
  
  var selected: js.Array[String] = js.native
}
object PersistData {
  
  @scala.inline
  def apply(expanded: js.Array[String], selected: js.Array[String]): PersistData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistData]
  }
  
  @scala.inline
  implicit class PersistDataOps[Self <: PersistData] (val x: Self) extends AnyVal {
    
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
    def setExpandedVarargs(value: String*): Self = this.set("expanded", js.Array(value :_*))
    
    @scala.inline
    def setExpanded(value: js.Array[String]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedVarargs(value: String*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[String]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveNull: Self = this.set("active", null)
    
    @scala.inline
    def setFocus(value: String): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusNull: Self = this.set("focus", null)
  }
}
