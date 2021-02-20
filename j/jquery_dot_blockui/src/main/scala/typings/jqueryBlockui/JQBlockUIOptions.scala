package typings.jqueryBlockui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQBlockUIOptions extends StObject {
  
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
  implicit class JQBlockUIOptionsMutableBuilder[Self <: JQBlockUIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowBodyStretch(value: Boolean): Self = StObject.set(x, "allowBodyStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowBodyStretchUndefined: Self = StObject.set(x, "allowBodyStretch", js.undefined)
    
    @scala.inline
    def setBaseZ(value: Double): Self = StObject.set(x, "baseZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseZUndefined: Self = StObject.set(x, "baseZ", js.undefined)
    
    @scala.inline
    def setBindEvents(value: Boolean): Self = StObject.set(x, "bindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindEventsUndefined: Self = StObject.set(x, "bindEvents", js.undefined)
    
    @scala.inline
    def setBlockMsgClass(value: String): Self = StObject.set(x, "blockMsgClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockMsgClassUndefined: Self = StObject.set(x, "blockMsgClass", js.undefined)
    
    @scala.inline
    def setCenterX(value: Boolean): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
    
    @scala.inline
    def setCenterY(value: Boolean): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
    
    @scala.inline
    def setConstrainTabKey(value: Boolean): Self = StObject.set(x, "constrainTabKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainTabKeyUndefined: Self = StObject.set(x, "constrainTabKey", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setCursorReset(value: String): Self = StObject.set(x, "cursorReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorResetUndefined: Self = StObject.set(x, "cursorReset", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setFadeIn(value: Double): Self = StObject.set(x, "fadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
    
    @scala.inline
    def setFadeOut(value: Double): Self = StObject.set(x, "fadeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
    
    @scala.inline
    def setFocusInput(value: Boolean): Self = StObject.set(x, "focusInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusInputUndefined: Self = StObject.set(x, "focusInput", js.undefined)
    
    @scala.inline
    def setForceIframe(value: Boolean): Self = StObject.set(x, "forceIframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceIframeUndefined: Self = StObject.set(x, "forceIframe", js.undefined)
    
    @scala.inline
    def setGrowlCSS(value: js.Any): Self = StObject.set(x, "growlCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowlCSSUndefined: Self = StObject.set(x, "growlCSS", js.undefined)
    
    @scala.inline
    def setIframeSrc(value: String): Self = StObject.set(x, "iframeSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeSrcUndefined: Self = StObject.set(x, "iframeSrc", js.undefined)
    
    @scala.inline
    def setIgnoreIfBlocked(value: Boolean): Self = StObject.set(x, "ignoreIfBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIfBlockedUndefined: Self = StObject.set(x, "ignoreIfBlocked", js.undefined)
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOnBlock(value: () => Unit): Self = StObject.set(x, "onBlock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBlockUndefined: Self = StObject.set(x, "onBlock", js.undefined)
    
    @scala.inline
    def setOnUnblock(value: (/* element */ js.Any, /* options */ js.Any) => Unit): Self = StObject.set(x, "onUnblock", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUnblockUndefined: Self = StObject.set(x, "onUnblock", js.undefined)
    
    @scala.inline
    def setOverlayCSS(value: js.Any): Self = StObject.set(x, "overlayCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayCSSUndefined: Self = StObject.set(x, "overlayCSS", js.undefined)
    
    @scala.inline
    def setQuirksmodeOffsetHack(value: Double): Self = StObject.set(x, "quirksmodeOffsetHack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuirksmodeOffsetHackUndefined: Self = StObject.set(x, "quirksmodeOffsetHack", js.undefined)
    
    @scala.inline
    def setShowOverlay(value: Boolean): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
    
    @scala.inline
    def setTheme(value: Boolean): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setThemedCSS(value: js.Any): Self = StObject.set(x, "themedCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemedCSSUndefined: Self = StObject.set(x, "themedCSS", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
