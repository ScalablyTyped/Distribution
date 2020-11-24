package typings.jqueryWatermark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watermark extends js.Object {
  
  def hide(element: String): Unit = js.native
  
  def hideAll(): Unit = js.native
  
  var options: WatermarkOptions = js.native
  
  def show(element: String): Unit = js.native
  
  def showAll(): Unit = js.native
}
object Watermark {
  
  @scala.inline
  def apply(
    hide: String => Unit,
    hideAll: () => Unit,
    options: WatermarkOptions,
    show: String => Unit,
    showAll: () => Unit
  ): Watermark = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), hideAll = js.Any.fromFunction0(hideAll), options = options.asInstanceOf[js.Any], show = js.Any.fromFunction1(show), showAll = js.Any.fromFunction0(showAll))
    __obj.asInstanceOf[Watermark]
  }
  
  @scala.inline
  implicit class WatermarkOps[Self <: Watermark] (val x: Self) extends AnyVal {
    
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
    def setHide(value: String => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideAll(value: () => Unit): Self = this.set("hideAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: WatermarkOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: String => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowAll(value: () => Unit): Self = this.set("showAll", js.Any.fromFunction0(value))
  }
}
