package typings.ionicCore.alertInterfaceMod

import typings.ionicCore.ionicCoreStrings.checkbox
import typings.ionicCore.ionicCoreStrings.radio
import typings.ionicCore.ionicCoreStrings.textarea
import typings.ionicCore.mod.TextFieldTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertInput extends js.Object {
  var attributes: js.UndefOr[AlertInputAttributes | AlertTextareaAttributes] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handler: js.UndefOr[js.Function1[/* input */ AlertInput, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[String | Double] = js.undefined
  var min: js.UndefOr[String | Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[TextFieldTypes | checkbox | radio | textarea] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AlertInput {
  @scala.inline
  def apply(
    attributes: AlertInputAttributes | AlertTextareaAttributes = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    cssClass: String | js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    handler: /* input */ AlertInput => Unit = null,
    id: String = null,
    label: String = null,
    max: String | Double = null,
    min: String | Double = null,
    name: String = null,
    placeholder: String = null,
    `type`: TextFieldTypes | checkbox | radio | textarea = null,
    value: js.Any = null
  ): AlertInput = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1(handler))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertInput]
  }
}

