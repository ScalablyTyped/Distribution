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

