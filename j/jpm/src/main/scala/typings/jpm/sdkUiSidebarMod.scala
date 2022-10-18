package typings.jpm

import typings.jpm.FFAddonSDK.BrowserWindow
import typings.jpm.FFAddonSDK.Port
import typings.jpm.anon.Id
import typings.jpm.jpmStrings.attach
import typings.jpm.jpmStrings.detach
import typings.jpm.jpmStrings.hide
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables you to create sidebars. A sidebar is a vertical strip of user interface real estate for your add-on that's
  * attached to the left-hand side of the browser window. You specify its content using HTML, CSS, and JavaScript,
  * and the user can show or hide it in the same way they can show or hide the built-in sidebars
  */
object sdkUiSidebarMod {
  
  @js.native
  trait Sidebar extends StObject {
    
    def dispose(): Unit = js.native
    
    def hide(): Unit = js.native
    def hide(window: BrowserWindow): Unit = js.native
    
    var id: String = js.native
    
    def on(
      event: show | hide | attach | detach | ready,
      handler: js.Function1[/* worker */ SidebarWorker, Any]
    ): Unit = js.native
    
    def once(
      event: show | hide | attach | detach | ready,
      handler: js.Function1[/* worker */ SidebarWorker, Any]
    ): Unit = js.native
    
    def removeListener(event: show | hide | attach | detach | ready, handler: js.Function): Unit = js.native
    
    def show(): Unit = js.native
    def show(window: BrowserWindow): Unit = js.native
    
    var title: String = js.native
    
    var url: String = js.native
  }
  object Sidebar {
    
    @JSImport("sdk/ui/sidebar", "Sidebar")
    @js.native
    def apply(options: Id): Sidebar = js.native
  }
  
  trait SidebarWorker extends StObject {
    
    var port: Port
  }
  object SidebarWorker {
    
    inline def apply(port: Port): SidebarWorker = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarWorker]
    }
    
    extension [Self <: SidebarWorker](x: Self) {
      
      inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
