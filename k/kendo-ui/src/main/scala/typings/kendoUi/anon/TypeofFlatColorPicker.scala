package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.FlatColorPicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFlatColorPicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): FlatColorPicker = js.native
  
  /* static member */
  var fn: FlatColorPicker = js.native
}
object TypeofFlatColorPicker {
  
  @scala.inline
  def apply(extend: js.Object => FlatColorPicker, fn: FlatColorPicker): TypeofFlatColorPicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFlatColorPicker]
  }
  
  @scala.inline
  implicit class TypeofFlatColorPickerMutableBuilder[Self <: TypeofFlatColorPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => FlatColorPicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: FlatColorPicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
