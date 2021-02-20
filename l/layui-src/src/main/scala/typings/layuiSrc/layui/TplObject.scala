package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TplObject extends StObject {
  
  def render(data: js.Object, callback: js.Function1[/* str */ String, Unit]): js.Any = js.native
}
object TplObject {
  
  @scala.inline
  def apply(render: (js.Object, js.Function1[/* str */ String, Unit]) => js.Any): TplObject = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[TplObject]
  }
  
  @scala.inline
  implicit class TplObjectMutableBuilder[Self <: TplObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: (js.Object, js.Function1[/* str */ String, Unit]) => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
