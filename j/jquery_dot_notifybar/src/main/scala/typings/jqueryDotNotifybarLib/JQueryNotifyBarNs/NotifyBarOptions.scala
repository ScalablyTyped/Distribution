package typings
package jqueryDotNotifybarLib.JQueryNotifyBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBarOptions extends js.Object {
  /**
    * How long this bar will be slided up and down.
    *
    * Default: "normal"
    */
  var animationSpeed: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * If set to true close button will be displayed.
    */
  var close: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If enabled, user can hide notify bar just by click on it.
    */
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If enabled, user can hide notify bar just by moving mouse cursor on it.
    */
  var closeOnOver: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the text to close button.
    */
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * You can define own CSS class for Notify bar. There are too premade classes "error", "warning" and "success".
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How long bar will be delayed, doesn't count animation time.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * What text will be inside bar. Can be HTML or just text.
    */
  var html: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom jQuery object for notify bar.
    */
  var jqObject: js.UndefOr[jqueryLib.JQuery[stdLib.HTMLElement]] = js.undefined
  /**
    * Callback on before hide.
    */
  var onBeforeHide: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Callback on before show.
    */
  var onBeforeShow: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Callback on hide.
    */
  var onHide: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Callback on show.
    */
  var onShow: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Set the position of notify bar. Possible values are "top", "bottom".
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
}

