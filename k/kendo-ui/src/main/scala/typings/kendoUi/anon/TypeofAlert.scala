package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Alert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAlert extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Alert
  
  /* static member */
  var fn: Alert
}
object TypeofAlert {
  
  inline def apply(extend: js.Object => Alert, fn: Alert): TypeofAlert = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAlert]
  }
  
  extension [Self <: TypeofAlert](x: Self) {
    
    inline def setExtend(value: js.Object => Alert): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Alert): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
