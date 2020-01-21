package typings.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSkipRender extends js.Object {
  var skipRender: js.UndefOr[Boolean] = js.undefined
}

object AnonSkipRender {
  @scala.inline
  def apply(skipRender: js.UndefOr[Boolean] = js.undefined): AnonSkipRender = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipRender)) __obj.updateDynamic("skipRender")(skipRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSkipRender]
  }
}

