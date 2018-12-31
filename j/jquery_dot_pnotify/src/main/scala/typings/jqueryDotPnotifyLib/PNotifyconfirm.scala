package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyconfirm extends js.Object {
  /**
    * Where to align the buttons. (right, center, left, justify)
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The buttons to display, and their callbacks.
    */
  var buttons: js.UndefOr[js.Array[PNotifyconfirmButton]] = js.undefined
  /**
    * Make a confirmation box.
    */
  var confirm: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Make a prompt.
    */
  var prompt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classes to add to the input element of the prompt.
    */
  var prompt_class: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default value of the prompt.
    */
  var prompt_default: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the prompt should accept multiple lines of text.
    */
  var prompt_multi_line: js.UndefOr[scala.Boolean] = js.undefined
}

