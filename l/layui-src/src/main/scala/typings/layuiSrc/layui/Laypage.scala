package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Laypage extends StObject {
  
  def render(options: PageOptions): js.Any
}
object Laypage {
  
  @scala.inline
  def apply(render: PageOptions => js.Any): Laypage = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Laypage]
  }
  
  @scala.inline
  implicit class LaypageMutableBuilder[Self <: Laypage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: PageOptions => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
