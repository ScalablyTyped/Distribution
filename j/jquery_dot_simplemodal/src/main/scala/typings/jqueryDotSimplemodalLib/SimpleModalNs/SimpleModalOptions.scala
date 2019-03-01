package typings
package jqueryDotSimplemodalLib.SimpleModalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleModalOptions extends js.Object {
  /** The jQuery selector to append the elements to. For ASP.NET, use 'form'. Default: 'body'. */
  var appendTo: js.UndefOr[java.lang.String] = js.undefined
  /** Automatically position the container upon creation and on window resize? Default: true. (Changed in 1.4) */
  var autoPosition: js.UndefOr[scala.Boolean] = js.undefined
  /** Resize the container if it exceeds the browser window dimensions? Default: false. (Changed in 1.4) */
  var autoResize: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, closeHTML, escClose and overlayClose will be used if set. If false, none of them will be used. Default: true. */
  var close: js.UndefOr[scala.Boolean] = js.undefined
  /** The CSS class used to bind to the close event. Default: 'simplemodal-close'. */
  var closeClass: js.UndefOr[java.lang.String] = js.undefined
  /** The HTML for the default close link. SimpleModal will automatically add the closeClass to this element. Default: ''. */
  var closeHTML: js.UndefOr[java.lang.String] = js.undefined
  /** The CSS styling for the container div. Default: {}. */
  var containerCss: js.UndefOr[js.Object] = js.undefined
  /** The DOM element id for the container div. Default: 'simplemodal-container'. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** The CSS styling for the data div. Default: {}. */
  var dataCss: js.UndefOr[js.Object] = js.undefined
  /** The DOM element id for the data div. Default: 'simplemodal-data'. */
  var dataId: js.UndefOr[java.lang.String] = js.undefined
  /** Allow Esc keypress to close the dialog? Default: true. */
  var escClose: js.UndefOr[scala.Boolean] = js.undefined
  /** Focus in the first visible, enabled element? Default: true. */
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  /** The maximum height for the container. If not specified, the window height is used. Default: null. */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /** The maximum width for the container. If not specified, the window width is used. Default: null. */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /** The minimum height for the container. Default: null. */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /** The minimum width for the container. Default: null. */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /** User will be unable to interact with the page below the modal or tab away from the dialog. If false, the overlay, iframe, and certain events will be disabled allowing the user to interact with the page below the dialog. Default: true. (Added in 1.3.4. Name changed from transient in 1.3.5) */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /** The callback function used in place of SimpleModal's close. Default: null. */
  var onClose: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, scala.Unit]] = js.undefined
  /** The callback function used in place of SimpleModal's open. Default: null. */
  var onOpen: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, scala.Unit]] = js.undefined
  /** The callback function used after the modal dialog has opened. Default: null. */
  var onShow: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, scala.Unit]] = js.undefined
  /** The opacity value for the overlay div, from 0 - 100. Default: 50. */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Allow click on overlay to close the dialog? Default: false. */
  var overlayClose: js.UndefOr[scala.Boolean] = js.undefined
  /** The CSS styling for the overlay div. Default: {}. */
  var overlayCss: js.UndefOr[js.Object] = js.undefined
  /** The DOM element id for the overlay div. Default: 'simplemodal-overlay'. */
  var overlayId: js.UndefOr[java.lang.String] = js.undefined
  /** Persist the data across modal calls? Only used for existing DOM elements. If true, the data will be maintained across modal calls, if false, the data will be reverted to its original state. Default: true. */
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  /** Position of container [top, left]. Can be number of pixels or percentage. Default: null. */
  var position: js.UndefOr[js.Array[_]] = js.undefined
  /** Starting z-index value. Default: 1000. */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object SimpleModalOptions {
  @scala.inline
  def apply(
    appendTo: java.lang.String = null,
    autoPosition: js.UndefOr[scala.Boolean] = js.undefined,
    autoResize: js.UndefOr[scala.Boolean] = js.undefined,
    close: js.UndefOr[scala.Boolean] = js.undefined,
    closeClass: java.lang.String = null,
    closeHTML: java.lang.String = null,
    containerCss: js.Object = null,
    containerId: java.lang.String = null,
    dataCss: js.Object = null,
    dataId: java.lang.String = null,
    escClose: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: js.Function1[/* dialog */ SimpleModalDialog, scala.Unit] = null,
    onOpen: js.Function1[/* dialog */ SimpleModalDialog, scala.Unit] = null,
    onShow: js.Function1[/* dialog */ SimpleModalDialog, scala.Unit] = null,
    opacity: scala.Int | scala.Double = null,
    overlayClose: js.UndefOr[scala.Boolean] = js.undefined,
    overlayCss: js.Object = null,
    overlayId: java.lang.String = null,
    persist: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.Array[_] = null,
    zIndex: scala.Int | scala.Double = null
  ): SimpleModalOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoPosition)) __obj.updateDynamic("autoPosition")(autoPosition)
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close)
    if (closeClass != null) __obj.updateDynamic("closeClass")(closeClass)
    if (closeHTML != null) __obj.updateDynamic("closeHTML")(closeHTML)
    if (containerCss != null) __obj.updateDynamic("containerCss")(containerCss)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (dataCss != null) __obj.updateDynamic("dataCss")(dataCss)
    if (dataId != null) __obj.updateDynamic("dataId")(dataId)
    if (!js.isUndefined(escClose)) __obj.updateDynamic("escClose")(escClose)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayClose)) __obj.updateDynamic("overlayClose")(overlayClose)
    if (overlayCss != null) __obj.updateDynamic("overlayCss")(overlayCss)
    if (overlayId != null) __obj.updateDynamic("overlayId")(overlayId)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    if (position != null) __obj.updateDynamic("position")(position)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleModalOptions]
  }
}

