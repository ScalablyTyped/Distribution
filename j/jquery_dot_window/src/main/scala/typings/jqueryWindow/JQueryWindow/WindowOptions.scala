package typings.jqueryWindow.JQueryWindow

import typings.jqueryWindow.JQuery
import typings.jqueryWindow.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance options
@js.native
trait WindowOptions extends js.Object {
  /**
    a callback function after window cascaded
    **/
  var afterCascade: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function after window dragged
    **/
  var afterDrag: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function after window maximized
    **/
  var afterMaximize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function after window minimized
    **/
  var afterMinimize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function after window resized
    **/
  var afterResize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    to control window with remote url could be bookmarked
    **/
  var bookmarkable: js.UndefOr[Boolean] = js.native
  /**
    to check window dialog overflow html body or caller element
    **/
  var checkBoundary: js.UndefOr[Boolean] = js.native
  /**
    to control window closable
    **/
  var closable: js.UndefOr[Boolean] = js.native
  /**
    container extra class
    **/
  var containerClass: js.UndefOr[String] = js.native
  /**
    this attribute only works when url is null. when passing a jquery object or a element, it will clone the original one to append.
    **/
  var content: js.UndefOr[String | JQuery | HTMLElement] = js.native
  /**
    random the new created window position, it only works when options x,y value both are -1
    **/
  var createRandomOffset: js.UndefOr[X] = js.native
  /**
    to describe the customized button display and callback function
    **/
  var custBtns: js.UndefOr[js.Array[Button]] = js.native
  /**
    to control window draggable
    **/
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    footer extra class
    **/
  var footerClass: js.UndefOr[String] = js.native
  /**
    same as content attribute, but it's put on footer panel.
    **/
  var footerContent: js.UndefOr[String | JQuery | HTMLElement] = js.native
  /**
    frame extra class
    **/
  var frameClass: js.UndefOr[String] = js.native
  /**
    header extra class
    **/
  var headerClass: js.UndefOr[String] = js.native
  /**
    window height
    **/
  var height: js.UndefOr[Double] = js.native
  /**
    an icon image url string. if this attribute is given, it will force to replace the original favicon of remote page on window. or you can set it as null to hide icon.
    **/
  var icon: js.UndefOr[String] = js.native
  /**
    if null means no check, or pass a string to show warning message while iframe is going to redirect current top page
    **/
  var iframeRedirectCheckMsg: js.UndefOr[String] = js.native
  /**
    the maximum height, if -1 means no checking
    **/
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    the maximum width, if -1 means no checking
    **/
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    to control window maximizable
    **/
  var maximizable: js.UndefOr[Boolean] = js.native
  /**
    the minimum height, if -1 means no checking
    **/
  var minHeight: js.UndefOr[Double] = js.native
  /**
    the minimum width, if -1 means no checking
    **/
  var minWidth: js.UndefOr[Double] = js.native
  /**
    to control window minimizable
    **/
  var minimizable: js.UndefOr[Boolean] = js.native
  /**
    the opacity of modal dialog
    **/
  var modalOpacity: js.UndefOr[Double] = js.native
  /**
    a callback function while window is going to cascade
    **/
  var onCascade: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while user click close button
    **/
  var onClose: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window is going to drag
    **/
  var onDrag: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while iframe load finished. this attribute only works while url attribute is given
    **/
  var onIframeEnd: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while iframe ready to connect remoting url. this attribute only works while url attribute is given
    **/
  var onIframeStart: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window is going to maximize
    **/
  var onMaximize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window is going to minimize
    **/
  var onMinimize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while container is added into body
    **/
  var onOpen: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window is going to resize
    **/
  var onResize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while user select the window
    **/
  var onSelect: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while whole window display routine is finished
    **/
  var onShow: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    a callback function while window unselected
    **/
  var onUnselect: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.native
  /**
    to control window resizable
    **/
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    to show scroll bar or not
    **/
  var scrollable: js.UndefOr[Boolean] = js.native
  /**
    selected header extra class
    **/
  var selectedHeaderClass: js.UndefOr[String] = js.native
  /**
    to control show footer panel
    **/
  var showFooter: js.UndefOr[Boolean] = js.native
  /**
    to control show modal on background
    **/
  var showModal: js.UndefOr[Boolean] = js.native
  /**
    to control display window as round corner
    **/
  var showRoundCorner: js.UndefOr[Boolean] = js.native
  /**
    the title text of window
    **/
  var title: String = js.native
  /**
    the target url of iframe ready to load.
    **/
  var url: js.UndefOr[String] = js.native
  /**
    window width
    **/
  var width: js.UndefOr[Double] = js.native
  /**
    to limit window only can be dragged within browser window. this attribute only works when checkBoundary is true and caller is null.
    **/
  var withinBrowserWindow: js.UndefOr[Boolean] = js.native
  /**
    the x-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var x: js.UndefOr[Double] = js.native
  /**
    the y-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var y: js.UndefOr[Double] = js.native
  /**
    the css z-index value
    **/
  var z: js.UndefOr[Double] = js.native
}

