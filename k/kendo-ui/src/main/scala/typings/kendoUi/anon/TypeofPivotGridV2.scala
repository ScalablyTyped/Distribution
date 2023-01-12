package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.PivotGridV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotGridV2 extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PivotGridV2
  
  /* static member */
  var fn: PivotGridV2
}
object TypeofPivotGridV2 {
  
  inline def apply(extend: js.Object => PivotGridV2, fn: PivotGridV2): TypeofPivotGridV2 = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotGridV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPivotGridV2] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => PivotGridV2): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: PivotGridV2): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
