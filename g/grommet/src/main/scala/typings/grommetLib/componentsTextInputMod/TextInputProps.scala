package typings
package grommetLib.componentsTextInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputProps extends js.Object {
  var dropAlign: js.UndefOr[grommetLib.Anon_BottomLeft] = js.undefined
  var dropHeight: js.UndefOr[
    grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var dropProps: js.UndefOr[grommetLib.componentsDropMod.DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var focusIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var messages: js.UndefOr[grommetLib.Anon_EnterSelect] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* x */ grommetLib.Anon_Suggestion, scala.Unit]] = js.undefined
  var onSuggestionsClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSuggestionsOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var suggestions: js.UndefOr[js.Array[grommetLib.Anon_Label | java.lang.String]] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(
    dropAlign: grommetLib.Anon_BottomLeft = null,
    dropHeight: grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    dropProps: grommetLib.componentsDropMod.DropProps = null,
    dropTarget: js.Object = null,
    focusIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    messages: grommetLib.Anon_EnterSelect = null,
    name: java.lang.String = null,
    onSelect: /* x */ grommetLib.Anon_Suggestion => scala.Unit = null,
    onSuggestionsClose: /* repeated */ js.Any => _ = null,
    onSuggestionsOpen: /* repeated */ js.Any => _ = null,
    placeholder: java.lang.String | reactLib.reactMod.ReactNode = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    size: grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    suggestions: js.Array[grommetLib.Anon_Label | java.lang.String] = null,
    value: java.lang.String | scala.Double = null
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
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputProps]
  }
}

