package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def error(msg: String): Unit
  
  def info(msg: String): Unit
}
object Logger {
  
  inline def apply(error: String => Unit, info: String => Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
  }
}
