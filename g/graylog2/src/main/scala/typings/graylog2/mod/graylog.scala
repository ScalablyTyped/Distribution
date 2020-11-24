package typings.graylog2.mod

import typings.graylog2.anon.FnCall
import typings.graylog2.anon.ReadonlyGraylogConfig
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("graylog2", "graylog")
@js.native
object graylog extends js.Object {
  
  val graylog: typings.graylog2.mod.graylog = js.native
}
