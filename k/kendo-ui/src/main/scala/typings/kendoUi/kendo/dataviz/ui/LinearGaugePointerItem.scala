package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGaugePointerItem extends StObject {
  
  var border: js.UndefOr[LinearGaugePointerItemBorder] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var margin: js.UndefOr[Double | Any] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var shape: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var track: js.UndefOr[LinearGaugePointerItemTrack] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object LinearGaugePointerItem {
  
  inline def apply(): LinearGaugePointerItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugePointerItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinearGaugePointerItem] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: LinearGaugePointerItemBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setMargin(value: Double | Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTrack(value: LinearGaugePointerItemTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
