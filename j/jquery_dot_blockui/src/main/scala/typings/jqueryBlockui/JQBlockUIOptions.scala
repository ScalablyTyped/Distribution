package typings.jqueryBlockui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQBlockUIOptions extends js.Object {
  /** 
    * allow body element to be stetched in ie6; this makes blocking look better
    * on "short" pages.  disable if you wish to prevent changes to the body height 
    */
  var allowBodyStretch: js.UndefOr[Boolean] = js.native
  /** z-index for the blocking overlay */
  var baseZ: js.UndefOr[Double] = js.native
  /** enable if you want key and mouse events to be disabled for content that is blocked */
  var bindEvents: js.UndefOr[Boolean] = js.native
  /** class name of the message block */
  var blockMsgClass: js.UndefOr[String] = js.native
  /** set true to have the message automatically centered for X */
  var centerX: js.UndefOr[Boolean] = js.native
  /** set true to have the message automatically centered for Y */
  var centerY: js.UndefOr[Boolean] = js.native
  /** be default blockUI will supress tab navigation from leaving blocking content(if bindEvents is true) */
  var constrainTabKey: js.UndefOr[Boolean] = js.native
  /** 
    * styles for the message when blocking; if you wish to disable 
    * these and use an external stylesheet then do this in your code: 
    * $.blockUI.defaults.css = {}; 
    */
  var css: js.UndefOr[js.Any] = js.native
  /** style to replace wait cursor before unblocking to correct issue of lingering wait cursor */
  var cursorReset: js.UndefOr[String] = js.native
  /** only used when theme == true (requires jquery-ui.js to be loaded) */
  var draggable: js.UndefOr[Boolean] = js.native
  /** fadeIn time in millis; set to 0 to disable fadeIn on block  */
  var fadeIn: js.UndefOr[Double] = js.native
  /** fadeOut time in millis; set to 0 to disable fadeOut on unblock */
  var fadeOut: js.UndefOr[Double] = js.native
  /** if true, focus will be placed in the first available input field when page blocking */
  var focusInput: js.UndefOr[Boolean] = js.native
  /** force usage of iframe in non-IE browsers (handy for blocking applets) */
  var forceIframe: js.UndefOr[Boolean] = js.native
  /** styles applied when using $.growlUI */
  var growlCSS: js.UndefOr[js.Any] = js.native
  /** ifreamSrc for IE */
  var iframeSrc: js.UndefOr[String] = js.native
  /** if it is already blocked, then ignore it (don't unblock and reblock) */
  var ignoreIfBlocked: js.UndefOr[Boolean] = js.native
  /** message displayed when blocking (use null for no message) */
  var message: js.UndefOr[js.Any] = js.native
  /** callback method invoked when fadeIn has completed and blocking message is visible */
  var onBlock: js.UndefOr[js.Function0[Unit]] = js.native
  /** 
    * callback method invoked when unblocking has completed; the callback is 
    * passed the element that has been unblocked (which is the window object for page 
    * blocks) and the options that were passed to the unblock call: 
    * onUnblock(element, options) 
    */
  var onUnblock: js.UndefOr[js.Function2[/* element */ js.Any, /* options */ js.Any, Unit]] = js.native
  /** styles for the overlay */
  var overlayCSS: js.UndefOr[js.Any] = js.native
  // don't ask; if you really must know: http://groups.google.com/group/jquery-en/browse_thread/thread/36640a8730503595/2f6a79a77a78e493#2f6a79a77a78e493 
  /** quirksmodeOffsetHack */
  var quirksmodeOffsetHack: js.UndefOr[Double] = js.native
  /** disable if you don't want to show the overlay */
  var showOverlay: js.UndefOr[Boolean] = js.native
  /** set to true to use with jQuery UI themes */
  var theme: js.UndefOr[Boolean] = js.native
  /** minimal style set used when themes are used  */
  var themedCSS: js.UndefOr[js.Any] = js.native
  /** time in millis to wait before auto-unblocking; set to 0 to disable auto-unblock */
  var timeout: js.UndefOr[Double] = js.native
  /** title string; only used when theme == true  */
  var title: js.UndefOr[String] = js.native
}

object JQBlockUIOptions {
  @scala.inline
  def apply(): JQBlockUIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQBlockUIOptions]
  }
  @scala.inline
  implicit class JQBlockUIOptionsOps[Self <: JQBlockUIOptions] (val x: Self) extends AnyVal {
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
    def setAllowBodyStretch(value: Boolean): Self = this.set("allowBodyStretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowBodyStretch: Self = this.set("allowBodyStretch", js.undefined)
    @scala.inline
    def setBaseZ(value: Double): Self = this.set("baseZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseZ: Self = this.set("baseZ", js.undefined)
    @scala.inline
    def setBindEvents(value: Boolean): Self = this.set("bindEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindEvents: Self = this.set("bindEvents", js.undefined)
    @scala.inline
    def setBlockMsgClass(value: String): Self = this.set("blockMsgClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockMsgClass: Self = this.set("blockMsgClass", js.undefined)
    @scala.inline
    def setCenterX(value: Boolean): Self = this.set("centerX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterX: Self = this.set("centerX", js.undefined)
    @scala.inline
    def setCenterY(value: Boolean): Self = this.set("centerY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterY: Self = this.set("centerY", js.undefined)
    @scala.inline
    def setConstrainTabKey(value: Boolean): Self = this.set("constrainTabKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainTabKey: Self = this.set("constrainTabKey", js.undefined)
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setCursorReset(value: String): Self = this.set("cursorReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorReset: Self = this.set("cursorReset", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setFadeIn(value: Double): Self = this.set("fadeIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeIn: Self = this.set("fadeIn", js.undefined)
    @scala.inline
    def setFadeOut(value: Double): Self = this.set("fadeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeOut: Self = this.set("fadeOut", js.undefined)
    @scala.inline
    def setFocusInput(value: Boolean): Self = this.set("focusInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusInput: Self = this.set("focusInput", js.undefined)
    @scala.inline
    def setForceIframe(value: Boolean): Self = this.set("forceIframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIframe: Self = this.set("forceIframe", js.undefined)
    @scala.inline
    def setGrowlCSS(value: js.Any): Self = this.set("growlCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowlCSS: Self = this.set("growlCSS", js.undefined)
    @scala.inline
    def setIframeSrc(value: String): Self = this.set("iframeSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeSrc: Self = this.set("iframeSrc", js.undefined)
    @scala.inline
    def setIgnoreIfBlocked(value: Boolean): Self = this.set("ignoreIfBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIfBlocked: Self = this.set("ignoreIfBlocked", js.undefined)
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOnBlock(value: () => Unit): Self = this.set("onBlock", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBlock: Self = this.set("onBlock", js.undefined)
    @scala.inline
    def setOnUnblock(value: (/* element */ js.Any, /* options */ js.Any) => Unit): Self = this.set("onUnblock", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUnblock: Self = this.set("onUnblock", js.undefined)
    @scala.inline
    def setOverlayCSS(value: js.Any): Self = this.set("overlayCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayCSS: Self = this.set("overlayCSS", js.undefined)
    @scala.inline
    def setQuirksmodeOffsetHack(value: Double): Self = this.set("quirksmodeOffsetHack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuirksmodeOffsetHack: Self = this.set("quirksmodeOffsetHack", js.undefined)
    @scala.inline
    def setShowOverlay(value: Boolean): Self = this.set("showOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOverlay: Self = this.set("showOverlay", js.undefined)
    @scala.inline
    def setTheme(value: Boolean): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setThemedCSS(value: js.Any): Self = this.set("themedCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemedCSS: Self = this.set("themedCSS", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

