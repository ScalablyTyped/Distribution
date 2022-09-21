package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Captcha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCaptcha extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Captcha
  
  /* static member */
  var fn: Captcha
}
object TypeofCaptcha {
  
  inline def apply(extend: js.Object => Captcha, fn: Captcha): TypeofCaptcha = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCaptcha]
  }
  
  extension [Self <: TypeofCaptcha](x: Self) {
    
    inline def setExtend(value: js.Object => Captcha): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Captcha): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
