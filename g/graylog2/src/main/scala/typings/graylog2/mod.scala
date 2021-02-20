package typings.graylog2

import typings.graylog2.anon.FnCall
import typings.graylog2.anon.ReadonlyGraylogConfig
import typings.graylog2.anon.Readonlyhoststringportnum
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graylog2", "graylog")
  @js.native
  class graylog protected () extends EventEmitter {
    def this(config: ReadonlyGraylogConfig) = this()
    
    def alert(message: String): Unit = js.native
    def alert(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def alert(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def alert(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def alert(message: String, additionalFields: Record[String, _]): Unit = js.native
    def alert(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def alert(message: String, fullMessage: String): Unit = js.native
    def alert(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def alert(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def alert(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def alert(message: Error): Unit = js.native
    def alert(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def alert(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def alert(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def alert(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def alert(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def alert(message: Record[String, _]): Unit = js.native
    def alert(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def alert(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def alert(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    @JSName("alert")
    var alert_Original: FnCall = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def critical(message: String): Unit = js.native
    def critical(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def critical(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def critical(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def critical(message: String, additionalFields: Record[String, _]): Unit = js.native
    def critical(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def critical(message: String, fullMessage: String): Unit = js.native
    def critical(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def critical(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def critical(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def critical(message: Error): Unit = js.native
    def critical(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def critical(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def critical(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def critical(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def critical(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def critical(message: Record[String, _]): Unit = js.native
    def critical(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def critical(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def critical(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    @JSName("critical")
    var critical_Original: FnCall = js.native
    
    def debug(message: String): Unit = js.native
    def debug(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def debug(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def debug(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def debug(message: String, additionalFields: Record[String, _]): Unit = js.native
    def debug(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def debug(message: String, fullMessage: String): Unit = js.native
    def debug(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def debug(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def debug(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def debug(message: Error): Unit = js.native
    def debug(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def debug(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def debug(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def debug(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def debug(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def debug(message: Record[String, _]): Unit = js.native
    def debug(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def debug(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def debug(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    @JSName("debug")
    var debug_Original: FnCall = js.native
    
    def emergency(message: String): Unit = js.native
    def emergency(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def emergency(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def emergency(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def emergency(message: String, additionalFields: Record[String, _]): Unit = js.native
    def emergency(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def emergency(message: String, fullMessage: String): Unit = js.native
    def emergency(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def emergency(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def emergency(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def emergency(message: Error): Unit = js.native
    def emergency(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def emergency(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def emergency(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def emergency(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def emergency(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def emergency(message: Record[String, _]): Unit = js.native
    def emergency(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def emergency(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def emergency(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    @JSName("emergency")
    var emergency_Original: FnCall = js.native
    
    def error(message: String): Unit = js.native
    def error(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def error(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def error(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def error(message: String, additionalFields: Record[String, _]): Unit = js.native
    def error(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def error(message: String, fullMessage: String): Unit = js.native
    def error(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def error(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def error(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def error(message: Error): Unit = js.native
    def error(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def error(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def error(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def error(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def error(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def error(message: Record[String, _]): Unit = js.native
    def error(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def error(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def error(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    @JSName("error")
    var error_Original: FnCall = js.native
    
    def info(message: String): Unit = js.native
    def info(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def info(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def info(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def info(message: String, additionalFields: Record[String, _]): Unit = js.native
    def info(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def info(message: String, fullMessage: String): Unit = js.native
    def info(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def info(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def info(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def info(message: Error): Unit = js.native
    def info(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def info(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def info(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def info(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def info(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def info(message: Record[String, _]): Unit = js.native
    def info(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def info(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def info(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    @JSName("info")
    var info_Original: FnCall = js.native
    
    def log(message: String): Unit = js.native
    def log(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def log(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def log(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def log(message: String, additionalFields: Record[String, _]): Unit = js.native
    def log(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def log(message: String, fullMessage: String): Unit = js.native
    def log(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def log(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def log(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def log(message: Error): Unit = js.native
    def log(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def log(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def log(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def log(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def log(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def log(message: Record[String, _]): Unit = js.native
    def log(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def log(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def log(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    
    def notice(message: String): Unit = js.native
    def notice(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def notice(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def notice(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def notice(message: String, additionalFields: Record[String, _]): Unit = js.native
    def notice(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def notice(message: String, fullMessage: String): Unit = js.native
    def notice(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def notice(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def notice(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def notice(message: Error): Unit = js.native
    def notice(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def notice(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def notice(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def notice(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def notice(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def notice(message: Record[String, _]): Unit = js.native
    def notice(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def notice(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def notice(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    @JSName("notice")
    var notice_Original: FnCall = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def warn(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def warn(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warn(message: String, additionalFields: Record[String, _]): Unit = js.native
    def warn(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warn(message: String, fullMessage: String): Unit = js.native
    def warn(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warn(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def warn(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def warn(message: Error): Unit = js.native
    def warn(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def warn(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def warn(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warn(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def warn(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warn(message: Record[String, _]): Unit = js.native
    def warn(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warn(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def warn(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    @JSName("warn")
    var warn_Original: FnCall = js.native
    
    def warning(message: String): Unit = js.native
    def warning(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def warning(
      message: String,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def warning(
      message: String,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warning(message: String, additionalFields: Record[String, _]): Unit = js.native
    def warning(
      message: String,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warning(message: String, fullMessage: String): Unit = js.native
    def warning(
      message: String,
      fullMessage: String,
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warning(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
    def warning(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
    def warning(message: Error): Unit = js.native
    def warning(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
    def warning(
      message: Error,
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    def warning(
      message: Error,
      additionalFields: js.UndefOr[scala.Nothing],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warning(message: Error, additionalFields: Record[String, _]): Unit = js.native
    def warning(
      message: Error,
      additionalFields: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warning(message: Record[String, _]): Unit = js.native
    def warning(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: js.UndefOr[scala.Nothing],
      timestamp: Double
    ): Unit = js.native
    def warning(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _]
    ): Unit = js.native
    def warning(
      message: Record[String, _],
      _underscore: js.UndefOr[scala.Nothing],
      additionalFields: Record[String, _],
      timestamp: Double
    ): Unit = js.native
    @JSName("warning")
    var warning_Original: FnCall = js.native
  }
  object graylog {
    
    @JSImport("graylog2", "graylog.graylog")
    @js.native
    val graylog: typings.graylog2.mod.graylog = js.native
  }
  
  @js.native
  trait GraylogConfig extends StObject {
    
    /**
      * The max UDP packet size. Should never exceed the MTU of your system.
      * The default value is 1400
      */
    var bufferSize: js.UndefOr[Double] = js.native
    
    /**
      * The strategy for a message compression:
      *  "always"  -  every message will be compressed with zlib.deflate
      *  "never"   -  no compression
      *  "optimal" -  messages bigger than GraylogConfig.bufferSize will be compressed
      *
      *  The default value is "optimal"
      */
    var deflate: js.UndefOr[GraylogDeflate] = js.native
    
    /**
      * The facility - log's field type in Graylog.
      * The default value is "Node.js"
      */
    var facility: js.UndefOr[String] = js.native
    
    /**
      * The name of a host.
      * The default value is "os.hostname()"
      */
    var hostname: js.UndefOr[String] = js.native
    
    /**
      * The list of graylog servers
      */
    var servers: js.Array[Readonlyhoststringportnum] = js.native
  }
  object GraylogConfig {
    
    @scala.inline
    def apply(servers: js.Array[Readonlyhoststringportnum]): GraylogConfig = {
      val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraylogConfig]
    }
    
    @scala.inline
    implicit class GraylogConfigMutableBuilder[Self <: GraylogConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      @scala.inline
      def setDeflate(value: GraylogDeflate): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      @scala.inline
      def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setServers(value: js.Array[Readonlyhoststringportnum]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServersVarargs(value: Readonlyhoststringportnum*): Self = StObject.set(x, "servers", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.graylog2.graylog2Strings.optimal
    - typings.graylog2.graylog2Strings.always
    - typings.graylog2.graylog2Strings.never
  */
  trait GraylogDeflate extends StObject
  object GraylogDeflate {
    
    @scala.inline
    def always: typings.graylog2.graylog2Strings.always = "always".asInstanceOf[typings.graylog2.graylog2Strings.always]
    
    @scala.inline
    def never: typings.graylog2.graylog2Strings.never = "never".asInstanceOf[typings.graylog2.graylog2Strings.never]
    
    @scala.inline
    def optimal: typings.graylog2.graylog2Strings.optimal = "optimal".asInstanceOf[typings.graylog2.graylog2Strings.optimal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.graylog2.graylog2Strings.log
    - typings.graylog2.graylog2Strings.emergency
    - typings.graylog2.graylog2Strings.alert
    - typings.graylog2.graylog2Strings.critical
    - typings.graylog2.graylog2Strings.error
    - typings.graylog2.graylog2Strings.warning
    - typings.graylog2.graylog2Strings.warn
    - typings.graylog2.graylog2Strings.notice
    - typings.graylog2.graylog2Strings.info
    - typings.graylog2.graylog2Strings.debug
  */
  trait GraylogLogMethod extends StObject
  object GraylogLogMethod {
    
    @scala.inline
    def alert: typings.graylog2.graylog2Strings.alert = "alert".asInstanceOf[typings.graylog2.graylog2Strings.alert]
    
    @scala.inline
    def critical: typings.graylog2.graylog2Strings.critical = "critical".asInstanceOf[typings.graylog2.graylog2Strings.critical]
    
    @scala.inline
    def debug: typings.graylog2.graylog2Strings.debug = "debug".asInstanceOf[typings.graylog2.graylog2Strings.debug]
    
    @scala.inline
    def emergency: typings.graylog2.graylog2Strings.emergency = "emergency".asInstanceOf[typings.graylog2.graylog2Strings.emergency]
    
    @scala.inline
    def error: typings.graylog2.graylog2Strings.error = "error".asInstanceOf[typings.graylog2.graylog2Strings.error]
    
    @scala.inline
    def info: typings.graylog2.graylog2Strings.info = "info".asInstanceOf[typings.graylog2.graylog2Strings.info]
    
    @scala.inline
    def log: typings.graylog2.graylog2Strings.log = "log".asInstanceOf[typings.graylog2.graylog2Strings.log]
    
    @scala.inline
    def notice: typings.graylog2.graylog2Strings.notice = "notice".asInstanceOf[typings.graylog2.graylog2Strings.notice]
    
    @scala.inline
    def warn: typings.graylog2.graylog2Strings.warn = "warn".asInstanceOf[typings.graylog2.graylog2Strings.warn]
    
    @scala.inline
    def warning: typings.graylog2.graylog2Strings.warning = "warning".asInstanceOf[typings.graylog2.graylog2Strings.warning]
  }
}
