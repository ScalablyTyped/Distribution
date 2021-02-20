package typings.logg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends StObject {
  
  def error(var_args: js.Any*): Unit = js.native
  
  def fine(var_args: js.Any*): Unit = js.native
  
  def getLogLevel(): Double = js.native
  
  def getParent(): Logger = js.native
  
  def getWatchers(): js.Array[js.Function] = js.native
  
  def info(var_args: js.Any*): Unit = js.native
  
  def isLoggable(level: Double): Boolean = js.native
  
  def log(level: Double, var_args: js.Any*): Unit = js.native
  
  def registerWatcher(watcher: js.Function1[/* logRecord */ String, Unit]): Unit = js.native
  
  def setLogLevel(level: Double): Unit = js.native
  
  def setParent(logger: Logger): Unit = js.native
  
  def warn(var_args: js.Any*): Unit = js.native
}
object Logger {
  
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => Unit,
    fine: /* repeated */ js.Any => Unit,
    getLogLevel: () => Double,
    getParent: () => Logger,
    getWatchers: () => js.Array[js.Function],
    info: /* repeated */ js.Any => Unit,
    isLoggable: Double => Boolean,
    log: (Double, /* repeated */ js.Any) => Unit,
    registerWatcher: js.Function1[/* logRecord */ String, Unit] => Unit,
    setLogLevel: Double => Unit,
    setParent: Logger => Unit,
    warn: /* repeated */ js.Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), fine = js.Any.fromFunction1(fine), getLogLevel = js.Any.fromFunction0(getLogLevel), getParent = js.Any.fromFunction0(getParent), getWatchers = js.Any.fromFunction0(getWatchers), info = js.Any.fromFunction1(info), isLoggable = js.Any.fromFunction1(isLoggable), log = js.Any.fromFunction2(log), registerWatcher = js.Any.fromFunction1(registerWatcher), setLogLevel = js.Any.fromFunction1(setLogLevel), setParent = js.Any.fromFunction1(setParent), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFine(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "fine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLogLevel(value: () => Double): Self = StObject.set(x, "getLogLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParent(value: () => Logger): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWatchers(value: () => js.Array[js.Function]): Self = StObject.set(x, "getWatchers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLoggable(value: Double => Boolean): Self = StObject.set(x, "isLoggable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: (Double, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterWatcher(value: js.Function1[/* logRecord */ String, Unit] => Unit): Self = StObject.set(x, "registerWatcher", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLogLevel(value: Double => Unit): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParent(value: Logger => Unit): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
