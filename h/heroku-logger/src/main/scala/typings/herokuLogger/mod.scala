package typings.herokuLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("heroku-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def debug(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def debug(message: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def error(message: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fatal(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def fatal(message: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def info(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def info(message: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def trace(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trace(message: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def warn(message: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait LoggerConfig extends StObject {
    
    var color: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
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
