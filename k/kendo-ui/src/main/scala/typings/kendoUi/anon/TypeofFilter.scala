package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFilter extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Filter = js.native
  
  /* static member */
  var fn: Filter = js.native
}
object TypeofFilter {
  
  @scala.inline
  def apply(extend: js.Object => Filter, fn: Filter): TypeofFilter = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFilter]
  }
  
  @scala.inline
  implicit class TypeofFilterMutableBuilder[Self <: TypeofFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Filter): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Filter): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
