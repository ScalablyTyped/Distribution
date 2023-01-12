package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def debug(obj: js.Object): Unit
  
  def error(obj: js.Object): Unit
  
  def info(obj: js.Object): Unit
  
  def warn(obj: js.Object): Unit
}
object Logger {
  
  inline def apply(
    debug: js.Object => Unit,
    error: js.Object => Unit,
    info: js.Object => Unit,
    warn: js.Object => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: js.Object => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setError(value: js.Object => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: js.Object => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setWarn(value: js.Object => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
