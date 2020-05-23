package typings.markitup.MarkItUp

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkupSet extends js.Object {
  /**
    * Function to be called just after a markup insertion. If a global afterInsert callback is already defined this function is fired before.
    */
  var afterInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.undefined
  /**
    * Function to be called after a multiline markup insertion.
    */
  var afterMultiInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.undefined
  /**
    * Returns true if the Alt key is pressed when the callback is fired.
    */
  var altKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Function to be called just before a markup insertion. If a global beforeInsert callback is already defined this function is fired just after.
    */
  var beforeInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.undefined
  /**
    * Function to be called before a multiline markup insertion.
    */
  var beforeMultiInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.undefined
  /**
    * Returns the position of the selection.
    */
  var caretPosition: js.UndefOr[Double] = js.undefined
  /**
    * Classname to be applied to this very button.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Text to be added after a whole block. Accepts functions.
    */
  var closeBlockWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
  /**
    * Markup to be added after selection. Accepts functions.
    */
  var closeWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
  /**
    * Returns true if the Control key is pressed when the callback is fired.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Open a dropdown menu with another button set.
    */
  var dropMenu: js.UndefOr[js.Array[MarkupSet]] = js.undefined
  /**
    * Keep (true) or not (false) the default behaviour of the key.
    */
  var keepDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Shortcut key to be applied to the button. Ctrl+key trigger the action of a button.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * If a multi-line edition is trigged (Ctrl + Shift + click). This property return the number of the line being processed.
    */
  var line: js.UndefOr[Double] = js.undefined
  /**
    * Set whether the tags has to be inserted at each line or on the whole selected block.
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Button name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Text to be added before a whole block. Accepts functions.
    */
  var openBlockWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
  /**
    * Markup to be added before selection. Accepts functions.
    */
  var openWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
  /**
    * Placeholder text to be inserted if no text is selected by the user.
    */
  var placeHolder: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
  /**
    * Text to be added in place of the cursor or selection. Accepts functions.
    */
  var replaceWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.undefined
  /**
    * Returns the position of the scrollbar.
    */
  var scrollPosition: js.UndefOr[Double] = js.undefined
  /**
    * Returns the selection.
    */
  var selection: js.UndefOr[String] = js.undefined
  /** Not documented on the markitup site, but present in the tests */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Returns true if the Shift key is pressed when the callback is fired.
    */
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Returns the textarea object.
    */
  var textarea: js.UndefOr[HTMLElement] = js.undefined
}

object MarkupSet {
  @scala.inline
  def apply(
    afterInsert: /* h */ MarkupSet => String = null,
    afterMultiInsert: /* h */ MarkupSet => String = null,
    altKey: js.UndefOr[Boolean] = js.undefined,
    beforeInsert: /* h */ MarkupSet => String = null,
    beforeMultiInsert: /* h */ MarkupSet => String = null,
    caretPosition: js.UndefOr[Double] = js.undefined,
    className: String = null,
    closeBlockWith: String | (js.Function1[MarkupSet, String]) = null,
    closeWith: String | (js.Function1[MarkupSet, String]) = null,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    dropMenu: js.Array[MarkupSet] = null,
    keepDefault: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    line: js.UndefOr[Double] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    openBlockWith: String | (js.Function1[MarkupSet, String]) = null,
    openWith: String | (js.Function1[MarkupSet, String]) = null,
    placeHolder: String | (js.Function1[MarkupSet, String]) = null,
    replaceWith: String | (js.Function1[MarkupSet, String]) = null,
    scrollPosition: js.UndefOr[Double] = js.undefined,
    selection: String = null,
    separator: String = null,
    shiftKey: js.UndefOr[Boolean] = js.undefined,
    textarea: HTMLElement = null
  ): MarkupSet = {
    val __obj = js.Dynamic.literal()
    if (afterInsert != null) __obj.updateDynamic("afterInsert")(js.Any.fromFunction1(afterInsert))
    if (afterMultiInsert != null) __obj.updateDynamic("afterMultiInsert")(js.Any.fromFunction1(afterMultiInsert))
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.get.asInstanceOf[js.Any])
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction1(beforeInsert))
    if (beforeMultiInsert != null) __obj.updateDynamic("beforeMultiInsert")(js.Any.fromFunction1(beforeMultiInsert))
    if (!js.isUndefined(caretPosition)) __obj.updateDynamic("caretPosition")(caretPosition.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeBlockWith != null) __obj.updateDynamic("closeBlockWith")(closeBlockWith.asInstanceOf[js.Any])
    if (closeWith != null) __obj.updateDynamic("closeWith")(closeWith.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.get.asInstanceOf[js.Any])
    if (dropMenu != null) __obj.updateDynamic("dropMenu")(dropMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(keepDefault)) __obj.updateDynamic("keepDefault")(keepDefault.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (openBlockWith != null) __obj.updateDynamic("openBlockWith")(openBlockWith.asInstanceOf[js.Any])
    if (openWith != null) __obj.updateDynamic("openWith")(openWith.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(replaceWith.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPosition)) __obj.updateDynamic("scrollPosition")(scrollPosition.get.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.get.asInstanceOf[js.Any])
    if (textarea != null) __obj.updateDynamic("textarea")(textarea.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkupSet]
  }
}

