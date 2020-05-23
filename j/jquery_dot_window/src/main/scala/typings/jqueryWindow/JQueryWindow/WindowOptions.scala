package typings.jqueryWindow.JQueryWindow

import typings.jqueryWindow.JQuery
import typings.jqueryWindow.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance options
trait WindowOptions extends js.Object {
  /**
    a callback function after window cascaded
    **/
  var afterCascade: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function after window dragged
    **/
  var afterDrag: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function after window maximized
    **/
  var afterMaximize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function after window minimized
    **/
  var afterMinimize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function after window resized
    **/
  var afterResize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    to control window with remote url could be bookmarked
    **/
  var bookmarkable: js.UndefOr[Boolean] = js.undefined
  /**
    to check window dialog overflow html body or caller element
    **/
  var checkBoundary: js.UndefOr[Boolean] = js.undefined
  /**
    to control window closable
    **/
  var closable: js.UndefOr[Boolean] = js.undefined
  /**
    container extra class
    **/
  var containerClass: js.UndefOr[String] = js.undefined
  /**
    this attribute only works when url is null. when passing a jquery object or a element, it will clone the original one to append.
    **/
  var content: js.UndefOr[String | JQuery | HTMLElement] = js.undefined
  /**
    random the new created window position, it only works when options x,y value both are -1
    **/
  var createRandomOffset: js.UndefOr[X] = js.undefined
  /**
    to describe the customized button display and callback function
    **/
  var custBtns: js.UndefOr[js.Array[Button]] = js.undefined
  /**
    to control window draggable
    **/
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    footer extra class
    **/
  var footerClass: js.UndefOr[String] = js.undefined
  /**
    same as content attribute, but it's put on footer panel.
    **/
  var footerContent: js.UndefOr[String | JQuery | HTMLElement] = js.undefined
  /**
    frame extra class
    **/
  var frameClass: js.UndefOr[String] = js.undefined
  /**
    header extra class
    **/
  var headerClass: js.UndefOr[String] = js.undefined
  /**
    window height
    **/
  var height: js.UndefOr[Double] = js.undefined
  /**
    an icon image url string. if this attribute is given, it will force to replace the original favicon of remote page on window. or you can set it as null to hide icon.
    **/
  var icon: js.UndefOr[String] = js.undefined
  /**
    if null means no check, or pass a string to show warning message while iframe is going to redirect current top page
    **/
  var iframeRedirectCheckMsg: js.UndefOr[String] = js.undefined
  /**
    the maximum height, if -1 means no checking
    **/
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    the maximum width, if -1 means no checking
    **/
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    to control window maximizable
    **/
  var maximizable: js.UndefOr[Boolean] = js.undefined
  /**
    the minimum height, if -1 means no checking
    **/
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    the minimum width, if -1 means no checking
    **/
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    to control window minimizable
    **/
  var minimizable: js.UndefOr[Boolean] = js.undefined
  /**
    the opacity of modal dialog
    **/
  var modalOpacity: js.UndefOr[Double] = js.undefined
  /**
    a callback function while window is going to cascade
    **/
  var onCascade: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while user click close button
    **/
  var onClose: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window is going to drag
    **/
  var onDrag: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while iframe load finished. this attribute only works while url attribute is given
    **/
  var onIframeEnd: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while iframe ready to connect remoting url. this attribute only works while url attribute is given
    **/
  var onIframeStart: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window is going to maximize
    **/
  var onMaximize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window is going to minimize
    **/
  var onMinimize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while container is added into body
    **/
  var onOpen: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window is going to resize
    **/
  var onResize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while user select the window
    **/
  var onSelect: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while whole window display routine is finished
    **/
  var onShow: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window unselected
    **/
  var onUnselect: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    to control window resizable
    **/
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    to show scroll bar or not
    **/
  var scrollable: js.UndefOr[Boolean] = js.undefined
  /**
    selected header extra class
    **/
  var selectedHeaderClass: js.UndefOr[String] = js.undefined
  /**
    to control show footer panel
    **/
  var showFooter: js.UndefOr[Boolean] = js.undefined
  /**
    to control show modal on background
    **/
  var showModal: js.UndefOr[Boolean] = js.undefined
  /**
    to control display window as round corner
    **/
  var showRoundCorner: js.UndefOr[Boolean] = js.undefined
  /**
    the title text of window
    **/
  var title: String
  /**
    the target url of iframe ready to load.
    **/
  var url: js.UndefOr[String] = js.undefined
  /**
    window width
    **/
  var width: js.UndefOr[Double] = js.undefined
  /**
    to limit window only can be dragged within browser window. this attribute only works when checkBoundary is true and caller is null.
    **/
  var withinBrowserWindow: js.UndefOr[Boolean] = js.undefined
  /**
    the x-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var x: js.UndefOr[Double] = js.undefined
  /**
    the y-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var y: js.UndefOr[Double] = js.undefined
  /**
    the css z-index value
    **/
  var z: js.UndefOr[Double] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    title: String,
    afterCascade: /* wnd */ Window => Unit = null,
    afterDrag: /* wnd */ Window => Unit = null,
    afterMaximize: /* wnd */ Window => Unit = null,
    afterMinimize: /* wnd */ Window => Unit = null,
    afterResize: /* wnd */ Window => Unit = null,
    bookmarkable: js.UndefOr[Boolean] = js.undefined,
    checkBoundary: js.UndefOr[Boolean] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    containerClass: String = null,
    content: String | JQuery | HTMLElement = null,
    createRandomOffset: X = null,
    custBtns: js.Array[Button] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    footerClass: String = null,
    footerContent: String | JQuery | HTMLElement = null,
    frameClass: String = null,
    headerClass: String = null,
    height: js.UndefOr[Double] = js.undefined,
    icon: String = null,
    iframeRedirectCheckMsg: String = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    minimizable: js.UndefOr[Boolean] = js.undefined,
    modalOpacity: js.UndefOr[Double] = js.undefined,
    onCascade: /* wnd */ Window => Unit = null,
    onClose: /* wnd */ Window => Unit = null,
    onDrag: /* wnd */ Window => Unit = null,
    onIframeEnd: /* wnd */ Window => Unit = null,
    onIframeStart: /* wnd */ Window => Unit = null,
    onMaximize: /* wnd */ Window => Unit = null,
    onMinimize: /* wnd */ Window => Unit = null,
    onOpen: /* wnd */ Window => Unit = null,
    onResize: /* wnd */ Window => Unit = null,
    onSelect: /* wnd */ Window => Unit = null,
    onShow: /* wnd */ Window => Unit = null,
    onUnselect: /* wnd */ Window => Unit = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    selectedHeaderClass: String = null,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    showModal: js.UndefOr[Boolean] = js.undefined,
    showRoundCorner: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined,
    withinBrowserWindow: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): WindowOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (afterCascade != null) __obj.updateDynamic("afterCascade")(js.Any.fromFunction1(afterCascade))
    if (afterDrag != null) __obj.updateDynamic("afterDrag")(js.Any.fromFunction1(afterDrag))
    if (afterMaximize != null) __obj.updateDynamic("afterMaximize")(js.Any.fromFunction1(afterMaximize))
    if (afterMinimize != null) __obj.updateDynamic("afterMinimize")(js.Any.fromFunction1(afterMinimize))
    if (afterResize != null) __obj.updateDynamic("afterResize")(js.Any.fromFunction1(afterResize))
    if (!js.isUndefined(bookmarkable)) __obj.updateDynamic("bookmarkable")(bookmarkable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkBoundary)) __obj.updateDynamic("checkBoundary")(checkBoundary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (createRandomOffset != null) __obj.updateDynamic("createRandomOffset")(createRandomOffset.asInstanceOf[js.Any])
    if (custBtns != null) __obj.updateDynamic("custBtns")(custBtns.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (footerClass != null) __obj.updateDynamic("footerClass")(footerClass.asInstanceOf[js.Any])
    if (footerContent != null) __obj.updateDynamic("footerContent")(footerContent.asInstanceOf[js.Any])
    if (frameClass != null) __obj.updateDynamic("frameClass")(frameClass.asInstanceOf[js.Any])
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iframeRedirectCheckMsg != null) __obj.updateDynamic("iframeRedirectCheckMsg")(iframeRedirectCheckMsg.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modalOpacity)) __obj.updateDynamic("modalOpacity")(modalOpacity.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.get.asInstanceOf[js.Any])
    if (selectedHeaderClass != null) __obj.updateDynamic("selectedHeaderClass")(selectedHeaderClass.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showModal)) __obj.updateDynamic("showModal")(showModal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundCorner)) __obj.updateDynamic("showRoundCorner")(showRoundCorner.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withinBrowserWindow)) __obj.updateDynamic("withinBrowserWindow")(withinBrowserWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

