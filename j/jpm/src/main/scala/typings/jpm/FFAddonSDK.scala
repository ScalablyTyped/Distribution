package typings.jpm

import org.scalablytyped.runtime.Instantiable1
import typings.jpm.anon.Checked
import typings.jpm.anon.ContentScriptOptions
import typings.jpm.anon.Disabled
import typings.jpm.anon.OnError
import typings.jpm.anon.`16`
import typings.jpm.jpmStrings.activate
import typings.jpm.jpmStrings.attach
import typings.jpm.jpmStrings.change
import typings.jpm.jpmStrings.click
import typings.jpm.jpmStrings.close
import typings.jpm.jpmStrings.complete
import typings.jpm.jpmStrings.deactivate
import typings.jpm.jpmStrings.detach
import typings.jpm.jpmStrings.error
import typings.jpm.jpmStrings.interactive
import typings.jpm.jpmStrings.load
import typings.jpm.jpmStrings.loading
import typings.jpm.jpmStrings.message
import typings.jpm.jpmStrings.pageshow
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.tab
import typings.jpm.jpmStrings.uninitialized
import typings.jpm.jpmStrings.window
import typings.jpm.panelMod.PanelPosition
import typings.jpm.toolbarMod.ToolbarItem
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FFAddonSDK {
  
  @js.native
  trait ActionButton
    extends ActionButtonState
       with ToolbarItem {
    
    def click(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    @JSName("on")
    def on_click(event: click, handler: js.Function1[/* state */ ActionButtonState, _]): Unit = js.native
    
    @JSName("once")
    def once_click(event: click, handler: js.Function1[/* state */ ActionButtonState, _]): Unit = js.native
    
    @JSName("removeListener")
    def removeListener_click(event: click, handler: js.Function): Unit = js.native
    
    def state(target: ActionButton): ActionButtonState = js.native
    def state(target: ActionButton, state: Disabled): ActionButtonState = js.native
    // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
    def state(target: BrowserWindow): ActionButtonState = js.native
    def state(target: BrowserWindow, state: Disabled): ActionButtonState = js.native
    def state(target: Tab): ActionButtonState = js.native
    def state(target: Tab, state: Disabled): ActionButtonState = js.native
    @JSName("state")
    def state_tab(target: tab): ActionButtonState = js.native
    @JSName("state")
    def state_tab(target: tab, state: Disabled): ActionButtonState = js.native
    @JSName("state")
    def state_window(target: window): ActionButtonState = js.native
    @JSName("state")
    def state_window(target: window, state: Disabled): ActionButtonState = js.native
  }
  
  @js.native
  trait ActionButtonState extends StObject {
    
    var badge: String | Double = js.native
    
    var badgeColor: String = js.native
    
    var disabled: Boolean = js.native
    
    var icon: Icon = js.native
    
    var id: String = js.native
    
    var label: String = js.native
  }
  object ActionButtonState {
    
    @scala.inline
    def apply(
      badge: String | Double,
      badgeColor: String,
      disabled: Boolean,
      icon: Icon,
      id: String,
      label: String
    ): ActionButtonState = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], badgeColor = badgeColor.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionButtonState]
    }
    
    @scala.inline
    implicit class ActionButtonStateMutableBuilder[Self <: ActionButtonState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColor(value: String): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BrowserWindow extends StObject {
    
    def activate(): Unit = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var tabs: js.Array[Tab] = js.native
    
    var title: String = js.native
  }
  
  @js.native
  trait ContentWorker extends Instantiable1[/* options */ OnError, ContentWorker] {
    
    def destroy(): Unit = js.native
    
    @JSName("on")
    def on_detach(event: detach, handler: js.Function0[_]): Unit = js.native
    @JSName("on")
    def on_error(event: error, handler: js.Function0[_]): Unit = js.native
    @JSName("on")
    def on_message(event: message, handler: js.Function0[_]): Unit = js.native
    
    var port: Port = js.native
    
    def postMessage(): Unit = js.native
    def postMessage(data: js.Any): Unit = js.native
    
    var tab: Tab = js.native
    
    var url: URL = js.native
  }
  
  @js.native
  trait Frame extends ToolbarItem {
    
    def destroy(): Unit = js.native
    
    @JSName("off")
    def off_attach(event: attach, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_detach(event: detach, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_load(event: load, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_message(event: message, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_ready(event: ready, handler: js.Function): Unit = js.native
    
    @JSName("on")
    def on_attach(event: attach, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    @JSName("on")
    def on_detach(event: detach, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    @JSName("on")
    def on_load(event: load, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    @JSName("on")
    def on_message(event: message, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    @JSName("on")
    def on_ready(event: ready, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    
    @JSName("once")
    def once_attach(event: attach, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    @JSName("once")
    def once_detach(event: detach, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    @JSName("once")
    def once_load(event: load, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    @JSName("once")
    def once_message(event: message, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    @JSName("once")
    def once_ready(event: ready, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
    
    def postMessage(message: String, target: String): Unit = js.native
    
    @JSName("removeListener")
    def removeListener_attach(event: attach, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_detach(event: detach, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_load(event: load, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_message(event: message, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, handler: js.Function): Unit = js.native
    
    var url: URL = js.native
  }
  
  @js.native
  trait FrameEvent extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var origin: String = js.native
    
    var source: Frame = js.native
  }
  object FrameEvent {
    
    @scala.inline
    def apply(origin: String, source: Frame): FrameEvent = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameEvent]
    }
    
    @scala.inline
    implicit class FrameEventMutableBuilder[Self <: FrameEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: Frame): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type Icon = String | `16`
  
  /**
    * @see [nsIException]{@link https://developer.mozilla.org/en-US/docs/Mozilla/Tech/XPCOM/Reference/Interface/nsIException}
    */
  @js.native
  trait NSIException extends StObject {
    
    var columnNumber: Double = js.native
    
    var data: js.Any = js.native
    
    var filename: String = js.native
    
    var inner: js.UndefOr[NSIException] = js.native
    
    var lineNumber: Double = js.native
    
    var location: js.UndefOr[js.Any] = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    var result: js.Any = js.native
  }
  object NSIException {
    
    @scala.inline
    def apply(
      columnNumber: Double,
      data: js.Any,
      filename: String,
      lineNumber: Double,
      message: String,
      name: String,
      result: js.Any
    ): NSIException = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[NSIException]
    }
    
    @scala.inline
    implicit class NSIExceptionMutableBuilder[Self <: NSIException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInner(value: NSIException): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: js.Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The SDK port API
    * @see [port API]{@link https://developer.mozilla.org/en-US/Add-ons/SDK/Guides/using_port}
    */
  @js.native
  trait Port extends StObject {
    
    def emit(event: String): Unit = js.native
    def emit(event: String, data: js.Any): Unit = js.native
    
    def on(event: String, handler: js.Function1[/* data */ js.UndefOr[js.Any], _]): Unit = js.native
  }
  
  @js.native
  trait SDKURL extends StObject {
    
    var hash: String = js.native
    
    var host: String = js.native
    
    var hostname: String = js.native
    
    var href: String = js.native
    
    var origin: String = js.native
    
    var path: String = js.native
    
    var pathname: String = js.native
    
    var port: String = js.native
    
    var protocol: String = js.native
    
    var scheme: String = js.native
    
    var search: String = js.native
    
    def toJSON(): String = js.native
    
    var userPass: String = js.native
  }
  object SDKURL {
    
    @scala.inline
    def apply(
      hash: String,
      host: String,
      hostname: String,
      href: String,
      origin: String,
      path: String,
      pathname: String,
      port: String,
      protocol: String,
      scheme: String,
      search: String,
      toJSON: () => String,
      userPass: String
    ): SDKURL = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), userPass = userPass.asInstanceOf[js.Any])
      __obj.asInstanceOf[SDKURL]
    }
    
    @scala.inline
    implicit class SDKURLMutableBuilder[Self <: SDKURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUserPass(value: String): Self = StObject.set(x, "userPass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tab extends StObject {
    
    def activate(): Unit = js.native
    
    def attach(options: ContentScriptOptions): ContentWorker = js.native
    
    def close(): Unit = js.native
    def close(afterClose: js.Function0[_]): Unit = js.native
    
    var contentType: String = js.native
    
    var favicon: String = js.native
    
    def getThumbnail(): String = js.native
    
    var id: String = js.native
    
    var index: Double = js.native
    
    var isPinned: Boolean = js.native
    
    @JSName("on")
    def on_activate(event: activate, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_close(event: close, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_deactivate(event: deactivate, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_load(event: load, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_pageshow(event: pageshow, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_ready(event: ready, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
    
    def pin(): Unit = js.native
    
    var readyState: uninitialized | loading | interactive | complete = js.native
    
    def reload(): Unit = js.native
    
    var title: String = js.native
    
    def unpin(): Unit = js.native
    
    var url: String = js.native
    
    var window: BrowserWindow = js.native
  }
  
  @js.native
  trait ToggleButton
    extends ToggleButtonState
       with PanelPosition
       with ToolbarItem {
    
    def click(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    @JSName("on")
    def on_change(event: change, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
    @JSName("on")
    def on_click(event: click, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
    
    @JSName("once")
    def once_change(event: change, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
    @JSName("once")
    def once_click(event: click, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
    
    def removeListener(event: String, handler: js.Function): Unit = js.native
    
    def state(target: BrowserWindow): ToggleButtonState = js.native
    def state(target: BrowserWindow, state: Checked): ToggleButtonState = js.native
    def state(target: Tab): ToggleButtonState = js.native
    def state(target: Tab, state: Checked): ToggleButtonState = js.native
    def state(target: ToggleButton): ToggleButtonState = js.native
    def state(target: ToggleButton, state: Checked): ToggleButtonState = js.native
    @JSName("state")
    def state_tab(target: tab): ToggleButtonState = js.native
    @JSName("state")
    def state_tab(target: tab, state: Checked): ToggleButtonState = js.native
    @JSName("state")
    def state_window(target: window): ToggleButtonState = js.native
    @JSName("state")
    def state_window(target: window, state: Checked): ToggleButtonState = js.native
  }
  
  @js.native
  trait ToggleButtonState extends StObject {
    
    var badge: String = js.native
    
    var checked: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var id: String = js.native
    
    var label: String = js.native
  }
  object ToggleButtonState {
    
    @scala.inline
    def apply(badge: String, checked: Boolean, disabled: Boolean, id: String, label: String): ToggleButtonState = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleButtonState]
    }
    
    @scala.inline
    implicit class ToggleButtonStateMutableBuilder[Self <: ToggleButtonState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Widget extends PanelPosition
}
