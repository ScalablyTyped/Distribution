package typings.jqueryToastPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def toast(options: toastOptions): Unit
}
object JQueryStatic {
  
  inline def apply(toast: toastOptions => Unit): JQueryStatic = {
    val __obj = js.Dynamic.literal(toast = js.Any.fromFunction1(toast))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setToast(value: toastOptions => Unit): Self = StObject.set(x, "toast", js.Any.fromFunction1(value))
  }
}
