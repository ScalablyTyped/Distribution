package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListToolbarItem extends StObject {
  
  var click: js.UndefOr[js.Function] = js.native
  
  var imageClass: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object TreeListToolbarItem {
  
  @scala.inline
  def apply(): TreeListToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListToolbarItem]
  }
  
  @scala.inline
  implicit class TreeListToolbarItemMutableBuilder[Self <: TreeListToolbarItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
