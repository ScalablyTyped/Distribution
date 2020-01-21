package typings.ionicCore.spinnerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerData extends js.Object {
  var cx: js.UndefOr[Double] = js.undefined
  var cy: js.UndefOr[Double] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
  var style: js.Any
  var transform: js.UndefOr[String] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
  var y1: js.UndefOr[Double] = js.undefined
  var y2: js.UndefOr[Double] = js.undefined
}

object SpinnerData {
  @scala.inline
  def apply(
    style: js.Any,
    cx: Int | Double = null,
    cy: Int | Double = null,
    r: Int | Double = null,
    transform: String = null,
    viewBox: String = null,
    y1: Int | Double = null,
    y2: Int | Double = null
  ): SpinnerData = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerData]
  }
}

