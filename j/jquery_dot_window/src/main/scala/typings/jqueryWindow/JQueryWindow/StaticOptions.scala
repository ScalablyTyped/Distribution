package typings.jqueryWindow.JQueryWindow

import typings.jqueryWindow.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Static options
trait StaticOptions extends js.Object {
  /**
    the speed of animations: maximize, minimize, restore, shift, in milliseconds
    **/
  var animationSpeed: js.UndefOr[Double] = js.undefined
  /**
    the direction of minimized window dock at. the available values are [left, right, top, bottom]
    **/
  var dock: js.UndefOr[String] = js.undefined
  /**
    the area which the windows will dock at
    **/
  var dockArea: js.UndefOr[JQuery | HTMLElement] = js.undefined
  /**
    to handle browser scrollbar when window status changed(maximize, minimize, cascade)
    **/
  var handleScrollbar: js.UndefOr[Boolean] = js.undefined
  /**
    the long dimension of minimized window
    **/
  var minWinLong: js.UndefOr[Double] = js.undefined
  /**
    the narrow dimension of minimized window
    **/
  var minWinNarrow: js.UndefOr[Double] = js.undefined
  /**
    to decide show log in firebug, IE8, chrome console
    **/
  var showLog: js.UndefOr[Boolean] = js.undefined
}

object StaticOptions {
  @scala.inline
  def apply(
    animationSpeed: js.UndefOr[Double] = js.undefined,
    dock: String = null,
    dockArea: JQuery | HTMLElement = null,
    handleScrollbar: js.UndefOr[Boolean] = js.undefined,
    minWinLong: js.UndefOr[Double] = js.undefined,
    minWinNarrow: js.UndefOr[Double] = js.undefined,
    showLog: js.UndefOr[Boolean] = js.undefined
  ): StaticOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationSpeed)) __obj.updateDynamic("animationSpeed")(animationSpeed.get.asInstanceOf[js.Any])
    if (dock != null) __obj.updateDynamic("dock")(dock.asInstanceOf[js.Any])
    if (dockArea != null) __obj.updateDynamic("dockArea")(dockArea.asInstanceOf[js.Any])
    if (!js.isUndefined(handleScrollbar)) __obj.updateDynamic("handleScrollbar")(handleScrollbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWinLong)) __obj.updateDynamic("minWinLong")(minWinLong.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWinNarrow)) __obj.updateDynamic("minWinNarrow")(minWinNarrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLog)) __obj.updateDynamic("showLog")(showLog.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
}

