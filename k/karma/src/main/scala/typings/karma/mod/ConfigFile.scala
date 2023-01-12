package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFile extends StObject {
  
  var configFile: String
}
object ConfigFile {
  
  inline def apply(configFile: String): ConfigFile = {
    val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigFile] (val x: Self) extends AnyVal {
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
  }
}
