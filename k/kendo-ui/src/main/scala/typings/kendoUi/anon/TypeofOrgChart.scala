package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.OrgChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOrgChart extends StObject {
  
  /* static member */
  def extend(proto: js.Object): OrgChart
  
  /* static member */
  var fn: OrgChart
}
object TypeofOrgChart {
  
  inline def apply(extend: js.Object => OrgChart, fn: OrgChart): TypeofOrgChart = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOrgChart]
  }
  
  extension [Self <: TypeofOrgChart](x: Self) {
    
    inline def setExtend(value: js.Object => OrgChart): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: OrgChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
