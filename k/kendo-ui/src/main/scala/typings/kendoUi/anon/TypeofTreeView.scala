package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TreeView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTreeView extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TreeView
  
  /* static member */
  var fn: TreeView
}
object TypeofTreeView {
  
  inline def apply(extend: js.Object => TreeView, fn: TreeView): TypeofTreeView = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTreeView] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => TreeView): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TreeView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
