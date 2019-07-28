package typings.inquirer.inquirerMod.objectsNs

import typings.inquirer.inquirerMod._ChoiceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceOption[A] extends _ChoiceType[A] {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[String | (js.Function1[/* answers */ js.Any, _])] = js.undefined
  var extra: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var short: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChoiceOption {
  @scala.inline
  def apply[A](
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: String | (js.Function1[/* answers */ js.Any, _]) = null,
    extra: js.Any = null,
    key: String = null,
    name: String = null,
    short: String = null,
    `type`: String = null,
    value: js.Any = null
  ): ChoiceOption[A] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (key != null) __obj.updateDynamic("key")(key)
    if (name != null) __obj.updateDynamic("name")(name)
    if (short != null) __obj.updateDynamic("short")(short)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChoiceOption[A]]
  }
}

