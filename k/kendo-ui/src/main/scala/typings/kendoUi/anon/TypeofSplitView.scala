package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.SplitView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSplitView extends StObject {
  
  /* static member */
  def extend(proto: js.Object): SplitView = js.native
  
  /* static member */
  var fn: SplitView = js.native
}
object TypeofSplitView {
  
  @scala.inline
  def apply(extend: js.Object => SplitView, fn: SplitView): TypeofSplitView = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitView]
  }
  
  @scala.inline
  implicit class TypeofSplitViewMutableBuilder[Self <: TypeofSplitView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => SplitView): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: SplitView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
