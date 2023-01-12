package typings.leafletUtm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Band extends StObject {
    
    var band: String
    
    var southHemi: Boolean
    
    var x: Double
    
    var y: Double
    
    var zone: Double
  }
  object Band {
    
    inline def apply(band: String, southHemi: Boolean, x: Double, y: Double, zone: Double): Band = {
      val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], southHemi = southHemi.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
      __obj.asInstanceOf[Band]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Band] (val x: Self) extends AnyVal {
      
      inline def setBand(value: String): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
      
      inline def setSouthHemi(value: Boolean): Self = StObject.set(x, "southHemi", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZone(value: Double): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    }
  }
}
