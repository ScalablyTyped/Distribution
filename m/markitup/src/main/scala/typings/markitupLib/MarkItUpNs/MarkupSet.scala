package typings
package markitupLib.MarkItUpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkupSet extends js.Object {
  /**
    * Function to be called just after a markup insertion. If a global afterInsert callback is already defined this function is fired before.
    */
  var afterInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, java.lang.String]] = js.undefined
  /**
    * Function to be called after a multiline markup insertion.
    */
  var afterMultiInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, java.lang.String]] = js.undefined
  /**
    * Returns true if the Alt key is pressed when the callback is fired.
    */
  var altKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function to be called just before a markup insertion. If a global beforeInsert callback is already defined this function is fired just after.
    */
  var beforeInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, java.lang.String]] = js.undefined
  /**
    * Function to be called before a multiline markup insertion.
    */
  var beforeMultiInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, java.lang.String]] = js.undefined
  /**
    * Returns the position of the selection.
    */
  var caretPosition: js.UndefOr[scala.Double] = js.undefined
  /**
    * Classname to be applied to this very button.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text to be added after a whole block. Accepts functions.
    */
  var closeBlockWith: js.UndefOr[java.lang.String | (js.Function1[/* h */ this.type, java.lang.String])] = js.undefined
  /**
    * Markup to be added after selection. Accepts functions.
    */
  var closeWith: js.UndefOr[java.lang.String | (js.Function1[/* h */ this.type, java.lang.String])] = js.undefined
  /**
    * Returns true if the Control key is pressed when the callback is fired.
    */
  var ctrlKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Open a dropdown menu with another button set.
    */
  var dropMenu: js.UndefOr[js.Array[MarkupSet]] = js.undefined
  /**
    * Keep (true) or not (false) the default behaviour of the key.
    */
  var keepDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shortcut key to be applied to the button. Ctrl+key trigger the action of a button.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If a multi-line edition is trigged (Ctrl + Shift + click). This property return the number of the line being processed.
    */
  var line: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set whether the tags has to be inserted at each line or on the whole selected block.
    */
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Button name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text to be added before a whole block. Accepts functions.
    */
  var openBlockWith: js.UndefOr[java.lang.String | (js.Function1[/* h */ this.type, java.lang.String])] = js.undefined
  /**
    * Markup to be added before selection. Accepts functions.
    */
  var openWith: js.UndefOr[java.lang.String | (js.Function1[/* h */ this.type, java.lang.String])] = js.undefined
  /**
    * Placeholder text to be inserted if no text is selected by the user.
    */
  var placeHolder: js.UndefOr[java.lang.String | (js.Function1[/* h */ this.type, java.lang.String])] = js.undefined
  /**
    * Text to be added in place of the cursor or selection. Accepts functions.
    */
  var replaceWith: js.UndefOr[java.lang.String | (js.Function1[/* h */ this.type, java.lang.String])] = js.undefined
  /**
    * Returns the position of the scrollbar.
    */
  var scrollPosition: js.UndefOr[scala.Double] = js.undefined
  /**
    * Returns the selection.
    */
  var selection: js.UndefOr[java.lang.String] = js.undefined
  /** Not documented on the markitup site, but present in the tests */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returns true if the Shift key is pressed when the callback is fired.
    */
  var shiftKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Returns the textarea object.
    */
  var textarea: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object MarkupSet {
  @scala.inline
  def apply(
    afterInsert: js.Function1[/* h */ MarkupSet, java.lang.String] = null,
    afterMultiInsert: js.Function1[/* h */ MarkupSet, java.lang.String] = null,
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    beforeInsert: js.Function1[/* h */ MarkupSet, java.lang.String] = null,
    beforeMultiInsert: js.Function1[/* h */ MarkupSet, java.lang.String] = null,
    caretPosition: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    closeBlockWith: java.lang.String | (js.Function1[MarkupSet, java.lang.String]) = null,
    closeWith: java.lang.String | (js.Function1[MarkupSet, java.lang.String]) = null,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    dropMenu: js.Array[MarkupSet] = null,
    keepDefault: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    line: scala.Int | scala.Double = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    openBlockWith: java.lang.String | (js.Function1[MarkupSet, java.lang.String]) = null,
    openWith: java.lang.String | (js.Function1[MarkupSet, java.lang.String]) = null,
    placeHolder: java.lang.String | (js.Function1[MarkupSet, java.lang.String]) = null,
    replaceWith: java.lang.String | (js.Function1[MarkupSet, java.lang.String]) = null,
    scrollPosition: scala.Int | scala.Double = null,
    selection: java.lang.String = null,
    separator: java.lang.String = null,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    textarea: stdLib.HTMLElement = null
  ): MarkupSet = {
    val __obj = js.Dynamic.literal()
    if (afterInsert != null) __obj.updateDynamic("afterInsert")(afterInsert)
    if (afterMultiInsert != null) __obj.updateDynamic("afterMultiInsert")(afterMultiInsert)
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(beforeInsert)
    if (beforeMultiInsert != null) __obj.updateDynamic("beforeMultiInsert")(beforeMultiInsert)
    if (caretPosition != null) __obj.updateDynamic("caretPosition")(caretPosition.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (closeBlockWith != null) __obj.updateDynamic("closeBlockWith")(closeBlockWith.asInstanceOf[js.Any])
    if (closeWith != null) __obj.updateDynamic("closeWith")(closeWith.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (dropMenu != null) __obj.updateDynamic("dropMenu")(dropMenu)
    if (!js.isUndefined(keepDefault)) __obj.updateDynamic("keepDefault")(keepDefault)
    if (key != null) __obj.updateDynamic("key")(key)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (name != null) __obj.updateDynamic("name")(name)
    if (openBlockWith != null) __obj.updateDynamic("openBlockWith")(openBlockWith.asInstanceOf[js.Any])
    if (openWith != null) __obj.updateDynamic("openWith")(openWith.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(replaceWith.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (textarea != null) __obj.updateDynamic("textarea")(textarea)
    __obj.asInstanceOf[MarkupSet]
  }
}

