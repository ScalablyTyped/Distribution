package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartYAxisItemNotesDataItemIconBorder extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ChartYAxisItemNotesDataItemIconBorder {
  
  @scala.inline
  def apply(): ChartYAxisItemNotesDataItemIconBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartYAxisItemNotesDataItemIconBorder]
  }
  
  @scala.inline
  implicit class ChartYAxisItemNotesDataItemIconBorderMutableBuilder[Self <: ChartYAxisItemNotesDataItemIconBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
