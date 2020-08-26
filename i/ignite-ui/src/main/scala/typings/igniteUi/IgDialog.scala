package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDialog
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Event which is raised after the end of the animation when the dialog was closed or opened.
    */
  var animationEnded: js.UndefOr[AnimationEndedEvent] = js.native
  /**
    * Event which is raised when the dialog or its content loses focus.
    */
  var blur: js.UndefOr[BlurEvent] = js.native
  /**
    * Gets/Sets the animation applied to the dialog when it is closed. That can be any object supported by the jquery hide(param) method.
    *
    */
  var closeAnimation: js.UndefOr[js.Any] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets the title/tooltip for the close button in the dialog. Use option [locale.closeButtonTitle](ui.igdialog#options:locale.closeButtonTitle).
    */
  var closeButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets whether the dialog should close when Esc key is pressed.
    *
    */
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the container html element for the dialog.
    * That can be reference to html element, jquery selector or jquery object.
    * By default the parent form of the original target element is used. If a form is not found, then the body is used.
    * Note: If the "position" of the container is not set or it is "static", then the position is set to "relative".
    *
    */
  var container: js.UndefOr[js.Any] = js.native
  /**
    * Gets the name of the css class which is applied to the main DIV element of the dialog.
    *
    */
  var dialogClass: js.UndefOr[String] = js.native
  /**
    * Gets/Sets whether the dialog can be dragged by the user.
    *
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the processing of the double-click on the dialog-header.If this option is not false and dialog was minimized, then its state will be set to normal.
    * If this option is set to "auto" and showMaximizeButton is enabled or if this option is set to true, then the dialog will be maximized when it was in normal state,
    * and dialog-state will be set to normal if it was maximized.
    *
    */
  var enableDblclick: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets the ability to adjust the state of the header depending on focused and not-focused states. Note: the "trackFocus" option should be enabled.
    *
    */
  var enableHeaderFocus: js.UndefOr[Boolean] = js.native
  /**
    * Event which is raised when the dialog or its content gets focus.
    */
  var focus: js.UndefOr[IgFocusEvent] = js.native
  /**
    * Gets/Sets the text which appears in the footer of the dialog.
    *
    */
  var footerText: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the text which appears in the header of the dialog.
    *
    */
  var headerText: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the initial height of the dialog in pixels for normal state.Besides numeric values, following units are supported: "px", "em" and "%".
    * In case of "%", the size of browser window is used and it has effect only on open action.
    *
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Gets the name of the css class which is applied to the SPAN element located on the left side of the header.
    *
    */
  var imageClass: js.UndefOr[String] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgDialogLocale] = js.native
  /**
    * Gets the jquery DIV object which is used as the main container for the dialog.
    * Notes:
    * 1. That object is optional and it should not contain any children.
    * 2. It should not have parent.
    * 3. It should not contain attributes which might destroy layout or appearance of the dialog.
    * 4. Change of that option is not supported.
    *
    */
  var mainElement: js.UndefOr[Element] = js.native
  /**
    * Gets/Sets the maximal height of the dialog in normal state. Note: that option has effect only while resizing the dialog by the end user.
    *
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the maximal width of the dialog in normal state. Note: that option has effect only while resizing the dialog by the end user.
    *
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets the title/tooltip for the maximize button in the dialog. Use option [locale.minimizeButtonTitle](ui.igdialog#options:locale.minimizeButtonTitle).
    */
  var maximizeButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the minimal height of the dialog in normal state.
    *
    */
  var minHeight: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the minimal width of the dialog in normal state.
    *
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets the title/tooltip for the minimize button in the dialog. Use option [locale.minimizeButtonTitle](ui.igdialog#options:locale.minimizeButtonTitle).
    */
  var minimizeButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the modal state of the dialog.
    * If there are more than 1 modal igDialog, then the last opened dialog wins and becomes on the top.
    * Note: the modal functionality is not supported when the dialog is minimized or pinned, because that will trigger misbehavior.
    *
    */
  var modal: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the animation applied to the dialog when it is opened. That can be any object supported by the jquery show(param) method.
    *
    */
  var openAnimation: js.UndefOr[js.Any] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets the title/tooltip for the pin button in the dialog. Use option [locale.pinButtonTitle](ui.igdialog#options:locale.pinButtonTitle).
    */
  var pinButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets whether the dialog will be pinned on minimize.
    *
    */
  var pinOnMinimized: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the dialog is pinned.
    * When the dialog is pinned, then the html element of the dialog is moved to the original container where the target element was located and position:absolute is removed.
    * The pinned dialog does not support modal state, maximized state and it can not be moved.
    * Notes:
    * 1. If the parent element of the original target-element is invisible, then the pinned dialog becomes invisible as well.
    * 2. Pinned state is not supported for modal dialog.
    *
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the initial position of the dialog. That should be an object, which contains "top" and "left" members or an object
    * supported by jquery.position(param) method. Examples: { left: 100, top: 200 }, { my: "left top", at: "left top", offset: "100 200" }
    *
    */
  var position: js.UndefOr[js.Any] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Gets/Sets whether the dialog can be resized by the user.
    *
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets the title/tooltip for the restore button in the dialog.  Use option [locale.restoreButtonTitle](ui.igdialog#options:locale.restoreButtonTitle).
    */
  var restoreButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets whether the close button in the dialog header should be visible.
    *
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the dialog footer should be visible.
    *
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the dialog header should be visible.
    *
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the maximize button in the dialog header should be visible.
    *
    */
  var showMaximizeButton: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the minimize button in the dialog header should be visible.
    *
    */
  var showMinimizeButton: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the pin button in the dialog header should be visible.
    *
    */
  var showPinButton: js.UndefOr[Boolean] = js.native
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
  var state: js.UndefOr[String] = js.native
  /**
    * Event which is raised after the state of the dialog was changed.
    */
  var stateChanged: js.UndefOr[StateChangedEvent] = js.native
  /**
    * Event which is raised before the state of the dialog was changed.
    * Return false in order to cancel the action.
    */
  var stateChanging: js.UndefOr[StateChangingEvent] = js.native
  /**
    * Gets/Sets the value for the tabIndex attribute applied to the main html element of the dialog.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the temporary value for src, which is used while changing the parent of the base element if it is an instance of IFRAME. That allows getting around possible JavaScript exceptions under IE.
    *
    */
  var temporaryUrl: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the ability to process focus and blur events of the child elements located in the dialog in order to maintain the focused state.
    * Notes:
    * If that option is enabled, then focus and blur event handlers are added to all the child elements of the dialog.
    * If the dialog is modal or it can be maximized, then it is not recommended to disable that option.
    * If that option is modified after the igDialog was already created, then depending on current state of the dialog, it will be temporary closed-opened or opened-closed.
    *
    */
  var trackFocus: js.UndefOr[Boolean] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets the title/tooltip for the unpin button in the dialog. Use option [locale.unpinButtonTitle](ui.igdialog#options:locale.unpinButtonTitle).
    */
  var unpinButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the initial width of the dialog in pixels for normal state.Besides numeric values, following units are supported: "px", "em" and "%".
    * In case of "%", the size of browser window is used and it has effect only on open action.
    *
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * Gets/Sets the value of zIndex applied to the main html element of the dialog. If value is not set, then 1000 is used.
    *
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object IgDialog {
  @scala.inline
  def apply(): IgDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDialog]
  }
  @scala.inline
  implicit class IgDialogOps[Self <: IgDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationEnded(value: (/* event */ Event, /* ui */ AnimationEndedEventUIParam) => Unit): Self = this.set("animationEnded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAnimationEnded: Self = this.set("animationEnded", js.undefined)
    @scala.inline
    def setBlur(value: (/* event */ Event, /* ui */ BlurEventUIParam) => Unit): Self = this.set("blur", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setCloseAnimation(value: js.Any): Self = this.set("closeAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseAnimation: Self = this.set("closeAnimation", js.undefined)
    @scala.inline
    def setCloseButtonTitle(value: String): Self = this.set("closeButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButtonTitle: Self = this.set("closeButtonTitle", js.undefined)
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDialogClass(value: String): Self = this.set("dialogClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogClass: Self = this.set("dialogClass", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEnableDblclick(value: js.Any): Self = this.set("enableDblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDblclick: Self = this.set("enableDblclick", js.undefined)
    @scala.inline
    def setEnableHeaderFocus(value: Boolean): Self = this.set("enableHeaderFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHeaderFocus: Self = this.set("enableHeaderFocus", js.undefined)
    @scala.inline
    def setFocus(value: (/* event */ Event, /* ui */ IgFocusEventUIParam) => Unit): Self = this.set("focus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setFooterText(value: String): Self = this.set("footerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterText: Self = this.set("footerText", js.undefined)
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setImageClass(value: String): Self = this.set("imageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageClass: Self = this.set("imageClass", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: IgDialogLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMainElement(value: Element): Self = this.set("mainElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainElement: Self = this.set("mainElement", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaximizeButtonTitle(value: String): Self = this.set("maximizeButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizeButtonTitle: Self = this.set("maximizeButtonTitle", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMinimizeButtonTitle(value: String): Self = this.set("minimizeButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimizeButtonTitle: Self = this.set("minimizeButtonTitle", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setOpenAnimation(value: js.Any): Self = this.set("openAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenAnimation: Self = this.set("openAnimation", js.undefined)
    @scala.inline
    def setPinButtonTitle(value: String): Self = this.set("pinButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinButtonTitle: Self = this.set("pinButtonTitle", js.undefined)
    @scala.inline
    def setPinOnMinimized(value: Boolean): Self = this.set("pinOnMinimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinOnMinimized: Self = this.set("pinOnMinimized", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setRestoreButtonTitle(value: String): Self = this.set("restoreButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreButtonTitle: Self = this.set("restoreButtonTitle", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    @scala.inline
    def setShowMaximizeButton(value: Boolean): Self = this.set("showMaximizeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMaximizeButton: Self = this.set("showMaximizeButton", js.undefined)
    @scala.inline
    def setShowMinimizeButton(value: Boolean): Self = this.set("showMinimizeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMinimizeButton: Self = this.set("showMinimizeButton", js.undefined)
    @scala.inline
    def setShowPinButton(value: Boolean): Self = this.set("showPinButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPinButton: Self = this.set("showPinButton", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStateChanged(value: (/* event */ Event, /* ui */ StateChangedEventUIParam) => Unit): Self = this.set("stateChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStateChanged: Self = this.set("stateChanged", js.undefined)
    @scala.inline
    def setStateChanging(value: (/* event */ Event, /* ui */ StateChangingEventUIParam) => Unit): Self = this.set("stateChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStateChanging: Self = this.set("stateChanging", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTemporaryUrl(value: String): Self = this.set("temporaryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporaryUrl: Self = this.set("temporaryUrl", js.undefined)
    @scala.inline
    def setTrackFocus(value: Boolean): Self = this.set("trackFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackFocus: Self = this.set("trackFocus", js.undefined)
    @scala.inline
    def setUnpinButtonTitle(value: String): Self = this.set("unpinButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnpinButtonTitle: Self = this.set("unpinButtonTitle", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

