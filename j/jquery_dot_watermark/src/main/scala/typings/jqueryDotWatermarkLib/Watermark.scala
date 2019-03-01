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
    hide: js.Function1[java.lang.String, scala.Unit],
    hideAll: js.Function0[scala.Unit],
    options: WatermarkOptions,
    show: js.Function1[java.lang.String, scala.Unit],
    showAll: js.Function0[scala.Unit]
  ): Watermark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("hideAll")(hideAll)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("showAll")(showAll)
    __obj.asInstanceOf[Watermark]
  }
}

