package typings.leafletFullscreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait False extends StObject {
    
    var `false`: String
    
    var `true`: String
  }
  object False {
    
    inline def apply(`false`: String, `true`: String): False = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
      __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
      __obj.asInstanceOf[False]
    }
    
    extension [Self <: False](x: Self) {
      
      inline def setFalse(value: String): Self = StObject.set(x, "false", value.asInstanceOf[js.Any])
      
      inline def setTrue(value: String): Self = StObject.set(x, "true", value.asInstanceOf[js.Any])
    }
  }
}
