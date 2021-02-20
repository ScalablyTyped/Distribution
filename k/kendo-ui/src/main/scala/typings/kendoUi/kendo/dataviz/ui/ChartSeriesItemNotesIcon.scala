package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemNotesIcon extends StObject {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[ChartSeriesItemNotesIconBorder] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ChartSeriesItemNotesIcon {
  
  @scala.inline
  def apply(): ChartSeriesItemNotesIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemNotesIcon]
  }
  
  @scala.inline
  implicit class ChartSeriesItemNotesIconMutableBuilder[Self <: ChartSeriesItemNotesIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: ChartSeriesItemNotesIconBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
