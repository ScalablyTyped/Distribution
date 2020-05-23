package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefsReverseArrowOptions extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var markerHeight: js.UndefOr[Double] = js.undefined
  var markerWidth: js.UndefOr[Double] = js.undefined
  var refX: js.UndefOr[Double] = js.undefined
  var refY: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[Boolean] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
}

object DefsReverseArrowOptions {
  @scala.inline
  def apply(
    id: String = null,
    markerHeight: js.UndefOr[Double] = js.undefined,
    markerWidth: js.UndefOr[Double] = js.undefined,
    refX: js.UndefOr[Double] = js.undefined,
    refY: js.UndefOr[Double] = js.undefined,
    render: js.UndefOr[Boolean] = js.undefined,
    tagName: String = null
  ): DefsReverseArrowOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(markerHeight)) __obj.updateDynamic("markerHeight")(markerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markerWidth)) __obj.updateDynamic("markerWidth")(markerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refX)) __obj.updateDynamic("refX")(refX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refY)) __obj.updateDynamic("refY")(refY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(render)) __obj.updateDynamic("render")(render.get.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefsReverseArrowOptions]
  }
}

