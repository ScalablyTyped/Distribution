package typings.jpm

import typings.jpm.FFAddonSDK.Port
import typings.jpm.anon.Allow
import typings.jpm.anon.Script
import typings.jpm.jpmStrings.error
import typings.jpm.jpmStrings.message
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a permanent, invisible page and access its DOM
  */
object pageWorkerMod {
  
  @JSImport("sdk/page-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Page(options: Allow): PageWorker = ^.asInstanceOf[js.Dynamic].applyDynamic("Page")(options.asInstanceOf[js.Any]).asInstanceOf[PageWorker]
  
  @js.native
  trait PageWorker extends StObject {
    
    var allow: js.UndefOr[Script] = js.native
    
    var contentScript: js.UndefOr[String | js.Array[String]] = js.native
    
    var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
    
    var contentURL: js.UndefOr[String] = js.native
    
    def destroy(): Unit = js.native
    
    var include: js.UndefOr[String | (js.Array[RegExp | String]) | RegExp] = js.native
    
    def on(event: error, handler: js.Function1[/* arg */ js.UndefOr[message | Error], js.Any]): Unit = js.native
    @JSName("on")
    def on_message(event: message, handler: js.Function1[/* arg */ js.UndefOr[message | Error], js.Any]): Unit = js.native
    
    var port: Port = js.native
    
    def postMessage(message: String): Unit = js.native
    
    def removeListener(event: String, listener: js.Function): Unit = js.native
  }
}
