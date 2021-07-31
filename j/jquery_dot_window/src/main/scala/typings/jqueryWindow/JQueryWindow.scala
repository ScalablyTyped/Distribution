package typings.jqueryWindow

import typings.jqueryWindow.anon.X
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryWindow {
  
  // Button definition
  trait Button extends StObject {
    
    /**
      **/
    def callback(btn: Button, wnd: Window): Unit
    
    /**
      **/
    var clazz: js.UndefOr[String] = js.undefined
    
    /**
      **/
    var id: String
    
    /**
      **/
    var image: String
    
    /**
      **/
    var style: js.UndefOr[String] = js.undefined
    
    /**
      **/
    var title: js.UndefOr[String] = js.undefined
  }
  object Button {
    
    @scala.inline
    def apply(callback: (Button, Window) => Unit, id: String, image: String): Button = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[Button]
    }
    
    @scala.inline
    implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (Button, Window) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClazz(value: String): Self = StObject.set(x, "clazz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClazzUndefined: Self = StObject.set(x, "clazz", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  // Static methods
  @js.native
  trait Static extends StObject {
    
    def apply(options: WindowOptions): Window = js.native
    
    /**
      close all created windows
      **/
    def closeAll(): Unit = js.native
    def closeAll(quiet: Boolean): Unit = js.native
    
    /**
      return all created windows instance
      **/
    def getAll(): js.Array[Window] = js.native
    
    /**
      get the selected window instance
      **/
    def getSelectedWindow(): Window = js.native
    
    /**
      get the window instance by passed window id
      **/
    def getWindow(windowId: String): Window = js.native
    
    /**
      hide all created windows
      **/
    def hideAll(): Unit = js.native
    
    /**
      initialize with customerized static setting attributes
      **/
    def prepare(): Unit = js.native
    def prepare(options: StaticOptions): Unit = js.native
    
    /**
      show all created windows
      **/
    def showAll(): Unit = js.native
  }
  
  // Static options
  trait StaticOptions extends StObject {
    
    /**
      the speed of animations: maximize, minimize, restore, shift, in milliseconds
      **/
    var animationSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      the direction of minimized window dock at. the available values are [left, right, top, bottom]
      **/
    var dock: js.UndefOr[String] = js.undefined
    
    /**
      the area which the windows will dock at
      **/
    var dockArea: js.UndefOr[JQuery | HTMLElement] = js.undefined
    
    /**
      to handle browser scrollbar when window status changed(maximize, minimize, cascade)
      **/
    var handleScrollbar: js.UndefOr[Boolean] = js.undefined
    
    /**
      the long dimension of minimized window
      **/
    var minWinLong: js.UndefOr[Double] = js.undefined
    
    /**
      the narrow dimension of minimized window
      **/
    var minWinNarrow: js.UndefOr[Double] = js.undefined
    
    /**
      to decide show log in firebug, IE8, chrome console
      **/
    var showLog: js.UndefOr[Boolean] = js.undefined
  }
  object StaticOptions {
    
    @scala.inline
    def apply(): StaticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticOptions]
    }
    
    @scala.inline
    implicit class StaticOptionsMutableBuilder[Self <: StaticOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      @scala.inline
      def setDock(value: String): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockArea(value: JQuery | HTMLElement): Self = StObject.set(x, "dockArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockAreaUndefined: Self = StObject.set(x, "dockArea", js.undefined)
      
      @scala.inline
      def setDockUndefined: Self = StObject.set(x, "dock", js.undefined)
      
      @scala.inline
      def setHandleScrollbar(value: Boolean): Self = StObject.set(x, "handleScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleScrollbarUndefined: Self = StObject.set(x, "handleScrollbar", js.undefined)
      
      @scala.inline
      def setMinWinLong(value: Double): Self = StObject.set(x, "minWinLong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWinLongUndefined: Self = StObject.set(x, "minWinLong", js.undefined)
      
      @scala.inline
      def setMinWinNarrow(value: Double): Self = StObject.set(x, "minWinNarrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWinNarrowUndefined: Self = StObject.set(x, "minWinNarrow", js.undefined)
      
      @scala.inline
      def setShowLog(value: Boolean): Self = StObject.set(x, "showLog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLogUndefined: Self = StObject.set(x, "showLog", js.undefined)
    }
  }
  
  // Instance methods
  @js.native
  trait Window extends StObject {
    
    /**
      set current window as screen center
      **/
    def alignCenter(): Unit = js.native
    
    /**
      set current window as horizontal center
      **/
    def alignHorizontalCenter(): Unit = js.native
    
    /**
      set current window as vertical center
      **/
    def alignVerticalCenter(): Unit = js.native
    
    /**
      close current window
      **/
    def close(quiet: Boolean): Unit = js.native
    
    /**
      get window container's parent panel, it's a jQuery object
      **/
    def getCaller(): JQuery = js.native
    
    /**
      get window container panel, it's a jQuery object
      **/
    def getContainer(): JQuery = js.native
    
    /**
      get frame html content
      **/
    def getContent(): String = js.native
    
    /**
      get window footer panel, it's a jQuery object
      **/
    def getFooter(): JQuery = js.native
    
    /**
      get footer html content
      **/
    def getFooterContent(): String = js.native
    
    /**
      get window frame panel, it's a jQuery object
      **/
    def getFrame(): JQuery = js.native
    
    /**
      get window header panel, it's a jQuery object
      **/
    def getHeader(): JQuery = js.native
    
    /**
      get window title text
      **/
    def getTitle(): String = js.native
    
    /**
      get url string
      **/
    def getUrl(): String = js.native
    
    /**
      get window id
      **/
    def getWindowId(): String = js.native
    
    /**
      hide current window
      **/
    def hide(): Unit = js.native
    
    /**
      hide window icon
      **/
    def hideIcon(): Unit = js.native
    
    /**
      get window maximized status
      **/
    def isMaximized(): Boolean = js.native
    
    /**
      get window minmized status
      **/
    def isMinimized(): Boolean = js.native
    
    /**
      get window selected status
      **/
    def isSelected(): Boolean = js.native
    
    /**
      maximize current window
      **/
    def maximize(): Unit = js.native
    
    /**
      minimize current window
      **/
    def minimize(): Unit = js.native
    
    /**
      move current window to target position or shift it by passed distance
      **/
    def move(x: Double, y: Double, bShift: Boolean): Unit = js.native
    
    /**
      resize current window to target width/height
      **/
    def resize(width: Double, height: Double): Unit = js.native
    
    /**
      restore current window, it could be maximized or cascade status
      **/
    def restore(): Unit = js.native
    
    /**
      select current window, it will increase the original z-index value with 2
      **/
    def select(): Unit = js.native
    
    /**
      change frame content
      **/
    def setContent(content: String): Unit = js.native
    def setContent(content: JQuery): Unit = js.native
    def setContent(content: HTMLElement): Unit = js.native
    
    /**
      change footer content
      **/
    def setFooterContent(content: String): Unit = js.native
    def setFooterContent(content: JQuery): Unit = js.native
    def setFooterContent(content: HTMLElement): Unit = js.native
    
    /**
      set window icon
      **/
    def setIcon(iconUrl: String): Unit = js.native
    
    /**
      change window title
      **/
    def setTitle(title: String): Unit = js.native
    
    /**
      change iframe url
      **/
    def setUrl(url: String): Unit = js.native
    
    /**
      show current window
      **/
    def show(): Unit = js.native
    
    /**
      show window icon
      **/
    def showIcon(): Unit = js.native
    
    /**
      unselect current window, it will set the z-index as original options.z
      **/
    def unselect(): Unit = js.native
  }
  
  // Instance options
  trait WindowOptions extends StObject {
    
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
    def apply(title: String): WindowOptions = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowOptions]
    }
    
    @scala.inline
    implicit class WindowOptionsMutableBuilder[Self <: WindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterCascade(value: /* wnd */ Window => Unit): Self = StObject.set(x, "afterCascade", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterCascadeUndefined: Self = StObject.set(x, "afterCascade", js.undefined)
      
      @scala.inline
      def setAfterDrag(value: /* wnd */ Window => Unit): Self = StObject.set(x, "afterDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterDragUndefined: Self = StObject.set(x, "afterDrag", js.undefined)
      
      @scala.inline
      def setAfterMaximize(value: /* wnd */ Window => Unit): Self = StObject.set(x, "afterMaximize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterMaximizeUndefined: Self = StObject.set(x, "afterMaximize", js.undefined)
      
      @scala.inline
      def setAfterMinimize(value: /* wnd */ Window => Unit): Self = StObject.set(x, "afterMinimize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterMinimizeUndefined: Self = StObject.set(x, "afterMinimize", js.undefined)
      
      @scala.inline
      def setAfterResize(value: /* wnd */ Window => Unit): Self = StObject.set(x, "afterResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterResizeUndefined: Self = StObject.set(x, "afterResize", js.undefined)
      
      @scala.inline
      def setBookmarkable(value: Boolean): Self = StObject.set(x, "bookmarkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBookmarkableUndefined: Self = StObject.set(x, "bookmarkable", js.undefined)
      
      @scala.inline
      def setCheckBoundary(value: Boolean): Self = StObject.set(x, "checkBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckBoundaryUndefined: Self = StObject.set(x, "checkBoundary", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
      
      @scala.inline
      def setContent(value: String | JQuery | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCreateRandomOffset(value: X): Self = StObject.set(x, "createRandomOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateRandomOffsetUndefined: Self = StObject.set(x, "createRandomOffset", js.undefined)
      
      @scala.inline
      def setCustBtns(value: js.Array[Button]): Self = StObject.set(x, "custBtns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustBtnsUndefined: Self = StObject.set(x, "custBtns", js.undefined)
      
      @scala.inline
      def setCustBtnsVarargs(value: Button*): Self = StObject.set(x, "custBtns", js.Array(value :_*))
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setFooterClass(value: String): Self = StObject.set(x, "footerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterClassUndefined: Self = StObject.set(x, "footerClass", js.undefined)
      
      @scala.inline
      def setFooterContent(value: String | JQuery | HTMLElement): Self = StObject.set(x, "footerContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterContentUndefined: Self = StObject.set(x, "footerContent", js.undefined)
      
      @scala.inline
      def setFrameClass(value: String): Self = StObject.set(x, "frameClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameClassUndefined: Self = StObject.set(x, "frameClass", js.undefined)
      
      @scala.inline
      def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassUndefined: Self = StObject.set(x, "headerClass", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIframeRedirectCheckMsg(value: String): Self = StObject.set(x, "iframeRedirectCheckMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeRedirectCheckMsgUndefined: Self = StObject.set(x, "iframeRedirectCheckMsg", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMinimizable(value: Boolean): Self = StObject.set(x, "minimizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizableUndefined: Self = StObject.set(x, "minimizable", js.undefined)
      
      @scala.inline
      def setModalOpacity(value: Double): Self = StObject.set(x, "modalOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalOpacityUndefined: Self = StObject.set(x, "modalOpacity", js.undefined)
      
      @scala.inline
      def setOnCascade(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onCascade", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCascadeUndefined: Self = StObject.set(x, "onCascade", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnDrag(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnIframeEnd(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onIframeEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIframeEndUndefined: Self = StObject.set(x, "onIframeEnd", js.undefined)
      
      @scala.inline
      def setOnIframeStart(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onIframeStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIframeStartUndefined: Self = StObject.set(x, "onIframeStart", js.undefined)
      
      @scala.inline
      def setOnMaximize(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onMaximize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMaximizeUndefined: Self = StObject.set(x, "onMaximize", js.undefined)
      
      @scala.inline
      def setOnMinimize(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onMinimize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMinimizeUndefined: Self = StObject.set(x, "onMinimize", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnUnselect(value: /* wnd */ Window => Unit): Self = StObject.set(x, "onUnselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnselectUndefined: Self = StObject.set(x, "onUnselect", js.undefined)
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      @scala.inline
      def setSelectedHeaderClass(value: String): Self = StObject.set(x, "selectedHeaderClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedHeaderClassUndefined: Self = StObject.set(x, "selectedHeaderClass", js.undefined)
      
      @scala.inline
      def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      @scala.inline
      def setShowModal(value: Boolean): Self = StObject.set(x, "showModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowModalUndefined: Self = StObject.set(x, "showModal", js.undefined)
      
      @scala.inline
      def setShowRoundCorner(value: Boolean): Self = StObject.set(x, "showRoundCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundCornerUndefined: Self = StObject.set(x, "showRoundCorner", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWithinBrowserWindow(value: Boolean): Self = StObject.set(x, "withinBrowserWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithinBrowserWindowUndefined: Self = StObject.set(x, "withinBrowserWindow", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
