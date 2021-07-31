package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingBox extends StObject {
  
  var east: Double
  
  var north: Double
  
  var south: Double
  
  var west: Double
}
object BoundingBox {
  
  @scala.inline
  def apply(east: Double, north: Double, south: Double, west: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
  
  @scala.inline
  implicit class BoundingBoxMutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEast(value: Double): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorth(value: Double): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouth(value: Double): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWest(value: Double): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
  }
}
