package typings
package jqueryDotWindowLib.JQueryWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance options
trait WindowOptions extends js.Object {
  /**
    a callback function after window cascaded
    **/
  var afterCascade: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function after window dragged
    **/
  var afterDrag: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function after window maximized
    **/
  var afterMaximize: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function after window minimized
    **/
  var afterMinimize: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function after window resized
    **/
  var afterResize: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    to control window with remote url could be bookmarked
    **/
  var bookmarkable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    to check window dialog overflow html body or caller element
    **/
  var checkBoundary: js.UndefOr[scala.Boolean] = js.undefined
  /**
    to control window closable
    **/
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    container extra class
    **/
  var containerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    this attribute only works when url is null. when passing a jquery object or a element, it will clone the original one to append.
    **/
  var content: js.UndefOr[java.lang.String | jqueryDotWindowLib.JQuery | stdLib.HTMLElement] = js.undefined
  /**
    random the new created window position, it only works when options x,y value both are -1
    **/
  var createRandomOffset: js.UndefOr[jqueryDotWindowLib.Anon_X] = js.undefined
  /**
    to describe the customized button display and callback function
    **/
  var custBtns: js.UndefOr[js.Array[Button]] = js.undefined
  /**
    to control window draggable
    **/
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    footer extra class
    **/
  var footerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    same as content attribute, but it's put on footer panel.
    **/
  var footerContent: js.UndefOr[java.lang.String | jqueryDotWindowLib.JQuery | stdLib.HTMLElement] = js.undefined
  /**
    frame extra class
    **/
  var frameClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    header extra class
    **/
  var headerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    window height
    **/
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    an icon image url string. if this attribute is given, it will force to replace the original favicon of remote page on window. or you can set it as null to hide icon.
    **/
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    if null means no check, or pass a string to show warning message while iframe is going to redirect current top page
    **/
  var iframeRedirectCheckMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    the maximum height, if -1 means no checking
    **/
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    the maximum width, if -1 means no checking
    **/
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    to control window maximizable
    **/
  var maximizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    the minimum height, if -1 means no checking
    **/
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    the minimum width, if -1 means no checking
    **/
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    to control window minimizable
    **/
  var minimizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    the opacity of modal dialog
    **/
  var modalOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    a callback function while window is going to cascade
    **/
  var onCascade: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while user click close button
    **/
  var onClose: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while window is going to drag
    **/
  var onDrag: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while iframe load finished. this attribute only works while url attribute is given
    **/
  var onIframeEnd: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while iframe ready to connect remoting url. this attribute only works while url attribute is given
    **/
  var onIframeStart: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while window is going to maximize
    **/
  var onMaximize: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while window is going to minimize
    **/
  var onMinimize: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while container is added into body
    **/
  var onOpen: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while window is going to resize
    **/
  var onResize: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while user select the window
    **/
  var onSelect: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while whole window display routine is finished
    **/
  var onShow: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    a callback function while window unselected
    **/
  var onUnselect: js.UndefOr[js.Function1[/* wnd */ Window, scala.Unit]] = js.undefined
  /**
    to control window resizable
    **/
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    to show scroll bar or not
    **/
  var scrollable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    selected header extra class
    **/
  var selectedHeaderClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    to control show footer panel
    **/
  var showFooter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    to control show modal on background
    **/
  var showModal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    to control display window as round corner
    **/
  var showRoundCorner: js.UndefOr[scala.Boolean] = js.undefined
  /**
    the title text of window
    **/
  var title: java.lang.String
  /**
    the target url of iframe ready to load.
    **/
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    window width
    **/
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    to limit window only can be dragged within browser window. this attribute only works when checkBoundary is true and caller is null.
    **/
  var withinBrowserWindow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    the x-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    the y-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var y: js.UndefOr[scala.Double] = js.undefined
  /**
    the css z-index value
    **/
  var z: js.UndefOr[scala.Double] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    title: java.lang.String,
    afterCascade: /* wnd */ Window => scala.Unit = null,
    afterDrag: /* wnd */ Window => scala.Unit = null,
    afterMaximize: /* wnd */ Window => scala.Unit = null,
    afterMinimize: /* wnd */ Window => scala.Unit = null,
    afterResize: /* wnd */ Window => scala.Unit = null,
    bookmarkable: js.UndefOr[scala.Boolean] = js.undefined,
    checkBoundary: js.UndefOr[scala.Boolean] = js.undefined,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    containerClass: java.lang.String = null,
    content: java.lang.String | jqueryDotWindowLib.JQuery | stdLib.HTMLElement = null,
    createRandomOffset: jqueryDotWindowLib.Anon_X = null,
    custBtns: js.Array[Button] = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    footerClass: java.lang.String = null,
    footerContent: java.lang.String | jqueryDotWindowLib.JQuery | stdLib.HTMLElement = null,
    frameClass: java.lang.String = null,
    headerClass: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    icon: java.lang.String = null,
    iframeRedirectCheckMsg: java.lang.String = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    maximizable: js.UndefOr[scala.Boolean] = js.undefined,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    minimizable: js.UndefOr[scala.Boolean] = js.undefined,
    modalOpacity: scala.Int | scala.Double = null,
    onCascade: /* wnd */ Window => scala.Unit = null,
    onClose: /* wnd */ Window => scala.Unit = null,
    onDrag: /* wnd */ Window => scala.Unit = null,
    onIframeEnd: /* wnd */ Window => scala.Unit = null,
    onIframeStart: /* wnd */ Window => scala.Unit = null,
    onMaximize: /* wnd */ Window => scala.Unit = null,
    onMinimize: /* wnd */ Window => scala.Unit = null,
    onOpen: /* wnd */ Window => scala.Unit = null,
    onResize: /* wnd */ Window => scala.Unit = null,
    onSelect: /* wnd */ Window => scala.Unit = null,
    onShow: /* wnd */ Window => scala.Unit = null,
    onUnselect: /* wnd */ Window => scala.Unit = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    scrollable: js.UndefOr[scala.Boolean] = js.undefined,
    selectedHeaderClass: java.lang.String = null,
    showFooter: js.UndefOr[scala.Boolean] = js.undefined,
    showModal: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundCorner: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    withinBrowserWindow: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): WindowOptions = {
    val __obj = js.Dynamic.literal(title = title)
    if (afterCascade != null) __obj.updateDynamic("afterCascade")(js.Any.fromFunction1(afterCascade))
    if (afterDrag != null) __obj.updateDynamic("afterDrag")(js.Any.fromFunction1(afterDrag))
    if (afterMaximize != null) __obj.updateDynamic("afterMaximize")(js.Any.fromFunction1(afterMaximize))
    if (afterMinimize != null) __obj.updateDynamic("afterMinimize")(js.Any.fromFunction1(afterMinimize))
    if (afterResize != null) __obj.updateDynamic("afterResize")(js.Any.fromFunction1(afterResize))
    if (!js.isUndefined(bookmarkable)) __obj.updateDynamic("bookmarkable")(bookmarkable)
    if (!js.isUndefined(checkBoundary)) __obj.updateDynamic("checkBoundary")(checkBoundary)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (createRandomOffset != null) __obj.updateDynamic("createRandomOffset")(createRandomOffset)
    if (custBtns != null) __obj.updateDynamic("custBtns")(custBtns)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (footerClass != null) __obj.updateDynamic("footerClass")(footerClass)
    if (footerContent != null) __obj.updateDynamic("footerContent")(footerContent.asInstanceOf[js.Any])
    if (frameClass != null) __obj.updateDynamic("frameClass")(frameClass)
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iframeRedirectCheckMsg != null) __obj.updateDynamic("iframeRedirectCheckMsg")(iframeRedirectCheckMsg)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable)
    if (modalOpacity != null) __obj.updateDynamic("modalOpacity")(modalOpacity.asInstanceOf[js.Any])
    if (onCascade != null) __obj.updateDynamic("onCascade")(js.Any.fromFunction1(onCascade))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onIframeEnd != null) __obj.updateDynamic("onIframeEnd")(js.Any.fromFunction1(onIframeEnd))
    if (onIframeStart != null) __obj.updateDynamic("onIframeStart")(js.Any.fromFunction1(onIframeStart))
    if (onMaximize != null) __obj.updateDynamic("onMaximize")(js.Any.fromFunction1(onMaximize))
    if (onMinimize != null) __obj.updateDynamic("onMinimize")(js.Any.fromFunction1(onMinimize))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1(onUnselect))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (selectedHeaderClass != null) __obj.updateDynamic("selectedHeaderClass")(selectedHeaderClass)
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter)
    if (!js.isUndefined(showModal)) __obj.updateDynamic("showModal")(showModal)
    if (!js.isUndefined(showRoundCorner)) __obj.updateDynamic("showRoundCorner")(showRoundCorner)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withinBrowserWindow)) __obj.updateDynamic("withinBrowserWindow")(withinBrowserWindow)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

