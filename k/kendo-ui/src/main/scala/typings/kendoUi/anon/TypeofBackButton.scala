package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.BackButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBackButton extends StObject {
  
  /* static member */
  def extend(proto: js.Object): BackButton
  
  /* static member */
  var fn: BackButton
}
object TypeofBackButton {
  
  inline def apply(extend: js.Object => BackButton, fn: BackButton): TypeofBackButton = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBackButton]
  }
  
  extension [Self <: TypeofBackButton](x: Self) {
    
    inline def setExtend(value: js.Object => BackButton): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: BackButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
