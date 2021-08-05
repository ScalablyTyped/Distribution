package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.MultiColumnComboBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMultiColumnComboBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): MultiColumnComboBox
  
  /* static member */
  var fn: MultiColumnComboBox
}
object TypeofMultiColumnComboBox {
  
  inline def apply(extend: js.Object => MultiColumnComboBox, fn: MultiColumnComboBox): TypeofMultiColumnComboBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMultiColumnComboBox]
  }
  
  extension [Self <: TypeofMultiColumnComboBox](x: Self) {
    
    inline def setExtend(value: js.Object => MultiColumnComboBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: MultiColumnComboBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
