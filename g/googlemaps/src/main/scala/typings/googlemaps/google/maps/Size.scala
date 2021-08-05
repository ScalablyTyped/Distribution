package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size Maps JavaScript API}
  */
trait Size extends StObject {
  
  /**
    * Compares two Sizes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size.equals Maps JavaScript API}
    */
  def equals(other: Size): Boolean
  
  /**
    * The height along the y-axis, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size.height Maps JavaScript API}
    */
  var height: Double
  
  /**
    * The width along the x-axis, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size.width Maps JavaScript API}
    */
  var width: Double
}
object Size {
  
  inline def apply(equals_ : Size => Boolean, height: Double, width: Double): Size = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setEquals_(value: Size => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
