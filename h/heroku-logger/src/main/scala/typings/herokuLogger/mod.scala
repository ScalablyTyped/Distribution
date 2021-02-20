package typings.herokuLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("heroku-logger", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(config: LoggerConfig) = this()
    
    def debug(message: String): Unit = js.native
    def debug(message: String, data: js.Object): Unit = js.native
    
    def error(message: String): Unit = js.native
    def error(message: String, data: js.Object): Unit = js.native
    
    def fatal(message: String): Unit = js.native
    def fatal(message: String, data: js.Object): Unit = js.native
    
    def info(message: String): Unit = js.native
    def info(message: String, data: js.Object): Unit = js.native
    
    def trace(message: String): Unit = js.native
    def trace(message: String, data: js.Object): Unit = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: String, data: js.Object): Unit = js.native
  }
  
  @JSImport("heroku-logger", "debug")
  @js.native
  def debug(message: String): Unit = js.native
  @JSImport("heroku-logger", "debug")
  @js.native
  def debug(message: String, data: js.Object): Unit = js.native
  
  @JSImport("heroku-logger", "error")
  @js.native
  def error(message: String): Unit = js.native
  @JSImport("heroku-logger", "error")
  @js.native
  def error(message: String, data: js.Object): Unit = js.native
  
  @JSImport("heroku-logger", "fatal")
  @js.native
  def fatal(message: String): Unit = js.native
  @JSImport("heroku-logger", "fatal")
  @js.native
  def fatal(message: String, data: js.Object): Unit = js.native
  
  @JSImport("heroku-logger", "info")
  @js.native
  def info(message: String): Unit = js.native
  @JSImport("heroku-logger", "info")
  @js.native
  def info(message: String, data: js.Object): Unit = js.native
  
  @JSImport("heroku-logger", "trace")
  @js.native
  def trace(message: String): Unit = js.native
  @JSImport("heroku-logger", "trace")
  @js.native
  def trace(message: String, data: js.Object): Unit = js.native
  
  @JSImport("heroku-logger", "warn")
  @js.native
  def warn(message: String): Unit = js.native
  @JSImport("heroku-logger", "warn")
  @js.native
  def warn(message: String, data: js.Object): Unit = js.native
  
  @js.native
  trait LoggerConfig extends StObject {
    
    var color: js.UndefOr[Boolean] = js.native
    
    var level: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var readable: js.UndefOr[Boolean] = js.native
  }
  object LoggerConfig {
    
    @scala.inline
    def apply(): LoggerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerConfig]
    }
    
    @scala.inline
    implicit class LoggerConfigMutableBuilder[Self <: LoggerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    }
  }
}
