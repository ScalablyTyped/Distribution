package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.MultiSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMultiSelect extends StObject {
  
  /* static member */
  def extend(proto: js.Object): MultiSelect = js.native
  
  /* static member */
  var fn: MultiSelect = js.native
}
object TypeofMultiSelect {
  
  @scala.inline
  def apply(extend: js.Object => MultiSelect, fn: MultiSelect): TypeofMultiSelect = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMultiSelect]
  }
  
  @scala.inline
  implicit class TypeofMultiSelectMutableBuilder[Self <: TypeofMultiSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => MultiSelect): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: MultiSelect): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
