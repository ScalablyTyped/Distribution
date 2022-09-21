package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDefinition extends StObject {
  
  var directory: String
  
  var main: Any
  
  var options: Any
}
object ExtensionDefinition {
  
  inline def apply(directory: String, main: Any, options: Any): ExtensionDefinition = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDefinition]
  }
  
  extension [Self <: ExtensionDefinition](x: Self) {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setMain(value: Any): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
