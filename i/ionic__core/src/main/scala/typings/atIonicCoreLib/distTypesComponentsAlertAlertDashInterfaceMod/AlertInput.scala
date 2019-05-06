package typings
package atIonicCoreLib.distTypesComponentsAlertAlertDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertInput extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var handler: js.UndefOr[js.Function1[/* input */ AlertInput, scala.Unit]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var min: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextFieldTypes */ js.Any) | atIonicCoreLib.atIonicCoreLibStrings.checkbox | atIonicCoreLib.atIonicCoreLibStrings.radio
  ] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AlertInput {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    handler: /* input */ AlertInput => scala.Unit = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    max: java.lang.String | scala.Double = null,
    min: java.lang.String | scala.Double = null,
    name: java.lang.String = null,
    placeholder: java.lang.String = null,
    `type`: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextFieldTypes */ js.Any) | atIonicCoreLib.atIonicCoreLibStrings.checkbox | atIonicCoreLib.atIonicCoreLibStrings.radio = null,
    value: js.Any = null
  ): AlertInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1(handler))
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AlertInput]
  }
}

