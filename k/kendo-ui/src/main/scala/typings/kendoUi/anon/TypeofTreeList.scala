package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TreeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTreeList extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TreeList = js.native
  
  /* static member */
  var fn: TreeList = js.native
}
object TypeofTreeList {
  
  @scala.inline
  def apply(extend: js.Object => TreeList, fn: TreeList): TypeofTreeList = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeList]
  }
  
  @scala.inline
  implicit class TypeofTreeListMutableBuilder[Self <: TypeofTreeList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => TreeList): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: TreeList): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
