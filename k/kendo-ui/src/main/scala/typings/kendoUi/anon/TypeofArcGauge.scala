package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.ArcGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofArcGauge extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ArcGauge
  
  /* static member */
  var fn: ArcGauge
}
object TypeofArcGauge {
  
  inline def apply(extend: js.Object => ArcGauge, fn: ArcGauge): TypeofArcGauge = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofArcGauge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofArcGauge] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ArcGauge): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ArcGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
