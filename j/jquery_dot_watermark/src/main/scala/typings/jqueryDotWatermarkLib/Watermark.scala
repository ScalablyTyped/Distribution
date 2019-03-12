package typings
package jqueryDotWatermarkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watermark extends js.Object {
  var options: WatermarkOptions
  def hide(element: java.lang.String): scala.Unit
  def hideAll(): scala.Unit
  def show(element: java.lang.String): scala.Unit
  def showAll(): scala.Unit
}

object Watermark {
  @scala.inline
  def apply(
    hide: java.lang.String => scala.Unit,
    hideAll: () => scala.Unit,
    options: WatermarkOptions,
    show: java.lang.String => scala.Unit,
    showAll: () => scala.Unit
  ): Watermark = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), hideAll = js.Any.fromFunction0(hideAll), options = options, show = js.Any.fromFunction1(show), showAll = js.Any.fromFunction0(showAll))
  
    __obj.asInstanceOf[Watermark]
  }
}

