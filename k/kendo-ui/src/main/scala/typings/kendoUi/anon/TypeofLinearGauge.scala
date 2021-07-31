package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.LinearGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLinearGauge extends StObject {
  
  /* static member */
  def extend(proto: js.Object): LinearGauge
  
  /* static member */
  var fn: LinearGauge
}
object TypeofLinearGauge {
  
  @scala.inline
  def apply(extend: js.Object => LinearGauge, fn: LinearGauge): TypeofLinearGauge = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLinearGauge]
  }
  
  @scala.inline
  implicit class TypeofLinearGaugeMutableBuilder[Self <: TypeofLinearGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => LinearGauge): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: LinearGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
