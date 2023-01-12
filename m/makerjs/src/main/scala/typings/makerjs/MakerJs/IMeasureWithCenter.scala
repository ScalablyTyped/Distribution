package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A measurement of extents, with a center point.
  */
trait IMeasureWithCenter
  extends StObject
     with IMeasure {
  
  /**
    * The center point of the rectangle containing the item being measured.
    */
  var center: IPoint
  
  /**
    * The height of the rectangle containing the item being measured.
    */
  var height: Double
  
  /**
    * The width of the rectangle containing the item being measured.
    */
  var width: Double
}
object IMeasureWithCenter {
  
  inline def apply(center: IPoint, height: Double, high: IPoint, low: IPoint, width: Double): IMeasureWithCenter = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeasureWithCenter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMeasureWithCenter] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: IPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
