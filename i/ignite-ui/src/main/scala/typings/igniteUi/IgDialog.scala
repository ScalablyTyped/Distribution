package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IgDialogMutableBuilder[Self <: IgDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationEnded(value: (/* event */ Event, /* ui */ AnimationEndedEventUIParam) => Unit): Self = StObject.set(x, "animationEnded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAnimationEndedUndefined: Self = StObject.set(x, "animationEnded", js.undefined)
    
    @scala.inline
    def setBlur(value: (/* event */ Event, /* ui */ BlurEventUIParam) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setCloseAnimation(value: js.Any): Self = StObject.set(x, "closeAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseAnimationUndefined: Self = StObject.set(x, "closeAnimation", js.undefined)
    
    @scala.inline
    def setCloseButtonTitle(value: String): Self = StObject.set(x, "closeButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonTitleUndefined: Self = StObject.set(x, "closeButtonTitle", js.undefined)
    
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDialogClass(value: String): Self = StObject.set(x, "dialogClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogClassUndefined: Self = StObject.set(x, "dialogClass", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEnableDblclick(value: js.Any): Self = StObject.set(x, "enableDblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDblclickUndefined: Self = StObject.set(x, "enableDblclick", js.undefined)
    
    @scala.inline
    def setEnableHeaderFocus(value: Boolean): Self = StObject.set(x, "enableHeaderFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHeaderFocusUndefined: Self = StObject.set(x, "enableHeaderFocus", js.undefined)
    
    @scala.inline
    def setFocus(value: (/* event */ Event, /* ui */ IgFocusEventUIParam) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setFooterText(value: String): Self = StObject.set(x, "footerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTextUndefined: Self = StObject.set(x, "footerText", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: IgDialogLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMainElement(value: Element): Self = StObject.set(x, "mainElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainElementUndefined: Self = StObject.set(x, "mainElement", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMaximizeButtonTitle(value: String): Self = StObject.set(x, "maximizeButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizeButtonTitleUndefined: Self = StObject.set(x, "maximizeButtonTitle", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMinimizeButtonTitle(value: String): Self = StObject.set(x, "minimizeButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizeButtonTitleUndefined: Self = StObject.set(x, "minimizeButtonTitle", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setOpenAnimation(value: js.Any): Self = StObject.set(x, "openAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAnimationUndefined: Self = StObject.set(x, "openAnimation", js.undefined)
    
    @scala.inline
    def setPinButtonTitle(value: String): Self = StObject.set(x, "pinButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinButtonTitleUndefined: Self = StObject.set(x, "pinButtonTitle", js.undefined)
    
    @scala.inline
    def setPinOnMinimized(value: Boolean): Self = StObject.set(x, "pinOnMinimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinOnMinimizedUndefined: Self = StObject.set(x, "pinOnMinimized", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setRestoreButtonTitle(value: String): Self = StObject.set(x, "restoreButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreButtonTitleUndefined: Self = StObject.set(x, "restoreButtonTitle", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
    
    @scala.inline
    def setShowMaximizeButton(value: Boolean): Self = StObject.set(x, "showMaximizeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMaximizeButtonUndefined: Self = StObject.set(x, "showMaximizeButton", js.undefined)
    
    @scala.inline
    def setShowMinimizeButton(value: Boolean): Self = StObject.set(x, "showMinimizeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMinimizeButtonUndefined: Self = StObject.set(x, "showMinimizeButton", js.undefined)
    
    @scala.inline
    def setShowPinButton(value: Boolean): Self = StObject.set(x, "showPinButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPinButtonUndefined: Self = StObject.set(x, "showPinButton", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChanged(value: (/* event */ Event, /* ui */ StateChangedEventUIParam) => Unit): Self = StObject.set(x, "stateChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateChangedUndefined: Self = StObject.set(x, "stateChanged", js.undefined)
    
    @scala.inline
    def setStateChanging(value: (/* event */ Event, /* ui */ StateChangingEventUIParam) => Unit): Self = StObject.set(x, "stateChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateChangingUndefined: Self = StObject.set(x, "stateChanging", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTemporaryUrl(value: String): Self = StObject.set(x, "temporaryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporaryUrlUndefined: Self = StObject.set(x, "temporaryUrl", js.undefined)
    
    @scala.inline
    def setTrackFocus(value: Boolean): Self = StObject.set(x, "trackFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackFocusUndefined: Self = StObject.set(x, "trackFocus", js.undefined)
    
    @scala.inline
    def setUnpinButtonTitle(value: String): Self = StObject.set(x, "unpinButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpinButtonTitleUndefined: Self = StObject.set(x, "unpinButtonTitle", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
