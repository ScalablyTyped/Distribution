package typings
package inquirerLib.inquirerMod.objectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceOption
  extends inquirerLib.inquirerMod._ChoiceType {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[java.lang.String | (js.Function1[/* answers */ js.Any, _])] = js.undefined
  var extra: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChoiceOption {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: java.lang.String | (js.Function1[/* answers */ js.Any, _]) = null,
    extra: js.Any = null,
    key: java.lang.String = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null,
    value: js.Any = null
  ): ChoiceOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (key != null) __obj.updateDynamic("key")(key)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChoiceOption]
  }
}

