package typings.graylog2

import typings.graylog2.mod.GraylogDeflate
import typings.graylog2.mod.GraylogLogMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graylog2Strings {
  
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def emergency: emergency = "emergency".asInstanceOf[emergency]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  
  @scala.inline
  def optimal: optimal = "optimal".asInstanceOf[optimal]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait alert extends GraylogLogMethod
  
  @js.native
  sealed trait always extends GraylogDeflate
  
  @js.native
  sealed trait critical extends GraylogLogMethod
  
  @js.native
  sealed trait debug extends GraylogLogMethod
  
  @js.native
  sealed trait emergency extends GraylogLogMethod
  
  @js.native
  sealed trait error extends GraylogLogMethod
  
  @js.native
  sealed trait info extends GraylogLogMethod
  
  @js.native
  sealed trait log extends GraylogLogMethod
  
  @js.native
  sealed trait never extends GraylogDeflate
  
  @js.native
  sealed trait notice extends GraylogLogMethod
  
  @js.native
  sealed trait optimal extends GraylogDeflate
  
  @js.native
  sealed trait warn extends GraylogLogMethod
  
  @js.native
  sealed trait warning extends GraylogLogMethod
}
