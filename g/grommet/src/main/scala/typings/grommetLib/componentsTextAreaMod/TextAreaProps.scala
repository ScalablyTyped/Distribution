package typings
package grommetLib.componentsTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps extends js.Object {
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var focusIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[
    grommetLib.grommetLibStrings.vertical | grommetLib.grommetLibStrings.horizontal | scala.Boolean
  ] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TextAreaProps {
  @scala.inline
  def apply(
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    focusIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    name: java.lang.String = null,
    onChange: js.Function1[/* repeated */ js.Any, _] = null,
    placeholder: java.lang.String = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    resize: grommetLib.grommetLibStrings.vertical | grommetLib.grommetLibStrings.horizontal | scala.Boolean = null,
    value: java.lang.String = null
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextAreaProps]
  }
}

