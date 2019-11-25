package typings.knuddelsDashUserappsDashApi

import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumValueMinimumValue extends js.Object {
  var maximumValue: js.UndefOr[Double] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
  var targetUsers: js.UndefOr[js.Array[User]] = js.undefined
}

object Anon_MaximumValueMinimumValue {
  @scala.inline
  def apply(
    maximumValue: Int | Double = null,
    minimumValue: Int | Double = null,
    targetUsers: js.Array[User] = null
  ): Anon_MaximumValueMinimumValue = {
    val __obj = js.Dynamic.literal()
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (targetUsers != null) __obj.updateDynamic("targetUsers")(targetUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaximumValueMinimumValue]
  }
}

