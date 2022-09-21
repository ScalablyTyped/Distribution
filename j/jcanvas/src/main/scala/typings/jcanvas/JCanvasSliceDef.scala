package typings.jcanvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JCanvasSliceDef extends StObject {
  
  /**
    * End angle in degrees from north
    */
  var end: Double
  
  var fillStyle: String
  
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  var layer: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Radius in pixels
    */
  var radius: Double
  
  /**
    * Distance between slices as a fraction of the radius
    */
  var spread: js.UndefOr[Double] = js.undefined
  
  /**
    * Start angle in degrees from north
    */
  var start: Double
  
  var x: Double
  
  var y: Double
}
object JCanvasSliceDef {
  
  inline def apply(end: Double, fillStyle: String, radius: Double, start: Double, x: Double, y: Double): JCanvasSliceDef = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fillStyle = fillStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JCanvasSliceDef]
  }
  
  extension [Self <: JCanvasSliceDef](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setLayer(value: Boolean): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
