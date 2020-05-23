package typings.grommet.textInputMod

import typings.grommet.anon.EnterSelect
import typings.grommet.anon.LabelValue
import typings.grommet.anon.Left
import typings.grommet.anon.Suggestion
import typings.grommet.dropMod.DropProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.PlaceHolderType
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputProps extends js.Object {
  var dropAlign: js.UndefOr[Left] = js.undefined
  var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Element] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[EnterSelect] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* x */ Suggestion, Unit]] = js.undefined
  var onSuggestionsClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSuggestionsOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var suggestions: js.UndefOr[js.Array[LabelValue | String]] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(
    dropAlign: Left = null,
    dropHeight: xsmall | small | medium | large | xlarge | String = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    icon: Element = null,
    id: String = null,
    messages: EnterSelect = null,
    name: String = null,
    onSelect: /* x */ Suggestion => Unit = null,
    onSuggestionsClose: () => Unit = null,
    onSuggestionsOpen: () => Unit = null,
    placeholder: PlaceHolderType = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | String = null,
    suggestions: js.Array[LabelValue | String] = null,
    value: String | Double = null
  ): TextInputProps = {
    val __obj = js.Dynamic.literal()
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign.asInstanceOf[js.Any])
    if (dropHeight != null) __obj.updateDynamic("dropHeight")(dropHeight.asInstanceOf[js.Any])
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSuggestionsClose != null) __obj.updateDynamic("onSuggestionsClose")(js.Any.fromFunction0(onSuggestionsClose))
    if (onSuggestionsOpen != null) __obj.updateDynamic("onSuggestionsOpen")(js.Any.fromFunction0(onSuggestionsOpen))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputProps]
  }
}

