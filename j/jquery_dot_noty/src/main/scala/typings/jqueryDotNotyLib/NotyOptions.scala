package typings
package jqueryDotNotyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotyOptions extends js.Object {
  var animation: js.UndefOr[NotyAnimationOptions] = js.undefined
  /** an array of buttons, for creating confirmation dialogs. */
  var buttons: js.UndefOr[js.Any] = js.undefined
  var callback: js.UndefOr[NotyCallbackOptions] = js.undefined
  /** backdrop click will close all notifications */
  var closeWith: js.UndefOr[
    js.Array[
      jqueryDotNotyLib.jqueryDotNotyLibStrings.click | jqueryDotNotyLib.jqueryDotNotyLibStrings.button | jqueryDotNotyLib.jqueryDotNotyLibStrings.hover | jqueryDotNotyLib.jqueryDotNotyLibStrings.backdrop
    ]
  ] = js.undefined
  /** If you want to use queue feature set this true. */
  var dismissQueue: js.UndefOr[scala.Boolean] = js.undefined
  /** adds notification to the beginning of queue when set to true */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /** if true closes all notifications and shows itself */
  var killer: js.UndefOr[scala.Boolean] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /** You can set max visible notification for dismissQueue true option */
  var maxVisible: js.UndefOr[scala.Double] = js.undefined
  /** if true adds an overlay */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /** displays a progress bar */
  var progressBar: js.UndefOr[scala.Boolean] = js.undefined
  /** The note`s optional template like '<div class="noty_message"><span class="noty_text"></span><div class="noty_close"></div></div>' */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Text to show. Can be html or string. */
  var text: js.UndefOr[java.lang.String] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /** Delay for closing event. Set false for sticky notifications */
  var timeout: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

