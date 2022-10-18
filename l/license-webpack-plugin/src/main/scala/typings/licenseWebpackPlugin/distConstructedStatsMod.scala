package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConstructedStatsMod {
  
  trait ConstructedStats extends StObject {
    
    var errors: Boolean
    
    var warnings: Boolean
  }
  object ConstructedStats {
    
    inline def apply(errors: Boolean, warnings: Boolean): ConstructedStats = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructedStats]
    }
    
    extension [Self <: ConstructedStats](x: Self) {
      
      inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    }
  }
}
