package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.PivotConfiguratorButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotConfiguratorBu extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PivotConfiguratorButton
  
  /* static member */
  var fn: PivotConfiguratorButton
}
object TypeofPivotConfiguratorBu {
  
  inline def apply(extend: js.Object => PivotConfiguratorButton, fn: PivotConfiguratorButton): TypeofPivotConfiguratorBu = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotConfiguratorBu]
  }
  
  extension [Self <: TypeofPivotConfiguratorBu](x: Self) {
    
    inline def setExtend(value: js.Object => PivotConfiguratorButton): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: PivotConfiguratorButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
