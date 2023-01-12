package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseWrapperMethods extends StObject {
  
  def destroy(): Unit
}
object MouseWrapperMethods {
  
  inline def apply(destroy: () => Unit): MouseWrapperMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[MouseWrapperMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseWrapperMethods] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
