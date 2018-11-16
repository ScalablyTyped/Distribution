package typings
package jqueryDotBlockuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JQBlockUIOptions extends js.Object {
  /** 
       * allow body element to be stetched in ie6; this makes blocking look better
       * on "short" pages.  disable if you wish to prevent changes to the body height 
       */
  var allowBodyStretch: js.UndefOr[scala.Boolean] = js.undefined
  /** z-index for the blocking overlay */
  var baseZ: js.UndefOr[scala.Double] = js.undefined
  /** enable if you want key and mouse events to be disabled for content that is blocked */
  var bindEvents: js.UndefOr[scala.Boolean] = js.undefined
  /** class name of the message block */
  var blockMsgClass: js.UndefOr[java.lang.String] = js.undefined
  /** set true to have the message automatically centered for X */
  var centerX: js.UndefOr[scala.Boolean] = js.undefined
  /** set true to have the message automatically centered for Y */
  var centerY: js.UndefOr[scala.Boolean] = js.undefined
  /** be default blockUI will supress tab navigation from leaving blocking content(if bindEvents is true) */
  var constrainTabKey: js.UndefOr[scala.Boolean] = js.undefined
  /** 
       * styles for the message when blocking; if you wish to disable 
       * these and use an external stylesheet then do this in your code: 
       * $.blockUI.defaults.css = {}; 
       */
  var css: js.UndefOr[js.Any] = js.undefined
  /** style to replace wait cursor before unblocking to correct issue of lingering wait cursor */
  var cursorReset: js.UndefOr[java.lang.String] = js.undefined
  /** only used when theme == true (requires jquery-ui.js to be loaded) */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /** fadeIn time in millis; set to 0 to disable fadeIn on block  */
  var fadeIn: js.UndefOr[scala.Double] = js.undefined
  /** fadeOut time in millis; set to 0 to disable fadeOut on unblock */
  var fadeOut: js.UndefOr[scala.Double] = js.undefined
  /** if true, focus will be placed in the first available input field when page blocking */
  var focusInput: js.UndefOr[scala.Boolean] = js.undefined
  /** force usage of iframe in non-IE browsers (handy for blocking applets) */
  var forceIframe: js.UndefOr[scala.Boolean] = js.undefined
  /** styles applied when using $.growlUI */
  var growlCSS: js.UndefOr[js.Any] = js.undefined
  /** ifreamSrc for IE */
  var iframeSrc: js.UndefOr[java.lang.String] = js.undefined
  /** if it is already blocked, then ignore it (don't unblock and reblock) */
  var ignoreIfBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** message displayed when blocking (use null for no message) */
  var message: js.UndefOr[js.Any] = js.undefined
  /** callback method invoked when fadeIn has completed and blocking message is visible */
  var onBlock: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** 
       * callback method invoked when unblocking has completed; the callback is 
       * passed the element that has been unblocked (which is the window object for page 
       * blocks) and the options that were passed to the unblock call: 
       * onUnblock(element, options) 
       */
  var onUnblock: js.UndefOr[js.Function2[/* element */ js.Any, /* options */ js.Any, scala.Unit]] = js.undefined
  /** styles for the overlay */
  var overlayCSS: js.UndefOr[js.Any] = js.undefined
  // don't ask; if you really must know: http://groups.google.com/group/jquery-en/browse_thread/thread/36640a8730503595/2f6a79a77a78e493#2f6a79a77a78e493 
  /** quirksmodeOffsetHack */
  var quirksmodeOffsetHack: js.UndefOr[scala.Double] = js.undefined
  /** disable if you don't want to show the overlay */
  var showOverlay: js.UndefOr[scala.Boolean] = js.undefined
  /** set to true to use with jQuery UI themes */
  var theme: js.UndefOr[scala.Boolean] = js.undefined
  /** minimal style set used when themes are used  */
  var themedCSS: js.UndefOr[js.Any] = js.undefined
  /** time in millis to wait before auto-unblocking; set to 0 to disable auto-unblock */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** title string; only used when theme == true  */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

