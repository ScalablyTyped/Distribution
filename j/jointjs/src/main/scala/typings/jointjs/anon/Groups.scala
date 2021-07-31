package typings.jointjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Element.Port
import typings.jointjs.mod.dia.Element.PortGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: js.UndefOr[StringDictionary[PortGroup]] = js.undefined
  
  var items: js.UndefOr[js.Array[Port]] = js.undefined
}
object Groups {
  
  @scala.inline
  def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: StringDictionary[PortGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Port]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Port*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
