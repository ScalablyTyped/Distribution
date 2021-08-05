package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Carousel extends StObject {
  
  def on(event: String, callback: js.Function1[/* obj */ CarouselItem, js.Any]): Unit
  
  def reload(options: CarouselOption): Unit
  
  def render(options: CarouselOption): js.Object
}
object Carousel {
  
  inline def apply(
    on: (String, js.Function1[/* obj */ CarouselItem, js.Any]) => Unit,
    reload: CarouselOption => Unit,
    render: CarouselOption => js.Object
  ): Carousel = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), reload = js.Any.fromFunction1(reload), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Carousel]
  }
  
  extension [Self <: Carousel](x: Self) {
    
    inline def setOn(value: (String, js.Function1[/* obj */ CarouselItem, js.Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setReload(value: CarouselOption => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction1(value))
    
    inline def setRender(value: CarouselOption => js.Object): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
