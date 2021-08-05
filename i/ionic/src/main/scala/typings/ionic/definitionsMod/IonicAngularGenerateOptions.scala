package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonicAngularGenerateOptions
  extends StObject
     with GenerateOptions {
  
  var constants: Boolean
  
  var module: Boolean
}
object IonicAngularGenerateOptions {
  
  inline def apply(constants: Boolean, module: Boolean, name: String, `type`: String): IonicAngularGenerateOptions = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicAngularGenerateOptions]
  }
  
  extension [Self <: IonicAngularGenerateOptions](x: Self) {
    
    inline def setConstants(value: Boolean): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
