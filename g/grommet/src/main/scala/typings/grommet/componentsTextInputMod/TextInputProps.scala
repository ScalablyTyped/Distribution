package typings.grommet.componentsTextInputMod

import typings.grommet.Anon_BottomLeft
import typings.grommet.Anon_EnterSelect
import typings.grommet.Anon_Label
import typings.grommet.Anon_Suggestion
import typings.grommet.componentsDropMod.DropProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputProps extends js.Object {
  var dropAlign: js.UndefOr[Anon_BottomLeft] = js.undefined
  var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[Anon_EnterSelect] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* x */ Anon_Suggestion, Unit]] = js.undefined
  var onSuggestionsClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSuggestionsOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var placeholder: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlaceHolderType */ js.Any
  ] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var suggestions: js.UndefOr[js.Array[Anon_Label | String]] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(
    dropAlign: Anon_BottomLeft = null,
    dropHeight: xsmall | small | medium | large | xlarge | String = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    messages: Anon_EnterSelect = null,
    name: String = null,
    onSelect: /* x */ Anon_Suggestion => Unit = null,
    onSuggestionsClose: /* repeated */ js.Any => _ = null,
    onSuggestionsOpen: /* repeated */ js.Any => _ = null,
    placeholder: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlaceHolderType */ js.Any = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | String = null,
    suggestions: js.Array[Anon_Label | String] = null,
    value: String | Double = null
  ): TextInputProps = {
    val __obj = js.Dynamic.literal()
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign)
    if (dropHeight != null) __obj.updateDynamic("dropHeight")(dropHeight.asInstanceOf[js.Any])
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator)
    if (id != null) __obj.updateDynamic("id")(id)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSuggestionsClose != null) __obj.updateDynamic("onSuggestionsClose")(js.Any.fromFunction1(onSuggestionsClose))
    if (onSuggestionsOpen != null) __obj.updateDynamic("onSuggestionsOpen")(js.Any.fromFunction1(onSuggestionsOpen))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputProps]
  }
}

