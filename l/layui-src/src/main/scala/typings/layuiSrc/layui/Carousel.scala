package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carousel extends js.Object {
  
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
  implicit class CarouselOps[Self <: Carousel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* obj */ CarouselItem, _]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReload(value: CarouselOption => Unit): Self = this.set("reload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: CarouselOption => js.Object): Self = this.set("render", js.Any.fromFunction1(value))
  }
}
