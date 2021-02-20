package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result object of a map transformation.
  */
@js.native
trait MapCoordinateObject extends StObject {
  
  /**
    * X coordinate on the map.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate on the map.
    */
  var y: Double | Null = js.native
}
object MapCoordinateObject {
  
  @scala.inline
  def apply(x: Double): MapCoordinateObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapCoordinateObject]
  }
  
  @scala.inline
  implicit class MapCoordinateObjectMutableBuilder[Self <: MapCoordinateObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = StObject.set(x, "y", null)
  }
}
