package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleMod {
  
  trait Module extends StObject {
    
    var directory: String
    
    var name: String
  }
  object Module {
    
    inline def apply(directory: String, name: String): Module = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
