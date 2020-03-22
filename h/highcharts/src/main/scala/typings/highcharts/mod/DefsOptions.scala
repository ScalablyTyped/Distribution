package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefsOptions extends js.Object {
  var arrow: js.UndefOr[DefsArrowOptions | SVGDefinitionObject] = js.undefined
  var `reverse-arrow`: js.UndefOr[DefsReverseArrowOptions | SVGDefinitionObject] = js.undefined
}

object DefsOptions {
  @scala.inline
  def apply(
    arrow: DefsArrowOptions | SVGDefinitionObject = null,
    `reverse-arrow`: DefsReverseArrowOptions | SVGDefinitionObject = null
  ): DefsOptions = {
    val __obj = js.Dynamic.literal()
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (`reverse-arrow` != null) __obj.updateDynamic("reverse-arrow")(`reverse-arrow`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefsOptions]
  }
}