object WindowOptions {
  @scala.inline
  def apply(title: String): WindowOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
  @scala.inline
  implicit class WindowOptionsOps[Self <: WindowOptions] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterCascade(value: /* wnd */ Window => Unit): Self = this.set("afterCascade", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterCascade: Self = this.set("afterCascade", js.undefined)
    @scala.inline
    def setAfterDrag(value: /* wnd */ Window => Unit): Self = this.set("afterDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterDrag: Self = this.set("afterDrag", js.undefined)
    @scala.inline
    def setAfterMaximize(value: /* wnd */ Window => Unit): Self = this.set("afterMaximize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterMaximize: Self = this.set("afterMaximize", js.undefined)
    @scala.inline
    def setAfterMinimize(value: /* wnd */ Window => Unit): Self = this.set("afterMinimize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterMinimize: Self = this.set("afterMinimize", js.undefined)
    @scala.inline
    def setAfterResize(value: /* wnd */ Window => Unit): Self = this.set("afterResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterResize: Self = this.set("afterResize", js.undefined)
    @scala.inline
    def setBookmarkable(value: Boolean): Self = this.set("bookmarkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmarkable: Self = this.set("bookmarkable", js.undefined)
    @scala.inline
    def setCheckBoundary(value: Boolean): Self = this.set("checkBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckBoundary: Self = this.set("checkBoundary", js.undefined)
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    @scala.inline
    def setContent(value: String | JQuery | HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setCreateRandomOffset(value: X): Self = this.set("createRandomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateRandomOffset: Self = this.set("createRandomOffset", js.undefined)
    @scala.inline
    def setCustBtnsVarargs(value: Button*): Self = this.set("custBtns", js.Array(value :_*))
    @scala.inline
    def setCustBtns(value: js.Array[Button]): Self = this.set("custBtns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustBtns: Self = this.set("custBtns", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setFooterClass(value: String): Self = this.set("footerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterClass: Self = this.set("footerClass", js.undefined)
    @scala.inline
    def setFooterContent(value: String | JQuery | HTMLElement): Self = this.set("footerContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterContent: Self = this.set("footerContent", js.undefined)
    @scala.inline
    def setFrameClass(value: String): Self = this.set("frameClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameClass: Self = this.set("frameClass", js.undefined)
    @scala.inline
    def setHeaderClass(value: String): Self = this.set("headerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClass: Self = this.set("headerClass", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIframeRedirectCheckMsg(value: String): Self = this.set("iframeRedirectCheckMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeRedirectCheckMsg: Self = this.set("iframeRedirectCheckMsg", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaximizable(value: Boolean): Self = this.set("maximizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizable: Self = this.set("maximizable", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMinimizable(value: Boolean): Self = this.set("minimizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimizable: Self = this.set("minimizable", js.undefined)
    @scala.inline
    def setModalOpacity(value: Double): Self = this.set("modalOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalOpacity: Self = this.set("modalOpacity", js.undefined)
    @scala.inline
    def setOnCascade(value: /* wnd */ Window => Unit): Self = this.set("onCascade", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCascade: Self = this.set("onCascade", js.undefined)
    @scala.inline
    def setOnClose(value: /* wnd */ Window => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnDrag(value: /* wnd */ Window => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnIframeEnd(value: /* wnd */ Window => Unit): Self = this.set("onIframeEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIframeEnd: Self = this.set("onIframeEnd", js.undefined)
    @scala.inline
    def setOnIframeStart(value: /* wnd */ Window => Unit): Self = this.set("onIframeStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIframeStart: Self = this.set("onIframeStart", js.undefined)
    @scala.inline
    def setOnMaximize(value: /* wnd */ Window => Unit): Self = this.set("onMaximize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMaximize: Self = this.set("onMaximize", js.undefined)
    @scala.inline
    def setOnMinimize(value: /* wnd */ Window => Unit): Self = this.set("onMinimize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMinimize: Self = this.set("onMinimize", js.undefined)
    @scala.inline
    def setOnOpen(value: /* wnd */ Window => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOnResize(value: /* wnd */ Window => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setOnSelect(value: /* wnd */ Window => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnShow(value: /* wnd */ Window => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnUnselect(value: /* wnd */ Window => Unit): Self = this.set("onUnselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUnselect: Self = this.set("onUnselect", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setSelectedHeaderClass(value: String): Self = this.set("selectedHeaderClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedHeaderClass: Self = this.set("selectedHeaderClass", js.undefined)
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    @scala.inline
    def setShowModal(value: Boolean): Self = this.set("showModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowModal: Self = this.set("showModal", js.undefined)
    @scala.inline
    def setShowRoundCorner(value: Boolean): Self = this.set("showRoundCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoundCorner: Self = this.set("showRoundCorner", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWithinBrowserWindow(value: Boolean): Self = this.set("withinBrowserWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithinBrowserWindow: Self = this.set("withinBrowserWindow", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
  
}

