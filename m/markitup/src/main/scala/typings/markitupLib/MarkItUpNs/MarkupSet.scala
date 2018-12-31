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

