package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Badge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBadge extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Badge
  
  /* static member */
  var fn: Badge
}
object TypeofBadge {
  
  inline def apply(extend: js.Object => Badge, fn: Badge): TypeofBadge = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBadge]
  }
  
  extension [Self <: TypeofBadge](x: Self) {
    
    inline def setExtend(value: js.Object => Badge): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Badge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
