package typings.loglevel

import typings.loglevel.mod.LogLevelDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loglevelStrings {
  
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @scala.inline
  def SILENT: SILENT = "SILENT".asInstanceOf[SILENT]
  
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @scala.inline
  def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @scala.inline
  def debug_ : debug_ = "debug".asInstanceOf[debug_]
  
  @scala.inline
  def error_ : error_ = "error".asInstanceOf[error_]
  
  @scala.inline
  def info_ : info_ = "info".asInstanceOf[info_]
  
  @scala.inline
  def silent_ : silent_ = "silent".asInstanceOf[silent_]
  
  @scala.inline
  def trace_ : trace_ = "trace".asInstanceOf[trace_]
  
  @scala.inline
  def warn_ : warn_ = "warn".asInstanceOf[warn_]
  
  @js.native
  sealed trait DEBUG extends LogLevelDesc
  
  @js.native
  sealed trait ERROR extends LogLevelDesc
  
  @js.native
  sealed trait INFO extends LogLevelDesc
  
  @js.native
  sealed trait SILENT extends LogLevelDesc
  
  @js.native
  sealed trait TRACE extends LogLevelDesc
  
  @js.native
  sealed trait WARN extends LogLevelDesc
  
  @js.native
  sealed trait debug_ extends LogLevelDesc
  
  @js.native
  sealed trait error_ extends LogLevelDesc
  
  @js.native
  sealed trait info_ extends LogLevelDesc
  
  @js.native
  sealed trait silent_ extends LogLevelDesc
  
  @js.native
  sealed trait trace_ extends LogLevelDesc
  
  @js.native
  sealed trait warn_ extends LogLevelDesc
}
