package typings.jqueryDotWatermark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watermark extends js.Object {
  var options: WatermarkOptions
  def hide(element: String): Unit
  def hideAll(): Unit
  def show(element: String): Unit
  def showAll(): Unit
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
}

