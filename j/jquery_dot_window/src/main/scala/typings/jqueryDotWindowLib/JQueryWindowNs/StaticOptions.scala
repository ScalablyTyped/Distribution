package typings
package jqueryDotWindowLib.JQueryWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Static options
trait StaticOptions extends js.Object {
  /**
    the speed of animations: maximize, minimize, restore, shift, in milliseconds
    **/
  var animationSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
    the direction of minimized window dock at. the available values are [left, right, top, bottom]
    **/
  var dock: js.UndefOr[java.lang.String] = js.undefined
  /**
    the area which the windows will dock at
    **/
  var dockArea: js.UndefOr[jqueryDotWindowLib.JQuery | stdLib.HTMLElement] = js.undefined
  /**
    to handle browser scrollbar when window status changed(maximize, minimize, cascade)
    **/
  var handleScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    the long dimension of minimized window
    **/
  var minWinLong: js.UndefOr[scala.Double] = js.undefined
  /**
    the narrow dimension of minimized window
    **/
  var minWinNarrow: js.UndefOr[scala.Double] = js.undefined
  /**
    to decide show log in firebug, IE8, chrome console
    **/
  var showLog: js.UndefOr[scala.Boolean] = js.undefined
}

