package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimumValue extends js.Object {
  var maximumValue: js.UndefOr[Double] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
  var targetUsers: js.UndefOr[js.Array[User]] = js.undefined
}

object MinimumValue {
  @scala.inline
  def apply(
    maximumValue: js.UndefOr[Double] = js.undefined,
    minimumValue: js.UndefOr[Double] = js.undefined,
    targetUsers: js.Array[User] = null
  ): MinimumValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximumValue)) __obj.updateDynamic("maximumValue")(maximumValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumValue)) __obj.updateDynamic("minimumValue")(minimumValue.get.asInstanceOf[js.Any])
    if (targetUsers != null) __obj.updateDynamic("targetUsers")(targetUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumValue]
  }
}

