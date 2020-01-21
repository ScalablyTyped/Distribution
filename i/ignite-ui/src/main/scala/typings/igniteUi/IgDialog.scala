package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDialog
  extends /**
	 * Option for igDialog
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event which is raised after the end of the animation when the dialog was closed or opened.
  	 */
  var animationEnded: js.UndefOr[AnimationEndedEvent] = js.undefined
  /**
  	 * Event which is raised when the dialog or its content loses focus.
  	 */
  var blur: js.UndefOr[BlurEvent] = js.undefined
  /**
  	 * Gets/Sets the animation applied to the dialog when it is closed. That can be any object supported by the jquery hide(param) method.
  	 *
  	 */
  var closeAnimation: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the close button in the dialog. Use option [locale.closeButtonTitle](ui.igdialog#options:locale.closeButtonTitle).
  	 */
  var closeButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets whether the dialog should close when Esc key is pressed.
  	 *
  	 */
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the container html element for the dialog.
  	 * That can be reference to html element, jquery selector or jquery object.
  	 * By default the parent form of the original target element is used. If a form is not found, then the body is used.
  	 * Note: If the "position" of the container is not set or it is "static", then the position is set to "relative".
  	 *
  	 */
  var container: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the name of the css class which is applied to the main DIV element of the dialog.
  	 *
  	 */
  var dialogClass: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets whether the dialog can be dragged by the user.
  	 *
  	 */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the processing of the double-click on the dialog-header.If this option is not false and dialog was minimized, then its state will be set to normal.
  	 * If this option is set to "auto" and showMaximizeButton is enabled or if this option is set to true, then the dialog will be maximized when it was in normal state,
  	 * and dialog-state will be set to normal if it was maximized.
  	 *
  	 */
  var enableDblclick: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets the ability to adjust the state of the header depending on focused and not-focused states. Note: the "trackFocus" option should be enabled.
  	 *
  	 */
  var enableHeaderFocus: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event which is raised when the dialog or its content gets focus.
  	 */
  var focus: js.UndefOr[IgFocusEvent] = js.undefined
  /**
  	 * Gets/Sets the text which appears in the footer of the dialog.
  	 *
  	 */
  var footerText: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the text which appears in the header of the dialog.
  	 *
  	 */
  var headerText: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the initial height of the dialog in pixels for normal state.Besides numeric values, following units are supported: "px", "em" and "%".
  	 * In case of "%", the size of browser window is used and it has effect only on open action.
  	 *
  	 */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
  	 * Gets the name of the css class which is applied to the SPAN element located on the left side of the header.
  	 *
  	 */
  var imageClass: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[IgDialogLocale] = js.undefined
  /**
  	 * Gets the jquery DIV object which is used as the main container for the dialog.
  	 * Notes:
  	 * 1. That object is optional and it should not contain any children.
  	 * 2. It should not have parent.
  	 * 3. It should not contain attributes which might destroy layout or appearance of the dialog.
  	 * 4. Change of that option is not supported.
  	 *
  	 */
  var mainElement: js.UndefOr[Element] = js.undefined
  /**
  	 * Gets/Sets the maximal height of the dialog in normal state. Note: that option has effect only while resizing the dialog by the end user.
  	 *
  	 */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets the maximal width of the dialog in normal state. Note: that option has effect only while resizing the dialog by the end user.
  	 *
  	 */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the maximize button in the dialog. Use option [locale.minimizeButtonTitle](ui.igdialog#options:locale.minimizeButtonTitle).
  	 */
  var maximizeButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the minimal height of the dialog in normal state.
  	 *
  	 */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets the minimal width of the dialog in normal state.
  	 *
  	 */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the minimize button in the dialog. Use option [locale.minimizeButtonTitle](ui.igdialog#options:locale.minimizeButtonTitle).
  	 */
  var minimizeButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the modal state of the dialog.
  	 * If there are more than 1 modal igDialog, then the last opened dialog wins and becomes on the top.
  	 * Note: the modal functionality is not supported when the dialog is minimized or pinned, because that will trigger misbehavior.
  	 *
  	 */
  var modal: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the animation applied to the dialog when it is opened. That can be any object supported by the jquery show(param) method.
  	 *
  	 */
  var openAnimation: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the pin button in the dialog. Use option [locale.pinButtonTitle](ui.igdialog#options:locale.pinButtonTitle).
  	 */
  var pinButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets whether the dialog will be pinned on minimize.
  	 *
  	 */
  var pinOnMinimized: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the dialog is pinned.
  	 * When the dialog is pinned, then the html element of the dialog is moved to the original container where the target element was located and position:absolute is removed.
  	 * The pinned dialog does not support modal state, maximized state and it can not be moved.
  	 * Notes:
  	 * 1. If the parent element of the original target-element is invisible, then the pinned dialog becomes invisible as well.
  	 * 2. Pinned state is not supported for modal dialog.
  	 *
  	 */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the initial position of the dialog. That should be an object, which contains "top" and "left" members or an object
  	 * supported by jquery.position(param) method. Examples: { left: 100, top: 200 }, { my: "left top", at: "left top", offset: "100 200" }
  	 *
  	 */
  var position: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Gets/Sets whether the dialog can be resized by the user.
  	 *
  	 */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the restore button in the dialog.  Use option [locale.restoreButtonTitle](ui.igdialog#options:locale.restoreButtonTitle).
  	 */
  var restoreButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets whether the close button in the dialog header should be visible.
  	 *
  	 */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the dialog footer should be visible.
  	 *
  	 */
  var showFooter: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the dialog header should be visible.
  	 *
  	 */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the maximize button in the dialog header should be visible.
  	 *
  	 */
  var showMaximizeButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the minimize button in the dialog header should be visible.
  	 *
  	 */
  var showMinimizeButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the pin button in the dialog header should be visible.
  	 *
  	 */
  var showPinButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the state of the dialog.Note: when the dialog is modal, then pinned and minimized states are not supported, because that will trigger misbehavior.
  	 *
  	 *
  	 * Valid values:
  	 * "opened" The dialog is opened.
  	 * "minimized" The dialog is minimized.
  	 * "maximized" The dialog is maximized.
  	 * "closed" The dialog is closed.
  	 */
  var state: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised after the state of the dialog was changed.
  	 */
  var stateChanged: js.UndefOr[StateChangedEvent] = js.undefined
  /**
  	 * Event which is raised before the state of the dialog was changed.
  	 * Return false in order to cancel the action.
  	 */
  var stateChanging: js.UndefOr[StateChangingEvent] = js.undefined
  /**
  	 * Gets/Sets the value for the tabIndex attribute applied to the main html element of the dialog.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets the temporary value for src, which is used while changing the parent of the base element if it is an instance of IFRAME. That allows getting around possible JavaScript exceptions under IE.
  	 *
  	 */
  var temporaryUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the ability to process focus and blur events of the child elements located in the dialog in order to maintain the focused state.
  	 * Notes:
  	 * If that option is enabled, then focus and blur event handlers are added to all the child elements of the dialog.
  	 * If the dialog is modal or it can be maximized, then it is not recommended to disable that option.
  	 * If that option is modified after the igDialog was already created, then depending on current state of the dialog, it will be temporary closed-opened or opened-closed.
  	 *
  	 */
  var trackFocus: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the unpin button in the dialog. Use option [locale.unpinButtonTitle](ui.igdialog#options:locale.unpinButtonTitle).
  	 */
  var unpinButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the initial width of the dialog in pixels for normal state.Besides numeric values, following units are supported: "px", "em" and "%".
  	 * In case of "%", the size of browser window is used and it has effect only on open action.
  	 *
  	 */
  var width: js.UndefOr[Double | String] = js.undefined
  /**
  	 * Gets/Sets the value of zIndex applied to the main html element of the dialog. If value is not set, then 1000 is used.
  	 *
  	 */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IgDialog {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igDialog
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animationEnded: (/* event */ Event_, /* ui */ AnimationEndedEventUIParam) => Unit = null,
    blur: (/* event */ Event_, /* ui */ BlurEventUIParam) => Unit = null,
    closeAnimation: js.Any = null,
    closeButtonTitle: String = null,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    container: js.Any = null,
    dialogClass: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    enableDblclick: js.Any = null,
    enableHeaderFocus: js.UndefOr[Boolean] = js.undefined,
    focus: (/* event */ Event_, /* ui */ IgFocusEventUIParam) => Unit = null,
    footerText: String = null,
    headerText: String = null,
    height: Double | String = null,
    imageClass: String = null,
    language: String = null,
    locale: IgDialogLocale = null,
    mainElement: Element = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    maximizeButtonTitle: String = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    minimizeButtonTitle: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    openAnimation: js.Any = null,
    pinButtonTitle: String = null,
    pinOnMinimized: js.UndefOr[Boolean] = js.undefined,
    pinned: js.UndefOr[Boolean] = js.undefined,
    position: js.Any = null,
    regional: String | js.Object = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    restoreButtonTitle: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    showMaximizeButton: js.UndefOr[Boolean] = js.undefined,
    showMinimizeButton: js.UndefOr[Boolean] = js.undefined,
    showPinButton: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    stateChanged: (/* event */ Event_, /* ui */ StateChangedEventUIParam) => Unit = null,
    stateChanging: (/* event */ Event_, /* ui */ StateChangingEventUIParam) => Unit = null,
    tabIndex: Int | Double = null,
    temporaryUrl: String = null,
    trackFocus: js.UndefOr[Boolean] = js.undefined,
    unpinButtonTitle: String = null,
    width: Double | String = null,
    zIndex: Int | Double = null
  ): IgDialog = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationEnded != null) __obj.updateDynamic("animationEnded")(js.Any.fromFunction2(animationEnded))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2(blur))
    if (closeAnimation != null) __obj.updateDynamic("closeAnimation")(closeAnimation.asInstanceOf[js.Any])
    if (closeButtonTitle != null) __obj.updateDynamic("closeButtonTitle")(closeButtonTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (dialogClass != null) __obj.updateDynamic("dialogClass")(dialogClass.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (enableDblclick != null) __obj.updateDynamic("enableDblclick")(enableDblclick.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHeaderFocus)) __obj.updateDynamic("enableHeaderFocus")(enableHeaderFocus.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (footerText != null) __obj.updateDynamic("footerText")(footerText.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mainElement != null) __obj.updateDynamic("mainElement")(mainElement.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (maximizeButtonTitle != null) __obj.updateDynamic("maximizeButtonTitle")(maximizeButtonTitle.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (minimizeButtonTitle != null) __obj.updateDynamic("minimizeButtonTitle")(minimizeButtonTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (pinButtonTitle != null) __obj.updateDynamic("pinButtonTitle")(pinButtonTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(pinOnMinimized)) __obj.updateDynamic("pinOnMinimized")(pinOnMinimized.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (restoreButtonTitle != null) __obj.updateDynamic("restoreButtonTitle")(restoreButtonTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(showMaximizeButton)) __obj.updateDynamic("showMaximizeButton")(showMaximizeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinimizeButton)) __obj.updateDynamic("showMinimizeButton")(showMinimizeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showPinButton)) __obj.updateDynamic("showPinButton")(showPinButton.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateChanged != null) __obj.updateDynamic("stateChanged")(js.Any.fromFunction2(stateChanged))
    if (stateChanging != null) __obj.updateDynamic("stateChanging")(js.Any.fromFunction2(stateChanging))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (temporaryUrl != null) __obj.updateDynamic("temporaryUrl")(temporaryUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(trackFocus)) __obj.updateDynamic("trackFocus")(trackFocus.asInstanceOf[js.Any])
    if (unpinButtonTitle != null) __obj.updateDynamic("unpinButtonTitle")(unpinButtonTitle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDialog]
  }
}

