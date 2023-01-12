package typings.logg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def error(var_args: Any*): Unit
  
  def fine(var_args: Any*): Unit
  
  def getLogLevel(): Double
  
  def getParent(): Logger
  
  def getWatchers(): js.Array[js.Function]
  
  def info(var_args: Any*): Unit
  
  def isLoggable(level: Double): Boolean
  
  def log(level: Double, var_args: Any*): Unit
  
  def registerWatcher(watcher: js.Function1[/* logRecord */ String, Unit]): Unit
  
  def setLogLevel(level: Double): Unit
  
  def setParent(logger: Logger): Unit
  
  def warn(var_args: Any*): Unit
}
object Logger {
  
  inline def apply(
    error: /* repeated */ Any => Unit,
    fine: /* repeated */ Any => Unit,
    getLogLevel: () => Double,
    getParent: () => Logger,
    getWatchers: () => js.Array[js.Function],
    info: /* repeated */ Any => Unit,
    isLoggable: Double => Boolean,
    log: (Double, /* repeated */ Any) => Unit,
    registerWatcher: js.Function1[/* logRecord */ String, Unit] => Unit,
    setLogLevel: Double => Unit,
    setParent: Logger => Unit,
    warn: /* repeated */ Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), fine = js.Any.fromFunction1(fine), getLogLevel = js.Any.fromFunction0(getLogLevel), getParent = js.Any.fromFunction0(getParent), getWatchers = js.Any.fromFunction0(getWatchers), info = js.Any.fromFunction1(info), isLoggable = js.Any.fromFunction1(isLoggable), log = js.Any.fromFunction2(log), registerWatcher = js.Any.fromFunction1(registerWatcher), setLogLevel = js.Any.fromFunction1(setLogLevel), setParent = js.Any.fromFunction1(setParent), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setFine(value: /* repeated */ Any => Unit): Self = StObject.set(x, "fine", js.Any.fromFunction1(value))
    
    inline def setGetLogLevel(value: () => Double): Self = StObject.set(x, "getLogLevel", js.Any.fromFunction0(value))
    
    inline def setGetParent(value: () => Logger): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    inline def setGetWatchers(value: () => js.Array[js.Function]): Self = StObject.set(x, "getWatchers", js.Any.fromFunction0(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setIsLoggable(value: Double => Boolean): Self = StObject.set(x, "isLoggable", js.Any.fromFunction1(value))
    
    inline def setLog(value: (Double, /* repeated */ Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    inline def setRegisterWatcher(value: js.Function1[/* logRecord */ String, Unit] => Unit): Self = StObject.set(x, "registerWatcher", js.Any.fromFunction1(value))
    
    inline def setSetLogLevel(value: Double => Unit): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1(value))
    
    inline def setSetParent(value: Logger => Unit): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
