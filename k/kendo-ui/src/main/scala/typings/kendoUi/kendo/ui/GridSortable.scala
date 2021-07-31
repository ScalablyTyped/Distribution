package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridSortable extends StObject {
  
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
  
  var initialDirection: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var showIndexes: js.UndefOr[Boolean] = js.undefined
}
object GridSortable {
  
  @scala.inline
  def apply(): GridSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSortable]
  }
  
  @scala.inline
  implicit class GridSortableMutableBuilder[Self <: GridSortable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnsort(value: Boolean): Self = StObject.set(x, "allowUnsort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnsortUndefined: Self = StObject.set(x, "allowUnsort", js.undefined)
    
    @scala.inline
    def setInitialDirection(value: String): Self = StObject.set(x, "initialDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDirectionUndefined: Self = StObject.set(x, "initialDirection", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setShowIndexes(value: Boolean): Self = StObject.set(x, "showIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIndexesUndefined: Self = StObject.set(x, "showIndexes", js.undefined)
  }
}
