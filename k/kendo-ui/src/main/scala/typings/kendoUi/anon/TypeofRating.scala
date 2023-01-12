package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Rating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRating extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Rating
  
  /* static member */
  var fn: Rating
}
object TypeofRating {
  
  inline def apply(extend: js.Object => Rating, fn: Rating): TypeofRating = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRating]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRating] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Rating): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Rating): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
