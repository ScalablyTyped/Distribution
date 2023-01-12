package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ColorGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofColorGradient extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ColorGradient
  
  /* static member */
  var fn: ColorGradient
}
object TypeofColorGradient {
  
  inline def apply(extend: js.Object => ColorGradient, fn: ColorGradient): TypeofColorGradient = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofColorGradient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofColorGradient] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ColorGradient): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ColorGradient): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
