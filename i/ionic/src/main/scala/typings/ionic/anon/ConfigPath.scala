package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigPath extends StObject {
  
  val configPath: String
}
object ConfigPath {
  
  @scala.inline
  def apply(configPath: String): ConfigPath = {
    val __obj = js.Dynamic.literal(configPath = configPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigPath]
  }
  
  @scala.inline
  implicit class ConfigPathMutableBuilder[Self <: ConfigPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
  }
}
