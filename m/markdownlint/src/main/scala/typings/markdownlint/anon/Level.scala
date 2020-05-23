package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var level: js.UndefOr[Double] = js.undefined
}

object Level {
  @scala.inline
  def apply(level: js.UndefOr[Double] = js.undefined): Level = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

