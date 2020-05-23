package typings.handsontable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipRender extends js.Object {
  var skipRender: js.UndefOr[Boolean] = js.undefined
}

object SkipRender {
  @scala.inline
  def apply(skipRender: js.UndefOr[Boolean] = js.undefined): SkipRender = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipRender)) __obj.updateDynamic("skipRender")(skipRender.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipRender]
  }
}

