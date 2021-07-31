package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistData extends StObject {
  
  var active: String | Null
  
  var expanded: js.Array[String]
  
  var focus: String | Null
  
  var selected: js.Array[String]
}
object PersistData {
  
  @scala.inline
  def apply(expanded: js.Array[String], selected: js.Array[String]): PersistData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], active = null, focus = null)
    __obj.asInstanceOf[PersistData]
  }
  
  @scala.inline
  implicit class PersistDataMutableBuilder[Self <: PersistData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveNull: Self = StObject.set(x, "active", null)
    
    @scala.inline
    def setExpanded(value: js.Array[String]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedVarargs(value: String*): Self = StObject.set(x, "expanded", js.Array(value :_*))
    
    @scala.inline
    def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusNull: Self = StObject.set(x, "focus", null)
    
    @scala.inline
    def setSelected(value: js.Array[String]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedVarargs(value: String*): Self = StObject.set(x, "selected", js.Array(value :_*))
  }
}
