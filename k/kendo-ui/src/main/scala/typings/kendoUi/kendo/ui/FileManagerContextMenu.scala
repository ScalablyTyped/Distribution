package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerContextMenu extends StObject {
  
  var items: js.UndefOr[js.Array[FileManagerContextMenuItem]] = js.native
}
object FileManagerContextMenu {
  
  @scala.inline
  def apply(): FileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerContextMenu]
  }
  
  @scala.inline
  implicit class FileManagerContextMenuMutableBuilder[Self <: FileManagerContextMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[FileManagerContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: FileManagerContextMenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
