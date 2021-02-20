package typings.leafletUtm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Band extends StObject {
    
    var band: String = js.native
    
    var southHemi: Boolean = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var zone: Double = js.native
  }
  object Band {
    
    @scala.inline
    def apply(band: String, southHemi: Boolean, x: Double, y: Double, zone: Double): Band = {
      val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], southHemi = southHemi.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
      __obj.asInstanceOf[Band]
    }
    
    @scala.inline
    implicit class BandMutableBuilder[Self <: Band] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBand(value: String): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouthHemi(value: Boolean): Self = StObject.set(x, "southHemi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZone(value: Double): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    }
  }
}
