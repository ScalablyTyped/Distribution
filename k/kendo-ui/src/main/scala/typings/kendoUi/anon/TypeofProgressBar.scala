package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ProgressBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofProgressBar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ProgressBar
  
  /* static member */
  var fn: ProgressBar
}
object TypeofProgressBar {
  
  inline def apply(extend: js.Object => ProgressBar, fn: ProgressBar): TypeofProgressBar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofProgressBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofProgressBar] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ProgressBar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ProgressBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
