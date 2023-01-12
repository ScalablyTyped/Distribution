package typings.kakaomaps.kakao.maps.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleOptions extends StObject {
  
  var draggable: Boolean
  
  var editable: Boolean
  
  var fillColor: String
  
  var fillOpacity: Double
  
  var removable: Boolean
  
  var strokeColor: String
  
  var strokeOpacity: Double
  
  var strokeStyle: String
  
  var strokeWeight: Double
}
object CircleOptions {
  
  inline def apply(
    draggable: Boolean,
    editable: Boolean,
    fillColor: String,
    fillOpacity: Double,
    removable: Boolean,
    strokeColor: String,
    strokeOpacity: Double,
    strokeStyle: String,
    strokeWeight: Double
  ): CircleOptions = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], removable = removable.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleOptions] (val x: Self) extends AnyVal {
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
  }
}
