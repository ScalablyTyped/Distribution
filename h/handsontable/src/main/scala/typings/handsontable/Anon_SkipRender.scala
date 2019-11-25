package typings.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SkipRender extends js.Object {
  var skipRender: js.UndefOr[Boolean] = js.undefined
}

object Anon_SkipRender {
  @scala.inline
  def apply(skipRender: js.UndefOr[Boolean] = js.undefined): Anon_SkipRender = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipRender)) __obj.updateDynamic("skipRender")(skipRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SkipRender]
  }
}

