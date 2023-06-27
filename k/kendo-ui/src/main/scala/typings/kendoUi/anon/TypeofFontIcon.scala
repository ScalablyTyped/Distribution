package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.FontIcon
import typings.kendoUi.kendo.ui.Wizard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFontIcon extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Wizard
  
  /* static member */
  var fn: FontIcon
}
object TypeofFontIcon {
  
  inline def apply(extend: js.Object => Wizard, fn: FontIcon): TypeofFontIcon = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFontIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFontIcon] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Wizard): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: FontIcon): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
