package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ExpansionPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofExpansionPanel extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ExpansionPanel
  
  /* static member */
  var fn: ExpansionPanel
}
object TypeofExpansionPanel {
  
  inline def apply(extend: js.Object => ExpansionPanel, fn: ExpansionPanel): TypeofExpansionPanel = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofExpansionPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofExpansionPanel] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ExpansionPanel): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ExpansionPanel): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
