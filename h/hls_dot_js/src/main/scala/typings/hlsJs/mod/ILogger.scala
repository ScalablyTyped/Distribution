package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILogger extends StObject {
  
  def debug(message: Any, optionalParams: Any*): Unit
  def debug(message: Unit, optionalParams: Any*): Unit
  @JSName("debug")
  var debug_Original: ILogFunction
  
  def error(message: Any, optionalParams: Any*): Unit
  def error(message: Unit, optionalParams: Any*): Unit
  @JSName("error")
  var error_Original: ILogFunction
  
  def info(message: Any, optionalParams: Any*): Unit
  def info(message: Unit, optionalParams: Any*): Unit
  @JSName("info")
  var info_Original: ILogFunction
  
  def log(message: Any, optionalParams: Any*): Unit
  def log(message: Unit, optionalParams: Any*): Unit
  @JSName("log")
  var log_Original: ILogFunction
  
  def trace(message: Any, optionalParams: Any*): Unit
  def trace(message: Unit, optionalParams: Any*): Unit
  @JSName("trace")
  var trace_Original: ILogFunction
  
  def warn(message: Any, optionalParams: Any*): Unit
  def warn(message: Unit, optionalParams: Any*): Unit
  @JSName("warn")
  var warn_Original: ILogFunction
}
object ILogger {
  
  inline def apply(
    debug: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit,
    error: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit,
    info: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit,
    log: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit,
    trace: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit,
    warn: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), trace = js.Any.fromFunction2(trace), warn = js.Any.fromFunction2(warn))
    __obj.asInstanceOf[ILogger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILogger] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
    
    inline def setError(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    inline def setInfo(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
    
    inline def setLog(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    inline def setTrace(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction2(value))
    
    inline def setWarn(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
  }
}
