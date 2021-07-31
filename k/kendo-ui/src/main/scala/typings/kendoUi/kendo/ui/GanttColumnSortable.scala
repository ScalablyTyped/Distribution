package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttColumnSortable extends StObject {
  
  var compare: js.UndefOr[js.Function] = js.undefined
}
object GanttColumnSortable {
  
  @scala.inline
  def apply(): GanttColumnSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttColumnSortable]
  }
  
  @scala.inline
  implicit class GanttColumnSortableMutableBuilder[Self <: GanttColumnSortable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompare(value: js.Function): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
  }
}
