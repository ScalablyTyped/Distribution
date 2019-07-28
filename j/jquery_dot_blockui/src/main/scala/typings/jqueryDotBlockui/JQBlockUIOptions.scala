package typings.jqueryDotBlockui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQBlockUIOptions extends js.Object {
  /** 
    * allow body element to be stetched in ie6; this makes blocking look better
    * on "short" pages.  disable if you wish to prevent changes to the body height 
    */
  var allowBodyStretch: js.UndefOr[Boolean] = js.undefined
  /** z-index for the blocking overlay */
  var baseZ: js.UndefOr[Double] = js.undefined
  /** enable if you want key and mouse events to be disabled for content that is blocked */
  var bindEvents: js.UndefOr[Boolean] = js.undefined
  /** class name of the message block */
  var blockMsgClass: js.UndefOr[String] = js.undefined
  /** set true to have the message automatically centered for X */
  var centerX: js.UndefOr[Boolean] = js.undefined
  /** set true to have the message automatically centered for Y */
  var centerY: js.UndefOr[Boolean] = js.undefined
  /** be default blockUI will supress tab navigation from leaving blocking content(if bindEvents is true) */
  var constrainTabKey: js.UndefOr[Boolean] = js.undefined
  /** 
    * styles for the message when blocking; if you wish to disable 
    * these and use an external stylesheet then do this in your code: 
    * $.blockUI.defaults.css = {}; 
    */
  var css: js.UndefOr[js.Any] = js.undefined
  /** style to replace wait cursor before unblocking to correct issue of lingering wait cursor */
  var cursorReset: js.UndefOr[String] = js.undefined
  /** only used when theme == true (requires jquery-ui.js to be loaded) */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /** fadeIn time in millis; set to 0 to disable fadeIn on block  */
  var fadeIn: js.UndefOr[Double] = js.undefined
  /** fadeOut time in millis; set to 0 to disable fadeOut on unblock */
  var fadeOut: js.UndefOr[Double] = js.undefined
  /** if true, focus will be placed in the first available input field when page blocking */
  var focusInput: js.UndefOr[Boolean] = js.undefined
  /** force usage of iframe in non-IE browsers (handy for blocking applets) */
  var forceIframe: js.UndefOr[Boolean] = js.undefined
  /** styles applied when using $.growlUI */
  var growlCSS: js.UndefOr[js.Any] = js.undefined
  /** ifreamSrc for IE */
  var iframeSrc: js.UndefOr[String] = js.undefined
  /** if it is already blocked, then ignore it (don't unblock and reblock) */
  var ignoreIfBlocked: js.UndefOr[Boolean] = js.undefined
  /** message displayed when blocking (use null for no message) */
  var message: js.UndefOr[js.Any] = js.undefined
  /** callback method invoked when fadeIn has completed and blocking message is visible */
  var onBlock: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 
    * callback method invoked when unblocking has completed; the callback is 
    * passed the element that has been unblocked (which is the window object for page 
    * blocks) and the options that were passed to the unblock call: 
    * onUnblock(element, options) 
    */
  var onUnblock: js.UndefOr[js.Function2[/* element */ js.Any, /* options */ js.Any, Unit]] = js.undefined
  /** styles for the overlay */
  var overlayCSS: js.UndefOr[js.Any] = js.undefined
  // don't ask; if you really must know: http://groups.google.com/group/jquery-en/browse_thread/thread/36640a8730503595/2f6a79a77a78e493#2f6a79a77a78e493 
  /** quirksmodeOffsetHack */
  var quirksmodeOffsetHack: js.UndefOr[Double] = js.undefined
  /** disable if you don't want to show the overlay */
  var showOverlay: js.UndefOr[Boolean] = js.undefined
  /** set to true to use with jQuery UI themes */
  var theme: js.UndefOr[Boolean] = js.undefined
  /** minimal style set used when themes are used  */
  var themedCSS: js.UndefOr[js.Any] = js.undefined
  /** time in millis to wait before auto-unblocking; set to 0 to disable auto-unblock */
  var timeout: js.UndefOr[Double] = js.undefined
  /** title string; only used when theme == true  */
  var title: js.UndefOr[String] = js.undefined
}

