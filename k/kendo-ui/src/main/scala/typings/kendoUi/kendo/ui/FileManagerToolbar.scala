package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerToolbar extends StObject {
  
  var items: js.UndefOr[js.Array[FileManagerToolbarItem]] = js.native
}
object FileManagerToolbar {
  
  @scala.inline
  def apply(): FileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerToolbar]
  }
  
  @scala.inline
  implicit class FileManagerToolbarMutableBuilder[Self <: FileManagerToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[FileManagerToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: FileManagerToolbarItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
