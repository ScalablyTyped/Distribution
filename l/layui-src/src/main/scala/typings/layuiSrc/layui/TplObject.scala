package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TplObject extends StObject {
  
  def render(data: js.Object, callback: js.Function1[/* str */ String, Unit]): js.Any
}
object TplObject {
  
  inline def apply(render: (js.Object, js.Function1[/* str */ String, Unit]) => js.Any): TplObject = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[TplObject]
  }
  
  extension [Self <: TplObject](x: Self) {
    
    inline def setRender(value: (js.Object, js.Function1[/* str */ String, Unit]) => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
