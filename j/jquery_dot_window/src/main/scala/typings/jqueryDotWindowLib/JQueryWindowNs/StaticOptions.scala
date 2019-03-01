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

object StaticOptions {
  @scala.inline
  def apply(
    animationSpeed: scala.Int | scala.Double = null,
    dock: java.lang.String = null,
    dockArea: jqueryDotWindowLib.JQuery | stdLib.HTMLElement = null,
    handleScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    minWinLong: scala.Int | scala.Double = null,
    minWinNarrow: scala.Int | scala.Double = null,
    showLog: js.UndefOr[scala.Boolean] = js.undefined
  ): StaticOptions = {
    val __obj = js.Dynamic.literal()
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (dock != null) __obj.updateDynamic("dock")(dock)
    if (dockArea != null) __obj.updateDynamic("dockArea")(dockArea.asInstanceOf[js.Any])
    if (!js.isUndefined(handleScrollbar)) __obj.updateDynamic("handleScrollbar")(handleScrollbar)
    if (minWinLong != null) __obj.updateDynamic("minWinLong")(minWinLong.asInstanceOf[js.Any])
    if (minWinNarrow != null) __obj.updateDynamic("minWinNarrow")(minWinNarrow.asInstanceOf[js.Any])
    if (!js.isUndefined(showLog)) __obj.updateDynamic("showLog")(showLog)
    __obj.asInstanceOf[StaticOptions]
  }
}