object JQBlockUIOptions {
  @scala.inline
  def apply(
    allowBodyStretch: js.UndefOr[Boolean] = js.undefined,
    baseZ: Int | Double = null,
    bindEvents: js.UndefOr[Boolean] = js.undefined,
    blockMsgClass: String = null,
    centerX: js.UndefOr[Boolean] = js.undefined,
    centerY: js.UndefOr[Boolean] = js.undefined,
    constrainTabKey: js.UndefOr[Boolean] = js.undefined,
    css: js.Any = null,
    cursorReset: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fadeIn: Int | Double = null,
    fadeOut: Int | Double = null,
    focusInput: js.UndefOr[Boolean] = js.undefined,
    forceIframe: js.UndefOr[Boolean] = js.undefined,
    growlCSS: js.Any = null,
    iframeSrc: String = null,
    ignoreIfBlocked: js.UndefOr[Boolean] = js.undefined,
    message: js.Any = null,
    onBlock: () => Unit = null,
    onUnblock: (/* element */ js.Any, /* options */ js.Any) => Unit = null,
    overlayCSS: js.Any = null,
    quirksmodeOffsetHack: Int | Double = null,
    showOverlay: js.UndefOr[Boolean] = js.undefined,
    theme: js.UndefOr[Boolean] = js.undefined,
    themedCSS: js.Any = null,
    timeout: Int | Double = null,
    title: String = null
  ): JQBlockUIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowBodyStretch)) __obj.updateDynamic("allowBodyStretch")(allowBodyStretch)
    if (baseZ != null) __obj.updateDynamic("baseZ")(baseZ.asInstanceOf[js.Any])
    if (!js.isUndefined(bindEvents)) __obj.updateDynamic("bindEvents")(bindEvents)
    if (blockMsgClass != null) __obj.updateDynamic("blockMsgClass")(blockMsgClass)
    if (!js.isUndefined(centerX)) __obj.updateDynamic("centerX")(centerX)
    if (!js.isUndefined(centerY)) __obj.updateDynamic("centerY")(centerY)
    if (!js.isUndefined(constrainTabKey)) __obj.updateDynamic("constrainTabKey")(constrainTabKey)
    if (css != null) __obj.updateDynamic("css")(css)
    if (cursorReset != null) __obj.updateDynamic("cursorReset")(cursorReset)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (fadeIn != null) __obj.updateDynamic("fadeIn")(fadeIn.asInstanceOf[js.Any])
    if (fadeOut != null) __obj.updateDynamic("fadeOut")(fadeOut.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInput)) __obj.updateDynamic("focusInput")(focusInput)
    if (!js.isUndefined(forceIframe)) __obj.updateDynamic("forceIframe")(forceIframe)
    if (growlCSS != null) __obj.updateDynamic("growlCSS")(growlCSS)
    if (iframeSrc != null) __obj.updateDynamic("iframeSrc")(iframeSrc)
    if (!js.isUndefined(ignoreIfBlocked)) __obj.updateDynamic("ignoreIfBlocked")(ignoreIfBlocked)
    if (message != null) __obj.updateDynamic("message")(message)
    if (onBlock != null) __obj.updateDynamic("onBlock")(js.Any.fromFunction0(onBlock))
    if (onUnblock != null) __obj.updateDynamic("onUnblock")(js.Any.fromFunction2(onUnblock))
    if (overlayCSS != null) __obj.updateDynamic("overlayCSS")(overlayCSS)
    if (quirksmodeOffsetHack != null) __obj.updateDynamic("quirksmodeOffsetHack")(quirksmodeOffsetHack.asInstanceOf[js.Any])
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay)
    if (!js.isUndefined(theme)) __obj.updateDynamic("theme")(theme)
    if (themedCSS != null) __obj.updateDynamic("themedCSS")(themedCSS)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[JQBlockUIOptions]
  }
}

