package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ResponsivePanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofResponsivePanel extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ResponsivePanel
  
  /* static member */
  var fn: ResponsivePanel
}
object TypeofResponsivePanel {
  
  inline def apply(extend: js.Object => ResponsivePanel, fn: ResponsivePanel): TypeofResponsivePanel = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofResponsivePanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofResponsivePanel] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ResponsivePanel): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ResponsivePanel): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
