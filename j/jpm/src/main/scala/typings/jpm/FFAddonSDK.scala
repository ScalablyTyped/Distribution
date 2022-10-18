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
import typings.jpm.sdkPanelMod.PanelPosition
import typings.jpm.sdkUiToolbarMod.ToolbarItem
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FFAddonSDK {
  
  @js.native
  trait ActionButton
    extends StObject
       with ActionButtonState
       with ToolbarItem {
    
    def click(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    @JSName("on")
    def on_click(event: click, handler: js.Function1[/* state */ ActionButtonState, Any]): Unit = js.native
    
    @JSName("once")
    def once_click(event: click, handler: js.Function1[/* state */ ActionButtonState, Any]): Unit = js.native
    
    @JSName("removeListener")
    def removeListener_click(event: click, handler: js.Function): Unit = js.native
    
    def state(target: window | tab): ActionButtonState = js.native
    def state(target: window | tab, state: Disabled): ActionButtonState = js.native
    def state(target: ActionButton): ActionButtonState = js.native
    def state(target: ActionButton, state: Disabled): ActionButtonState = js.native
    // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
    def state(target: BrowserWindow): ActionButtonState = js.native
    def state(target: BrowserWindow, state: Disabled): ActionButtonState = js.native
    def state(target: Tab): ActionButtonState = js.native
    def state(target: Tab, state: Disabled): ActionButtonState = js.native
  }
  
  trait ActionButtonState extends StObject {
    
    var badge: String | Double
    
    var badgeColor: String
    
    var disabled: Boolean
    
    var icon: Icon
    
    var id: String
    
    var label: String
  }
  object ActionButtonState {
    
    inline def apply(
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
    
    extension [Self <: ActionButtonState](x: Self) {
      
      inline def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeColor(value: String): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
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
  trait ContentWorker
    extends StObject
       with Instantiable1[/* options */ OnError, ContentWorker] {
    
    def destroy(): Unit = js.native
    
    def on(event: detach | message | error, handler: js.Function0[Any]): Unit = js.native
    
    var port: Port = js.native
    
    def postMessage(): Unit = js.native
    def postMessage(data: Any): Unit = js.native
    
    var tab: Tab = js.native
    
    var url: URL = js.native
  }
  
  trait Frame
    extends StObject
       with ToolbarItem {
    
    def destroy(): Unit
    
    def off(event: attach | detach | load | ready | message, handler: js.Function): Unit
    
    def on(
      event: attach | detach | load | ready | message,
      handler: js.Function1[/* event */ FrameEvent, Any]
    ): Unit
    
    def once(
      event: attach | detach | load | ready | message,
      handler: js.Function1[/* event */ FrameEvent, Any]
    ): Unit
    
    def postMessage(message: String, target: String): Unit
    
    def removeListener(event: attach | detach | load | ready | message, handler: js.Function): Unit
    
    var url: URL
  }
  object Frame {
    
    inline def apply(
      destroy: () => Unit,
      off: (attach | detach | load | ready | message, js.Function) => Unit,
      on: (attach | detach | load | ready | message, js.Function1[/* event */ FrameEvent, Any]) => Unit,
      once: (attach | detach | load | ready | message, js.Function1[/* event */ FrameEvent, Any]) => Unit,
      postMessage: (String, String) => Unit,
      removeListener: (attach | detach | load | ready | message, js.Function) => Unit,
      url: URL
    ): Frame = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), postMessage = js.Any.fromFunction2(postMessage), removeListener = js.Any.fromFunction2(removeListener), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    extension [Self <: Frame](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setOff(value: (attach | detach | load | ready | message, js.Function) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(
        value: (attach | detach | load | ready | message, js.Function1[/* event */ FrameEvent, Any]) => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(
        value: (attach | detach | load | ready | message, js.Function1[/* event */ FrameEvent, Any]) => Unit
      ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setPostMessage(value: (String, String) => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction2(value))
      
      inline def setRemoveListener(value: (attach | detach | load | ready | message, js.Function) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrameEvent extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var origin: String
    
    var source: Frame
  }
  object FrameEvent {
    
    inline def apply(origin: String, source: Frame): FrameEvent = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameEvent]
    }
    
    extension [Self <: FrameEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Frame): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type Icon = String | `16`
  
  /**
    * @see [nsIException]{@link https://developer.mozilla.org/en-US/docs/Mozilla/Tech/XPCOM/Reference/Interface/nsIException}
    */
  trait NSIException extends StObject {
    
    var columnNumber: Double
    
    var data: Any
    
    var filename: String
    
    var inner: js.UndefOr[NSIException] = js.undefined
    
    var lineNumber: Double
    
    var location: js.UndefOr[Any] = js.undefined
    
    var message: String
    
    var name: String
    
    var result: Any
  }
  object NSIException {
    
    inline def apply(
      columnNumber: Double,
      data: Any,
      filename: String,
      lineNumber: Double,
      message: String,
      name: String,
      result: Any
    ): NSIException = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[NSIException]
    }
    
    extension [Self <: NSIException](x: Self) {
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setInner(value: NSIException): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The SDK port API
    * @see [port API]{@link https://developer.mozilla.org/en-US/Add-ons/SDK/Guides/using_port}
    */
  @js.native
  trait Port extends StObject {
    
    def emit(event: String): Unit = js.native
    def emit(event: String, data: Any): Unit = js.native
    
    def on(event: String, handler: js.Function1[/* data */ js.UndefOr[Any], Any]): Unit = js.native
  }
  
  trait SDKURL extends StObject {
    
    var hash: String
    
    var host: String
    
    var hostname: String
    
    var href: String
    
    var origin: String
    
    var path: String
    
    var pathname: String
    
    var port: String
    
    var protocol: String
    
    var scheme: String
    
    var search: String
    
    def toJSON(): String
    
    var userPass: String
  }
  object SDKURL {
    
    inline def apply(
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
    
    extension [Self <: SDKURL](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setUserPass(value: String): Self = StObject.set(x, "userPass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tab extends StObject {
    
    def activate(): Unit = js.native
    
    def attach(options: ContentScriptOptions): ContentWorker = js.native
    
    def close(): Unit = js.native
    def close(afterClose: js.Function0[Any]): Unit = js.native
    
    var contentType: String = js.native
    
    var favicon: String = js.native
    
    def getThumbnail(): String = js.native
    
    var id: String = js.native
    
    var index: Double = js.native
    
    var isPinned: Boolean = js.native
    
    def on(
      event: ready | load | pageshow | activate | deactivate | close,
      handler: js.Function1[/* tab */ this.type, Any]
    ): Unit = js.native
    
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
    extends StObject
       with ToggleButtonState
       with PanelPosition
       with ToolbarItem {
    
    def click(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def on(event: click | change, handler: js.Function1[/* state */ ToggleButtonState, Any]): Unit = js.native
    
    def once(event: click | change, handler: js.Function1[/* state */ ToggleButtonState, Any]): Unit = js.native
    
    def removeListener(event: String, handler: js.Function): Unit = js.native
    
    def state(target: window | tab): ToggleButtonState = js.native
    def state(target: window | tab, state: Checked): ToggleButtonState = js.native
    def state(target: BrowserWindow): ToggleButtonState = js.native
    def state(target: BrowserWindow, state: Checked): ToggleButtonState = js.native
    def state(target: Tab): ToggleButtonState = js.native
    def state(target: Tab, state: Checked): ToggleButtonState = js.native
    def state(target: ToggleButton): ToggleButtonState = js.native
    def state(target: ToggleButton, state: Checked): ToggleButtonState = js.native
  }
  
  trait ToggleButtonState extends StObject {
    
    var badge: String
    
    var checked: Boolean
    
    var disabled: Boolean
    
    var id: String
    
    var label: String
  }
  object ToggleButtonState {
    
    inline def apply(badge: String, checked: Boolean, disabled: Boolean, id: String, label: String): ToggleButtonState = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleButtonState]
    }
    
    extension [Self <: ToggleButtonState](x: Self) {
      
      inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait Widget
    extends StObject
       with PanelPosition
}
