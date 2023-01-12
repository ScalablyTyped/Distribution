package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLayout extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Layout
  
  /* static member */
  var fn: Layout
}
object TypeofLayout {
  
  inline def apply(extend: js.Object => Layout, fn: Layout): TypeofLayout = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofLayout] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Layout): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Layout): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
