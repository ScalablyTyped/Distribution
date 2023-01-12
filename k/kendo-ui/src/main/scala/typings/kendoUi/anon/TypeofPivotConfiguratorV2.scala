package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.PivotConfiguratorV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotConfiguratorV2 extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PivotConfiguratorV2
  
  /* static member */
  var fn: PivotConfiguratorV2
}
object TypeofPivotConfiguratorV2 {
  
  inline def apply(extend: js.Object => PivotConfiguratorV2, fn: PivotConfiguratorV2): TypeofPivotConfiguratorV2 = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotConfiguratorV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPivotConfiguratorV2] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => PivotConfiguratorV2): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: PivotConfiguratorV2): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
