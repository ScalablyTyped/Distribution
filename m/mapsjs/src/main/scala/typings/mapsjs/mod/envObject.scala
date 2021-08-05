package typings.mapsjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait envObject extends StObject {
  
  /**
    * @returns {number} maxX coord as integer
    */
  var maxX: Double
  
  /**
    * @returns {number} maxY coord as integer
    */
  var maxY: Double
  
  /**
    * @returns {number} minX as integer
    */
  var minX: Double
  
  /**
    * @returns {number} minY coord as integer
    */
  var minY: Double
}
object envObject {
  
  inline def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): envObject = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[envObject]
  }
  
  extension [Self <: envObject](x: Self) {
    
    inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
  }
}
