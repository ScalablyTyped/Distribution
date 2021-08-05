package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerContextMenu extends StObject {
  
  var items: js.UndefOr[js.Array[FileManagerContextMenuItem]] = js.undefined
}
object FileManagerContextMenu {
  
  inline def apply(): FileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerContextMenu]
  }
  
  extension [Self <: FileManagerContextMenu](x: Self) {
    
    inline def setItems(value: js.Array[FileManagerContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FileManagerContextMenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
