package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridTooltipsMethods extends StObject {
  
  /**
    * Destroys the tooltip widget.
    */
  def destroy(): Unit
  
  /**
    * Returns the ID of the parent div element bounding the ruler and the tooltip container
    */
  def id(): String
}
object IgGridTooltipsMethods {
  
  @scala.inline
  def apply(destroy: () => Unit, id: () => String): IgGridTooltipsMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), id = js.Any.fromFunction0(id))
    __obj.asInstanceOf[IgGridTooltipsMethods]
  }
  
  @scala.inline
  implicit class IgGridTooltipsMethodsMutableBuilder[Self <: IgGridTooltipsMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
  }
}
