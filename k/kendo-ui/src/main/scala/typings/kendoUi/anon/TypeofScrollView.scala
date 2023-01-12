package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ScrollView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofScrollView extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ScrollView
  
  /* static member */
  var fn: ScrollView
}
object TypeofScrollView {
  
  inline def apply(extend: js.Object => ScrollView, fn: ScrollView): TypeofScrollView = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScrollView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofScrollView] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ScrollView): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ScrollView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
