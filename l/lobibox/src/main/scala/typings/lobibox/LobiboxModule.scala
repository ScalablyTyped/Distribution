package typings.lobibox

import typings.lobibox.anon.Call
import typings.lobibox.anon.CallDEFAULTS
import typings.lobibox.anon.CallOptions
import typings.lobibox.anon.Cancel
import typings.lobibox.anon.Confirm
import typings.lobibox.anon.DEFAULTS
import typings.lobibox.anon.DEFAULTSProgressOptions
import typings.lobibox.anon.DEFAULTSWindowOptions
import typings.lobibox.anon.Icon
import typings.lobibox.anon.IconClass
import typings.lobibox.anon.OPTIONS
import typings.lobibox.anon.Width
import typings.lobibox.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LobiboxModule {
  
  @js.native
  trait AlertOptions extends MessageBoxesOptions {
    
    var error: js.UndefOr[IconClass] = js.native
    
    var info: js.UndefOr[IconClass] = js.native
    
    var success: js.UndefOr[IconClass] = js.native
    
    var warning: js.UndefOr[IconClass] = js.native
  }
  object AlertOptions {
    
    @scala.inline
    def apply(): AlertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertOptions]
    }
    
    @scala.inline
    implicit class AlertOptionsMutableBuilder[Self <: AlertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: IconClass): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: IconClass): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setSuccess(value: IconClass): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setWarning(value: IconClass): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  @js.native
  trait ConfirmOptions extends MessageBoxesOptions {
    
    var iconClass: js.UndefOr[String] = js.native
  }
  object ConfirmOptions {
    
    @scala.inline
    def apply(): ConfirmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmOptions]
    }
    
    @scala.inline
    implicit class ConfirmOptionsMutableBuilder[Self <: ConfirmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    }
  }
  
  @js.native
  trait LobiboxStatic extends StObject {
    
    def alert[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
    def alert[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
    @JSName("alert")
    var alert_Original: Call = js.native
    
    var base: DEFAULTS = js.native
    
    def confirm[T /* <: MessageBoxesDefault */](): T = js.native
    def confirm[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T = js.native
    @JSName("confirm")
    var confirm_Original: CallOptions = js.native
    
    def notify[T /* <: NotifyDefault */](`type`: String): T = js.native
    def notify[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
    @JSName("notify")
    var notify_Original: OPTIONS = js.native
    
    def progress[T /* <: MessageBoxesDefault */](options: ProgressOptions): T = js.native
    @JSName("progress")
    var progress_Original: DEFAULTSProgressOptions = js.native
    
    def prompt[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
    def prompt[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
    @JSName("prompt")
    var prompt_Original: CallDEFAULTS = js.native
    
    def window[T /* <: MessageBoxesDefault */](options: WindowOptions): T = js.native
    @JSName("window")
    var window_Original: DEFAULTSWindowOptions = js.native
  }
  
  @js.native
  trait MessageBoxesDefault extends StObject {
    
    var baseClass: js.UndefOr[String] = js.native
    
    // when messagebox remove method is called but before it is actually hidden
    var beforeClose: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.native
    
    var buttonsAlign: js.UndefOr[String] = js.native
    
    // Height is automatically given calculated by width
    var closeButton: js.UndefOr[Boolean] = js.native
    
    // Position where buttons should be aligned
    var closeOnEsc: js.UndefOr[Boolean] = js.native
    
    // after messagebox is hidden
    var closed: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.native
    
    // Make messagebox draggable
    var customBtnClass: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    // Close messagebox on Esc press
    var delayToRemove: js.UndefOr[Double] = js.native
    
    // Show close button or not
    var draggable: js.UndefOr[Boolean] = js.native
    
    var getTitle: js.UndefOr[js.Function0[String]] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    // methods
    var hide: js.UndefOr[js.Function0[this.type]] = js.native
    
    var hideClass: js.UndefOr[String] = js.native
    
    var horizontalOffset: js.UndefOr[Double] = js.native
    
    // Class for custom buttons
    var modal: js.UndefOr[Boolean] = js.native
    
    var msg: js.UndefOr[String] = js.native
    
    // events
    // when messagebox show is called but before it is actually shown
    var onShow: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.native
    
    var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], this.type]] = js.native
    
    var setPosition: js.UndefOr[
        js.Function2[/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double], this.type]
      ] = js.native
    
    var setSize: js.UndefOr[
        js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], this.type]
      ] = js.native
    
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], this.type]] = js.native
    
    var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], this.type]] = js.native
    
    var show: js.UndefOr[js.Function0[this.type]] = js.native
    
    var showClass: js.UndefOr[String] = js.native
    
    // after messagebox is shown
    var shown: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object MessageBoxesDefault {
    
    @scala.inline
    def apply(): MessageBoxesDefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageBoxesDefault]
    }
    
    @scala.inline
    implicit class MessageBoxesDefaultMutableBuilder[Self <: MessageBoxesDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
      
      @scala.inline
      def setBeforeClose(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setButtonsAlign(value: String): Self = StObject.set(x, "buttonsAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsAlignUndefined: Self = StObject.set(x, "buttonsAlign", js.undefined)
      
      @scala.inline
      def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      @scala.inline
      def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      @scala.inline
      def setClosed(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      @scala.inline
      def setCustomBtnClass(value: String): Self = StObject.set(x, "customBtnClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomBtnClassUndefined: Self = StObject.set(x, "customBtnClass", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelayToRemove(value: Double): Self = StObject.set(x, "delayToRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayToRemoveUndefined: Self = StObject.set(x, "delayToRemove", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHide(value: () => MessageBoxesDefault): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideClass(value: String): Self = StObject.set(x, "hideClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideClassUndefined: Self = StObject.set(x, "hideClass", js.undefined)
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setSetHeight(value: /* height */ js.UndefOr[Double] => MessageBoxesDefault): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      @scala.inline
      def setSetPosition(
        value: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => MessageBoxesDefault
      ): Self = StObject.set(x, "setPosition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
      
      @scala.inline
      def setSetSize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => MessageBoxesDefault): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      @scala.inline
      def setSetTitle(value: /* title */ js.UndefOr[String] => MessageBoxesDefault): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      @scala.inline
      def setSetWidth(value: /* width */ js.UndefOr[Double] => MessageBoxesDefault): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      @scala.inline
      def setShow(value: () => MessageBoxesDefault): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowClass(value: String): Self = StObject.set(x, "showClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClassUndefined: Self = StObject.set(x, "showClass", js.undefined)
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setShown(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "shown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait MessageBoxesOptions extends MessageBoxesDefault {
    
    var bodyClass: js.UndefOr[String] = js.native
    
    var buttons: js.UndefOr[Cancel | js.Any] = js.native
    
    @JSName("buttonsAlign")
    var buttonsAlign_MessageBoxesOptions: js.UndefOr[js.Any] = js.native
    
    var callback: js.UndefOr[
        js.Function3[/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    var modalClasses: js.UndefOr[Confirm] = js.native
  }
  object MessageBoxesOptions {
    
    @scala.inline
    def apply(): MessageBoxesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageBoxesOptions]
    }
    
    @scala.inline
    implicit class MessageBoxesOptionsMutableBuilder[Self <: MessageBoxesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyClass(value: String): Self = StObject.set(x, "bodyClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyClassUndefined: Self = StObject.set(x, "bodyClass", js.undefined)
      
      @scala.inline
      def setButtons(value: Cancel | js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsAlign(value: js.Any): Self = StObject.set(x, "buttonsAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsAlignUndefined: Self = StObject.set(x, "buttonsAlign", js.undefined)
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setCallback(value: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setModalClasses(value: Confirm): Self = StObject.set(x, "modalClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalClassesUndefined: Self = StObject.set(x, "modalClasses", js.undefined)
    }
  }
  
  @js.native
  trait NotifyDefault extends StObject {
    
    // Image source string
    var closable: js.UndefOr[Boolean] = js.native
    
    // Show timer indicator
    var closeOnClick: js.UndefOr[Boolean] = js.native
    
    // Set this to true if you want notification not to be shown until previous notification is closed. This is useful for notification queues
    var continueDelayOnInactiveTab: js.UndefOr[Boolean] = js.native
    
    // Make notifications closable
    var delay: js.UndefOr[Double] = js.native
    
    // Hide notification after this time (in miliseconds)
    var delayIndicator: js.UndefOr[Boolean] = js.native
    
    // Show animation class.
    var hideClass: js.UndefOr[String] = js.native
    
    // Hide animation class.
    var icon: js.UndefOr[Boolean] = js.native
    
    // Message of notification
    var img: js.UndefOr[String] = js.native
    
    // Icon of notification. Leave as is for default icon or set custom string
    var msg: js.UndefOr[String] = js.native
    
    // Continue delay when browser tab is inactive
    // Events
    var onClick: js.UndefOr[js.Function] = js.native
    
    // Place to show notification. Available options: "top left", "top right", "bottom left", "bottom right"
    var onClickUrl: js.UndefOr[String] = js.native
    
    // Sound of notification. Set this false to disable sound. Leave as is for default sound or set custom soud path
    var position: js.UndefOr[String] = js.native
    
    // The url which will be opened when notification is clicked
    var showAfterPrevious: js.UndefOr[Boolean] = js.native
    
    // Default extension for all sounds
    var showClass: js.UndefOr[String] = js.native
    
    // Title of notification. If you do not include the title in options it will automatically takes its value
    //from Lobibox.notify.OPTIONS object depending of the type of the notifications or set custom string. Set this false to disable title
    var size: js.UndefOr[String] = js.native
    
    // Width of notification box
    var sound: js.UndefOr[Boolean] = js.native
    
    // The folder path where sounds are located
    var soundExt: js.UndefOr[String] = js.native
    
    // normal, mini, large
    var soundPath: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String | Boolean] = js.native
    
    // Close notifications by clicking on them
    var width: js.UndefOr[Double] = js.native
  }
  object NotifyDefault {
    
    @scala.inline
    def apply(): NotifyDefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyDefault]
    }
    
    @scala.inline
    implicit class NotifyDefaultMutableBuilder[Self <: NotifyDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      @scala.inline
      def setContinueDelayOnInactiveTab(value: Boolean): Self = StObject.set(x, "continueDelayOnInactiveTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinueDelayOnInactiveTabUndefined: Self = StObject.set(x, "continueDelayOnInactiveTab", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayIndicator(value: Boolean): Self = StObject.set(x, "delayIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayIndicatorUndefined: Self = StObject.set(x, "delayIndicator", js.undefined)
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setHideClass(value: String): Self = StObject.set(x, "hideClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideClassUndefined: Self = StObject.set(x, "hideClass", js.undefined)
      
      @scala.inline
      def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      @scala.inline
      def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClickUrl(value: String): Self = StObject.set(x, "onClickUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickUrlUndefined: Self = StObject.set(x, "onClickUrl", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShowAfterPrevious(value: Boolean): Self = StObject.set(x, "showAfterPrevious", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAfterPreviousUndefined: Self = StObject.set(x, "showAfterPrevious", js.undefined)
      
      @scala.inline
      def setShowClass(value: String): Self = StObject.set(x, "showClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClassUndefined: Self = StObject.set(x, "showClass", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundExt(value: String): Self = StObject.set(x, "soundExt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundExtUndefined: Self = StObject.set(x, "soundExt", js.undefined)
      
      @scala.inline
      def setSoundPath(value: String): Self = StObject.set(x, "soundPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundPathUndefined: Self = StObject.set(x, "soundPath", js.undefined)
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      @scala.inline
      def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait NotifyMethods extends StObject {
    
    var remove: js.UndefOr[js.Function0[_]] = js.native
  }
  object NotifyMethods {
    
    @scala.inline
    def apply(): NotifyMethods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyMethods]
    }
    
    @scala.inline
    implicit class NotifyMethodsMutableBuilder[Self <: NotifyMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => _): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
  
  @js.native
  trait NotifyOptions
    extends NotifyDefault
       with NotifyMethods {
    
    var `class`: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[Icon] = js.native
    
    var info: js.UndefOr[Icon] = js.native
    
    //You can override options for large notifications from here
    var large: js.UndefOr[Width] = js.native
    
    //You can override options for small notifications from here
    var mini: js.UndefOr[`0`] = js.native
    
    //Default options of different style notifications
    var success: js.UndefOr[Icon] = js.native
    
    var warning: js.UndefOr[Icon] = js.native
  }
  object NotifyOptions {
    
    @scala.inline
    def apply(): NotifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyOptions]
    }
    
    @scala.inline
    implicit class NotifyOptionsMutableBuilder[Self <: NotifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setError(value: Icon): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: Icon): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLarge(value: Width): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setMini(value: `0`): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
      
      @scala.inline
      def setSuccess(value: Icon): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setWarning(value: Icon): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  @js.native
  trait ProgressEvents extends StObject {
    
    var progressComplete: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.native
    
    var progressUpdated: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.native
  }
  object ProgressEvents {
    
    @scala.inline
    def apply(): ProgressEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressEvents]
    }
    
    @scala.inline
    implicit class ProgressEventsMutableBuilder[Self <: ProgressEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProgressComplete(value: /* lobibox */ LobiboxStatic => Unit): Self = StObject.set(x, "progressComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgressCompleteUndefined: Self = StObject.set(x, "progressComplete", js.undefined)
      
      @scala.inline
      def setProgressUpdated(value: /* lobibox */ LobiboxStatic => Unit): Self = StObject.set(x, "progressUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgressUpdatedUndefined: Self = StObject.set(x, "progressUpdated", js.undefined)
    }
  }
  
  @js.native
  trait ProgressMethods extends StObject {
    
    var getProgress: js.UndefOr[js.Function0[Double]] = js.native
    
    var setProgress: js.UndefOr[js.Function1[/* progress */ Double, this.type]] = js.native
  }
  object ProgressMethods {
    
    @scala.inline
    def apply(): ProgressMethods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressMethods]
    }
    
    @scala.inline
    implicit class ProgressMethodsMutableBuilder[Self <: ProgressMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetProgress(value: () => Double): Self = StObject.set(x, "getProgress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetProgressUndefined: Self = StObject.set(x, "getProgress", js.undefined)
      
      @scala.inline
      def setSetProgress(value: /* progress */ Double => ProgressMethods): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetProgressUndefined: Self = StObject.set(x, "setProgress", js.undefined)
    }
  }
  
  @js.native
  trait ProgressOptions
    extends MessageBoxesOptions
       with ProgressMethods
       with ProgressEvents {
    
    // Show percentage of progress
    var label: js.UndefOr[String] = js.native
    
    var progressCompleted: js.UndefOr[js.Any] = js.native
    
    // Show progress label
    var progressTpl: js.UndefOr[Boolean] = js.native
    
    //Template of progress bar
    //Events
    @JSName("progressUpdated")
    var progressUpdated_ProgressOptions: js.UndefOr[js.Any] = js.native
    
    var showProgressLabel: js.UndefOr[Boolean] = js.native
  }
  object ProgressOptions {
    
    @scala.inline
    def apply(): ProgressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressOptions]
    }
    
    @scala.inline
    implicit class ProgressOptionsMutableBuilder[Self <: ProgressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setProgressCompleted(value: js.Any): Self = StObject.set(x, "progressCompleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressCompletedUndefined: Self = StObject.set(x, "progressCompleted", js.undefined)
      
      @scala.inline
      def setProgressTpl(value: Boolean): Self = StObject.set(x, "progressTpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressTplUndefined: Self = StObject.set(x, "progressTpl", js.undefined)
      
      @scala.inline
      def setProgressUpdated(value: js.Any): Self = StObject.set(x, "progressUpdated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUpdatedUndefined: Self = StObject.set(x, "progressUpdated", js.undefined)
      
      @scala.inline
      def setShowProgressLabel(value: Boolean): Self = StObject.set(x, "showProgressLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProgressLabelUndefined: Self = StObject.set(x, "showProgressLabel", js.undefined)
    }
  }
  
  @js.native
  trait PromptMethods extends StObject {
    
    var getValue: js.UndefOr[js.Function0[String]] = js.native
    
    var setValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[String], this.type]] = js.native
  }
  object PromptMethods {
    
    @scala.inline
    def apply(): PromptMethods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromptMethods]
    }
    
    @scala.inline
    implicit class PromptMethodsMutableBuilder[Self <: PromptMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setSetValue(value: /* val */ js.UndefOr[String] => PromptMethods): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    }
  }
  
  @js.native
  trait PromptOptions
    extends MessageBoxesOptions
       with PromptMethods {
    
    var attrs: js.UndefOr[js.Any] = js.native
    
    // Prompt type. Available types (text|number|color)
    var label: js.UndefOr[String] = js.native
    
    // Set this true for multiline prompt
    var lines: js.UndefOr[Double] = js.native
    
    // Value which is given to textfield when messagebox is created
    var multiline: js.UndefOr[Boolean] = js.native
    
    // This works only for multiline prompt. Number of lines
    var `type`: js.UndefOr[String] = js.native
    
    // Object of any valid attribute of input field
    var value: js.UndefOr[String] = js.native
  }
  object PromptOptions {
    
    @scala.inline
    def apply(): PromptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromptOptions]
    }
    
    @scala.inline
    implicit class PromptOptionsMutableBuilder[Self <: PromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: js.Any): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait WindowOptions extends MessageBoxesOptions {
    
    // Override default option
    var autoload: js.UndefOr[Boolean] = js.native
    
    var content: js.UndefOr[js.Any] = js.native
    
    @JSName("height")
    var height_WindowOptions: js.UndefOr[js.Any] = js.native
    
    // Auto load from given url when window is created
    var loadMethod: js.UndefOr[String] = js.native
    
    // Show window after content is loaded or show and then load content
    var params: js.UndefOr[js.Object] = js.native
    
    // Ajax method to load content
    var showAfterLoad: js.UndefOr[Boolean] = js.native
    
    // HTML Content of window
    var url: js.UndefOr[String] = js.native
  }
  object WindowOptions {
    
    @scala.inline
    def apply(): WindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowOptions]
    }
    
    @scala.inline
    implicit class WindowOptionsMutableBuilder[Self <: WindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoload(value: Boolean): Self = StObject.set(x, "autoload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoloadUndefined: Self = StObject.set(x, "autoload", js.undefined)
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLoadMethod(value: String): Self = StObject.set(x, "loadMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMethodUndefined: Self = StObject.set(x, "loadMethod", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setShowAfterLoad(value: Boolean): Self = StObject.set(x, "showAfterLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAfterLoadUndefined: Self = StObject.set(x, "showAfterLoad", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
