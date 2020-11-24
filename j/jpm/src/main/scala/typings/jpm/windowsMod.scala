package typings.jpm

import typings.jpm.FFAddonSDK.BrowserWindow
import typings.jpm.anon.IsPrivate
import typings.jpm.jpmStrings.activate
import typings.jpm.jpmStrings.close
import typings.jpm.jpmStrings.deactivate
import typings.jpm.jpmStrings.open
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enumerate and examine open browser windows, open new windows, and listen for window events
  */
@JSImport("sdk/windows", JSImport.Namespace)
@js.native
object windowsMod extends js.Object {
  
  val browserWindows: BrowserWindows_ = js.native
  
  @js.native
  trait BrowserWindows_ extends Array[BrowserWindow] {
    
    var activeWindow: BrowserWindow = js.native
    
    @JSName("on")
    def on_activate(event: activate, handler: js.Function1[/* window */ BrowserWindow, _]): Unit = js.native
    @JSName("on")
    def on_close(event: close, handler: js.Function1[/* window */ BrowserWindow, _]): Unit = js.native
    @JSName("on")
    def on_deactivate(event: deactivate, handler: js.Function1[/* window */ BrowserWindow, _]): Unit = js.native
    @JSName("on")
    def on_open(event: open, handler: js.Function1[/* window */ BrowserWindow, _]): Unit = js.native
    
    /**
      * Open a new window
      * @param options.isPrivate determines whether the new window should be private or not
      */
    def open(options: String): BrowserWindow = js.native
    def open(options: IsPrivate): BrowserWindow = js.native
  }
}
