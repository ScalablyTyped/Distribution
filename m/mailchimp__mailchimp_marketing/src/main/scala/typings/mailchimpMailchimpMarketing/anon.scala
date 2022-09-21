package typings.mailchimpMailchimpMarketing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enabled extends StObject {
    
    var enabled: Boolean
    
    var marketing_permission_id: String
  }
  object Enabled {
    
    inline def apply(enabled: Boolean, marketing_permission_id: String): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], marketing_permission_id = marketing_permission_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setMarketing_permission_id(value: String): Self = StObject.set(x, "marketing_permission_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Latitude extends StObject {
    
    var latitude: Double
    
    var logitude: Double
  }
  object Latitude {
    
    inline def apply(latitude: Double, logitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], logitude = logitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    extension [Self <: Latitude](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLogitude(value: Double): Self = StObject.set(x, "logitude", value.asInstanceOf[js.Any])
    }
  }
}
