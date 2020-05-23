package typings.jquerySimplemodal.SimpleModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleModalOptions extends js.Object {
  /** The jQuery selector to append the elements to. For ASP.NET, use 'form'. Default: 'body'. */
  var appendTo: js.UndefOr[String] = js.undefined
  /** Automatically position the container upon creation and on window resize? Default: true. (Changed in 1.4) */
  var autoPosition: js.UndefOr[Boolean] = js.undefined
  /** Resize the container if it exceeds the browser window dimensions? Default: false. (Changed in 1.4) */
  var autoResize: js.UndefOr[Boolean] = js.undefined
  /** If true, closeHTML, escClose and overlayClose will be used if set. If false, none of them will be used. Default: true. */
  var close: js.UndefOr[Boolean] = js.undefined
  /** The CSS class used to bind to the close event. Default: 'simplemodal-close'. */
  var closeClass: js.UndefOr[String] = js.undefined
  /** The HTML for the default close link. SimpleModal will automatically add the closeClass to this element. Default: ''. */
  var closeHTML: js.UndefOr[String] = js.undefined
  /** The CSS styling for the container div. Default: {}. */
  var containerCss: js.UndefOr[js.Object] = js.undefined
  /** The DOM element id for the container div. Default: 'simplemodal-container'. */
  var containerId: js.UndefOr[String] = js.undefined
  /** The CSS styling for the data div. Default: {}. */
  var dataCss: js.UndefOr[js.Object] = js.undefined
  /** The DOM element id for the data div. Default: 'simplemodal-data'. */
  var dataId: js.UndefOr[String] = js.undefined
  /** Allow Esc keypress to close the dialog? Default: true. */
  var escClose: js.UndefOr[Boolean] = js.undefined
  /** Focus in the first visible, enabled element? Default: true. */
  var focus: js.UndefOr[Boolean] = js.undefined
  /** The maximum height for the container. If not specified, the window height is used. Default: null. */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /** The maximum width for the container. If not specified, the window width is used. Default: null. */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /** The minimum height for the container. Default: null. */
  var minHeight: js.UndefOr[Double] = js.undefined
  /** The minimum width for the container. Default: null. */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** User will be unable to interact with the page below the modal or tab away from the dialog. If false, the overlay, iframe, and certain events will be disabled allowing the user to interact with the page below the dialog. Default: true. (Added in 1.3.4. Name changed from transient in 1.3.5) */
  var modal: js.UndefOr[Boolean] = js.undefined
  /** The callback function used in place of SimpleModal's close. Default: null. */
  var onClose: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.undefined
  /** The callback function used in place of SimpleModal's open. Default: null. */
  var onOpen: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.undefined
  /** The callback function used after the modal dialog has opened. Default: null. */
  var onShow: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.undefined
  /** The opacity value for the overlay div, from 0 - 100. Default: 50. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Allow click on overlay to close the dialog? Default: false. */
  var overlayClose: js.UndefOr[Boolean] = js.undefined
  /** The CSS styling for the overlay div. Default: {}. */
  var overlayCss: js.UndefOr[js.Object] = js.undefined
  /** The DOM element id for the overlay div. Default: 'simplemodal-overlay'. */
  var overlayId: js.UndefOr[String] = js.undefined
  /** Persist the data across modal calls? Only used for existing DOM elements. If true, the data will be maintained across modal calls, if false, the data will be reverted to its original state. Default: true. */
  var persist: js.UndefOr[Boolean] = js.undefined
  /** Position of container [top, left]. Can be number of pixels or percentage. Default: null. */
  var position: js.UndefOr[js.Array[_]] = js.undefined
  /** Starting z-index value. Default: 1000. */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object SimpleModalOptions {
  @scala.inline
  def apply(
    appendTo: String = null,
    autoPosition: js.UndefOr[Boolean] = js.undefined,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    close: js.UndefOr[Boolean] = js.undefined,
    closeClass: String = null,
    closeHTML: String = null,
    containerCss: js.Object = null,
    containerId: String = null,
    dataCss: js.Object = null,
    dataId: String = null,
    escClose: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    onClose: /* dialog */ SimpleModalDialog => Unit = null,
    onOpen: /* dialog */ SimpleModalDialog => Unit = null,
    onShow: /* dialog */ SimpleModalDialog => Unit = null,
    opacity: js.UndefOr[Double] = js.undefined,
    overlayClose: js.UndefOr[Boolean] = js.undefined,
    overlayCss: js.Object = null,
    overlayId: String = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    position: js.Array[_] = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): SimpleModalOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPosition)) __obj.updateDynamic("autoPosition")(autoPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.get.asInstanceOf[js.Any])
    if (closeClass != null) __obj.updateDynamic("closeClass")(closeClass.asInstanceOf[js.Any])
    if (closeHTML != null) __obj.updateDynamic("closeHTML")(closeHTML.asInstanceOf[js.Any])
    if (containerCss != null) __obj.updateDynamic("containerCss")(containerCss.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (dataCss != null) __obj.updateDynamic("dataCss")(dataCss.asInstanceOf[js.Any])
    if (dataId != null) __obj.updateDynamic("dataId")(dataId.asInstanceOf[js.Any])
    if (!js.isUndefined(escClose)) __obj.updateDynamic("escClose")(escClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayClose)) __obj.updateDynamic("overlayClose")(overlayClose.get.asInstanceOf[js.Any])
    if (overlayCss != null) __obj.updateDynamic("overlayCss")(overlayCss.asInstanceOf[js.Any])
    if (overlayId != null) __obj.updateDynamic("overlayId")(overlayId.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleModalOptions]
  }
}

