package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumValueMinimumValue extends js.Object {
  var maximumValue: js.UndefOr[scala.Double] = js.undefined
  var minimumValue: js.UndefOr[scala.Double] = js.undefined
  var targetUsers: js.UndefOr[
    js.Array[knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User]
  ] = js.undefined
}

object Anon_MaximumValueMinimumValue {
  @scala.inline
  def apply(
    maximumValue: scala.Int | scala.Double = null,
    minimumValue: scala.Int | scala.Double = null,
    targetUsers: js.Array[knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User] = null
  ): Anon_MaximumValueMinimumValue = {
    val __obj = js.Dynamic.literal()
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (targetUsers != null) __obj.updateDynamic("targetUsers")(targetUsers)
    __obj.asInstanceOf[Anon_MaximumValueMinimumValue]
  }
}

