package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BBoxObject
  extends StObject
     with PositionObject {
  
  /**
    * Height of the bounding box.
    */
  var height: Double
  
  /**
    * Width of the bounding box.
    */
  var width: Double
}
object BBoxObject {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): BBoxObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBoxObject]
  }
  
  @scala.inline
  implicit class BBoxObjectMutableBuilder[Self <: BBoxObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
