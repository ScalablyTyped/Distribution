package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWidget extends StObject {
  
  /* static member */
  def extend(prototype: js.Object): Widget = js.native
  
  /* static member */
  var fn: js.Any = js.native
}
object TypeofWidget {
  
  @scala.inline
  def apply(extend: js.Object => Widget, fn: js.Any): TypeofWidget = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWidget]
  }
  
  @scala.inline
  implicit class TypeofWidgetMutableBuilder[Self <: TypeofWidget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Widget): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: js.Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
