package typings.gulpIf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatFilterCondition extends js.Object {
  var isDirectory: js.UndefOr[Boolean] = js.undefined
  var isFile: js.UndefOr[Boolean] = js.undefined
}

object StatFilterCondition {
  @scala.inline
  def apply(isDirectory: js.UndefOr[Boolean] = js.undefined, isFile: js.UndefOr[Boolean] = js.undefined): StatFilterCondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDirectory)) __obj.updateDynamic("isDirectory")(isDirectory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFile)) __obj.updateDynamic("isFile")(isFile.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatFilterCondition]
  }
}

