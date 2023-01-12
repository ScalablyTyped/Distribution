package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.CircularProgressBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCircularProgressBar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): CircularProgressBar
  
  /* static member */
  var fn: CircularProgressBar
}
object TypeofCircularProgressBar {
  
  inline def apply(extend: js.Object => CircularProgressBar, fn: CircularProgressBar): TypeofCircularProgressBar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCircularProgressBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCircularProgressBar] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => CircularProgressBar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: CircularProgressBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
