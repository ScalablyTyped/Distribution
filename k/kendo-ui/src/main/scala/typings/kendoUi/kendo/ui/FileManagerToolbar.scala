package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerToolbar extends StObject {
  
  var items: js.UndefOr[js.Array[FileManagerToolbarItem]] = js.undefined
}
object FileManagerToolbar {
  
  inline def apply(): FileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerToolbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileManagerToolbar] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[FileManagerToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FileManagerToolbarItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
