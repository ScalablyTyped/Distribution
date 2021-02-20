package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWindow extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Window = js.native
  
  /* static member */
  var fn: Window = js.native
}
object TypeofWindow {
  
  @scala.inline
  def apply(extend: js.Object => Window, fn: Window): TypeofWindow = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWindow]
  }
  
  @scala.inline
  implicit class TypeofWindowMutableBuilder[Self <: TypeofWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Window): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Window): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
