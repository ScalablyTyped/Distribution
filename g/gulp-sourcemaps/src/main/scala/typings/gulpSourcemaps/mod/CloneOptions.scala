package typings.gulpSourcemaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOptions extends js.Object {
  var contents: js.UndefOr[Boolean] = js.undefined
  var deep: js.UndefOr[Boolean] = js.undefined
}

object CloneOptions {
  @scala.inline
  def apply(contents: js.UndefOr[Boolean] = js.undefined, deep: js.UndefOr[Boolean] = js.undefined): CloneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contents)) __obj.updateDynamic("contents")(contents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneOptions]
  }
}

