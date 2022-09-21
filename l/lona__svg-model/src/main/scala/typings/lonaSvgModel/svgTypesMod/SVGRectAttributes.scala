package typings.lonaSvgModel.svgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGRectAttributes
  extends StObject
     with SVGBaseAttributes {
  
  var height: Double
  
  var rx: Double
  
  var ry: Double
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object SVGRectAttributes {
  
  inline def apply(height: Double, rx: Double, ry: Double, width: Double, x: Double, y: Double): SVGRectAttributes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGRectAttributes]
  }
  
  extension [Self <: SVGRectAttributes](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
