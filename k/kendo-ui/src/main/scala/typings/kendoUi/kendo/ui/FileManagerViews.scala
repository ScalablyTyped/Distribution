package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerViews extends StObject {
  
  var grid: js.UndefOr[js.Any] = js.undefined
  
  var list: js.UndefOr[js.Any] = js.undefined
  
  var tree: js.UndefOr[js.Any] = js.undefined
}
object FileManagerViews {
  
  @scala.inline
  def apply(): FileManagerViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerViews]
  }
  
  @scala.inline
  implicit class FileManagerViewsMutableBuilder[Self <: FileManagerViews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setList(value: js.Any): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setTree(value: js.Any): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
  }
}
