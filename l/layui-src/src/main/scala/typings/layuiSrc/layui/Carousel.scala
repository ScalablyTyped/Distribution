package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carousel extends StObject {
  
  def on(event: String, callback: js.Function1[/* obj */ CarouselItem, _]): Unit = js.native
  
  def reload(options: CarouselOption): Unit = js.native
  
  def render(options: CarouselOption): js.Object = js.native
}
object Carousel {
  
  @scala.inline
  def apply(
    on: (String, js.Function1[/* obj */ CarouselItem, _]) => Unit,
    reload: CarouselOption => Unit,
    render: CarouselOption => js.Object
  ): Carousel = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), reload = js.Any.fromFunction1(reload), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Carousel]
  }
  
  @scala.inline
  implicit class CarouselMutableBuilder[Self <: Carousel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* obj */ CarouselItem, _]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReload(value: CarouselOption => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: CarouselOption => js.Object): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
