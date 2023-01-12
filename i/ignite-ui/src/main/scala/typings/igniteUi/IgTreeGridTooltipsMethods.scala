package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridTooltipsMethods extends StObject {
  
  def destroy(): Unit
  
  /**
    * Returns the ID of the parent div element bounding the ruler and the tooltip container
    */
  def id(): String
}
object IgTreeGridTooltipsMethods {
  
  inline def apply(destroy: () => Unit, id: () => String): IgTreeGridTooltipsMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), id = js.Any.fromFunction0(id))
    __obj.asInstanceOf[IgTreeGridTooltipsMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgTreeGridTooltipsMethods] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
  }
}
