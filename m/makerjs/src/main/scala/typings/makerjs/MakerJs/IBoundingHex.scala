package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A hexagon which surrounds a model.
  */
trait IBoundingHex
  extends StObject
     with IModel {
  
  /**
    * Radius of the hexagon, which is also the length of a side.
    */
  var radius: Double
}
object IBoundingHex {
  
  inline def apply(radius: Double): IBoundingHex = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBoundingHex]
  }
  
  extension [Self <: IBoundingHex](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
