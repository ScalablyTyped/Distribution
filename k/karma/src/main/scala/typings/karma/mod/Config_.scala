package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config_ extends StObject {
  
  var LOG_DEBUG: String = js.native
  
  var LOG_DISABLE: String = js.native
  
  var LOG_ERROR: String = js.native
  
  var LOG_INFO: String = js.native
  
  var LOG_WARN: String = js.native
  
  def set(config: ConfigOptions): Unit = js.native
}
object Config_ {
  
  @scala.inline
  def apply(
    LOG_DEBUG: String,
    LOG_DISABLE: String,
    LOG_ERROR: String,
    LOG_INFO: String,
    LOG_WARN: String,
    set: ConfigOptions => Unit
  ): Config_ = {
    val __obj = js.Dynamic.literal(LOG_DEBUG = LOG_DEBUG.asInstanceOf[js.Any], LOG_DISABLE = LOG_DISABLE.asInstanceOf[js.Any], LOG_ERROR = LOG_ERROR.asInstanceOf[js.Any], LOG_INFO = LOG_INFO.asInstanceOf[js.Any], LOG_WARN = LOG_WARN.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Config_]
  }
  
  @scala.inline
  implicit class Config_MutableBuilder[Self <: Config_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLOG_DEBUG(value: String): Self = StObject.set(x, "LOG_DEBUG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG_DISABLE(value: String): Self = StObject.set(x, "LOG_DISABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG_ERROR(value: String): Self = StObject.set(x, "LOG_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG_INFO(value: String): Self = StObject.set(x, "LOG_INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG_WARN(value: String): Self = StObject.set(x, "LOG_WARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: ConfigOptions => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
