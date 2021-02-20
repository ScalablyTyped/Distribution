package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rate extends StObject {
  
  def render(option: RateOption): Rate = js.native
}
object Rate {
  
  @scala.inline
  def apply(render: RateOption => Rate): Rate = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Rate]
  }
  
  @scala.inline
  implicit class RateMutableBuilder[Self <: Rate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: RateOption => Rate): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
