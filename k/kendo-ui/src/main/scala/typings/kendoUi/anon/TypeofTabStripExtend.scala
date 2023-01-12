package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.TabStrip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTabStripExtend extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TabStrip
  
  /* static member */
  var fn: TabStrip
}
object TypeofTabStripExtend {
  
  inline def apply(extend: js.Object => TabStrip, fn: TabStrip): TypeofTabStripExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTabStripExtend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTabStripExtend] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => TabStrip): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TabStrip): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
