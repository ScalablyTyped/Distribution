package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.Sparkline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSparkline extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Sparkline
  
  /* static member */
  var fn: Sparkline
}
object TypeofSparkline {
  
  inline def apply(extend: js.Object => Sparkline, fn: Sparkline): TypeofSparkline = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSparkline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSparkline] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Sparkline): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Sparkline): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
