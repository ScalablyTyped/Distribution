package typings.jqueryToastPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  def toast(options: toastOptions): Unit = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(toast: toastOptions => Unit): JQueryStatic = {
    val __obj = js.Dynamic.literal(toast = js.Any.fromFunction1(toast))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToast(value: toastOptions => Unit): Self = StObject.set(x, "toast", js.Any.fromFunction1(value))
  }
}
