package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTooltipMethods extends StObject {
  
  def destroy(): Unit
}
object IgTooltipMethods {
  
  inline def apply(destroy: () => Unit): IgTooltipMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IgTooltipMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgTooltipMethods] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
