package typings
package inkDashTextDashInputLib.inkDashTextDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputProps extends js.Object {
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    onSubmit: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    placeholder: java.lang.String = null,
    value: java.lang.String = null
  ): TextInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextInputProps]
  }
}

