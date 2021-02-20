package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A toolbar item.
  */
@js.native
trait IToolbarItem extends StObject {
  
  var name: String = js.native
  
  var widget: Widget = js.native
}
object IToolbarItem {
  
  @scala.inline
  def apply(name: String, widget: Widget): IToolbarItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToolbarItem]
  }
  
  @scala.inline
  implicit class IToolbarItemMutableBuilder[Self <: IToolbarItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidget(value: Widget): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
  }
}
