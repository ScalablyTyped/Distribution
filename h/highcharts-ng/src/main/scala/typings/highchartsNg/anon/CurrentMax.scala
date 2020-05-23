package typings.highchartsNg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentMax extends js.Object {
  var currentMax: js.UndefOr[Double] = js.undefined
  var currentMin: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[Text] = js.undefined
}

object CurrentMax {
  @scala.inline
  def apply(
    currentMax: js.UndefOr[Double] = js.undefined,
    currentMin: js.UndefOr[Double] = js.undefined,
    title: Text = null
  ): CurrentMax = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentMax)) __obj.updateDynamic("currentMax")(currentMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(currentMin)) __obj.updateDynamic("currentMin")(currentMin.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMax]
  }
}

