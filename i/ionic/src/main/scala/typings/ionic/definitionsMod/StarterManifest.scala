package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StarterManifest extends StObject {
  
  var baseref: String
  
  var name: String
  
  var welcome: js.UndefOr[String] = js.undefined
}
object StarterManifest {
  
  inline def apply(baseref: String, name: String): StarterManifest = {
    val __obj = js.Dynamic.literal(baseref = baseref.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterManifest]
  }
  
  extension [Self <: StarterManifest](x: Self) {
    
    inline def setBaseref(value: String): Self = StObject.set(x, "baseref", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWelcome(value: String): Self = StObject.set(x, "welcome", value.asInstanceOf[js.Any])
    
    inline def setWelcomeUndefined: Self = StObject.set(x, "welcome", js.undefined)
  }
}
