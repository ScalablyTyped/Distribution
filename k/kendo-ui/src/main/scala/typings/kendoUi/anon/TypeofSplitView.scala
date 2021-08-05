package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.SplitView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSplitView extends StObject {
  
  /* static member */
  def extend(proto: js.Object): SplitView
  
  /* static member */
  var fn: SplitView
}
object TypeofSplitView {
  
  inline def apply(extend: js.Object => SplitView, fn: SplitView): TypeofSplitView = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitView]
  }
  
  extension [Self <: TypeofSplitView](x: Self) {
    
    inline def setExtend(value: js.Object => SplitView): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: SplitView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
