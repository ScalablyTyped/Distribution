package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ProgressBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofProgressBar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ProgressBar = js.native
  
  /* static member */
  var fn: ProgressBar = js.native
}
object TypeofProgressBar {
  
  @scala.inline
  def apply(extend: js.Object => ProgressBar, fn: ProgressBar): TypeofProgressBar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofProgressBar]
  }
  
  @scala.inline
  implicit class TypeofProgressBarMutableBuilder[Self <: TypeofProgressBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => ProgressBar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: ProgressBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
