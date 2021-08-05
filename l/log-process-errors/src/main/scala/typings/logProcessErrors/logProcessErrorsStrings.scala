package typings.logProcessErrors

import typings.logProcessErrors.mod.ExceptionType
import typings.logProcessErrors.mod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logProcessErrorsStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with LogLevel
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait ava extends StObject
  inline def ava: ava = "ava".asInstanceOf[ava]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait jasmine extends StObject
  inline def jasmine: jasmine = "jasmine".asInstanceOf[jasmine]
  
  @js.native
  sealed trait mocha extends StObject
  inline def mocha: mocha = "mocha".asInstanceOf[mocha]
  
  @js.native
  sealed trait multipleResolves
    extends StObject
       with ExceptionType
  inline def multipleResolves: multipleResolves = "multipleResolves".asInstanceOf[multipleResolves]
  
  @js.native
  sealed trait `node-tap` extends StObject
  inline def `node-tap`: `node-tap` = "node-tap".asInstanceOf[`node-tap`]
  
  @js.native
  sealed trait rejectionHandled
    extends StObject
       with ExceptionType
  inline def rejectionHandled: rejectionHandled = "rejectionHandled".asInstanceOf[rejectionHandled]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait tape extends StObject
  inline def tape: tape = "tape".asInstanceOf[tape]
  
  @js.native
  sealed trait uncaughtException
    extends StObject
       with ExceptionType
  inline def uncaughtException: uncaughtException = "uncaughtException".asInstanceOf[uncaughtException]
  
  @js.native
  sealed trait unhandledRejection
    extends StObject
       with ExceptionType
  inline def unhandledRejection: unhandledRejection = "unhandledRejection".asInstanceOf[unhandledRejection]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait warning
    extends StObject
       with ExceptionType
  inline def warning: warning = "warning".asInstanceOf[warning]
}
