package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteOptions extends js.Object {
  /**
    * Indicate if the autocomplete is going to be strict case-sensitive to match the options.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicate the KeyCodes for trigger confirm completion, by default those keys are: `[39, 35, 9]` which are the code for `[right, end, tab]`.
    * @default [39, 35, 9]
    */
  var confirmKeys: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Pick one of the two strategies, or define a custom filter function.
    *
    * 'start': Match your input from the start, e.g. 'ap' matches 'apple' but 'pl' does not.
    *
    * 'contain': Contains the user's input or not, e.g. 'pl' matches 'apple' too.
    */
  var filter: js.UndefOr[AutoCompleteMatchingStrategy | (js.Function1[/* query */ String, Boolean])] = js.undefined
  /**
    * This function will return your possible options for create the autocomplete selection,
    * you can control dynamically which options you want to display according to the current active editing node.
    * @param text The text in the current node part (basically the text that the user is editing).
    * @param path The path of the node that is being edited as an array.
    * @param input Can be 'field' or 'value' depending if the user is editing a field name or a value of a node.
    * @param editor The editor instance object that is being edited.
    */
  var getOptions: js.UndefOr[
    js.Function4[
      /* text */ String, 
      /* path */ JSONPath, 
      /* input */ AutoCompleteElementType, 
      /* editor */ JSONEditor, 
      AutoCompleteCompletion | js.Promise[AutoCompleteCompletion]
    ]
  ] = js.undefined
  /**
    * Indicate the way to trigger autocomplete menu.
    *
    * 'keydown': When you type something in the field or value, it will trigger autocomplete immediately.
    *
    * 'focus': When you focus in the field or value, it will trigger the autocomplete.
    * @default 'keydown'
    */
  var trigger: js.UndefOr[AutoCompleteTrigger] = js.undefined
}

object AutoCompleteOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    confirmKeys: js.Array[Double] = null,
    filter: AutoCompleteMatchingStrategy | (js.Function1[/* query */ String, Boolean]) = null,
    getOptions: (/* text */ String, /* path */ JSONPath, /* input */ AutoCompleteElementType, /* editor */ JSONEditor) => AutoCompleteCompletion | js.Promise[AutoCompleteCompletion] = null,
    trigger: AutoCompleteTrigger = null
  ): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (confirmKeys != null) __obj.updateDynamic("confirmKeys")(confirmKeys.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (getOptions != null) __obj.updateDynamic("getOptions")(js.Any.fromFunction4(getOptions))
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteOptions]
  }
}

