package typings.hubot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log extends js.Object {
  
  def apply(messages: js.Any*): Unit = js.native
  
  def debug(messages: js.Any*): Unit = js.native
  @JSName("debug")
  var debug_Original: LogLevel = js.native
  
  def error(messages: js.Any*): Unit = js.native
  @JSName("error")
  var error_Original: LogLevel = js.native
  
  def get(namespace: String): Log = js.native
  
  def info(messages: js.Any*): Unit = js.native
  @JSName("info")
  var info_Original: LogLevel = js.native
  
  def notice(messages: js.Any*): Unit = js.native
  @JSName("notice")
  var notice_Original: LogLevel = js.native
  
  def warning(messages: js.Any*): Unit = js.native
  @JSName("warning")
  var warning_Original: LogLevel = js.native
}
