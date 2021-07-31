package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TabStrip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTabStrip extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TabStrip
  
  /* static member */
  var fn: TabStrip
}
object TypeofTabStrip {
  
  @scala.inline
  def apply(extend: js.Object => TabStrip, fn: TabStrip): TypeofTabStrip = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTabStrip]
  }
  
  @scala.inline
  implicit class TypeofTabStripMutableBuilder[Self <: TypeofTabStrip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => TabStrip): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: TabStrip): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
