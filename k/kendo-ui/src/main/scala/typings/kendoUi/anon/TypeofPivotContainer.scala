package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.PivotContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotContainer extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PivotContainer
  
  /* static member */
  var fn: PivotContainer
}
object TypeofPivotContainer {
  
  inline def apply(extend: js.Object => PivotContainer, fn: PivotContainer): TypeofPivotContainer = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotContainer]
  }
  
  extension [Self <: TypeofPivotContainer](x: Self) {
    
    inline def setExtend(value: js.Object => PivotContainer): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: PivotContainer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
