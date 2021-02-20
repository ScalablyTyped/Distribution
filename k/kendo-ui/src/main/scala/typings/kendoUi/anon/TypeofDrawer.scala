package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Drawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDrawer extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Drawer = js.native
  
  /* static member */
  var fn: Drawer = js.native
}
object TypeofDrawer {
  
  @scala.inline
  def apply(extend: js.Object => Drawer, fn: Drawer): TypeofDrawer = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDrawer]
  }
  
  @scala.inline
  implicit class TypeofDrawerMutableBuilder[Self <: TypeofDrawer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Drawer): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Drawer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
