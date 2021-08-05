package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigPath extends StObject {
  
  val configPath: String
}
object ConfigPath {
  
  inline def apply(configPath: String): ConfigPath = {
    val __obj = js.Dynamic.literal(configPath = configPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigPath]
  }
  
  extension [Self <: ConfigPath](x: Self) {
    
    inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
  }
}
