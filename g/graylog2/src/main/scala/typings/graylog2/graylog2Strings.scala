package typings.graylog2

import typings.graylog2.mod.GraylogDeflate
import typings.graylog2.mod.GraylogLogMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graylog2Strings {
  
  @js.native
  sealed trait alert
    extends StObject
       with GraylogLogMethod
  inline def alert: alert = "alert".asInstanceOf[alert]
  
  @js.native
  sealed trait always
    extends StObject
       with GraylogDeflate
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait critical
    extends StObject
       with GraylogLogMethod
  inline def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait debug
    extends StObject
       with GraylogLogMethod
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait emergency
    extends StObject
       with GraylogLogMethod
  inline def emergency: emergency = "emergency".asInstanceOf[emergency]
  
  @js.native
  sealed trait error
    extends StObject
       with GraylogLogMethod
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with GraylogLogMethod
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait log
    extends StObject
       with GraylogLogMethod
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait never
    extends StObject
       with GraylogDeflate
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait notice
    extends StObject
       with GraylogLogMethod
  inline def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait optimal
    extends StObject
       with GraylogDeflate
  inline def optimal: optimal = "optimal".asInstanceOf[optimal]
  
  @js.native
  sealed trait warn
    extends StObject
       with GraylogLogMethod
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait warning
    extends StObject
       with GraylogLogMethod
  inline def warning: warning = "warning".asInstanceOf[warning]
}
