package typings.jpm

import typings.jpm.anon.Hidden
import typings.jpm.jpmStrings.attach
import typings.jpm.jpmStrings.detach
import typings.jpm.jpmStrings.hide
import typings.jpm.jpmStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a toolbar to the Firefox user interface. A toolbar is a horizontal strip of user interface real estate
  */
@JSImport("sdk/ui/toolbar", JSImport.Namespace)
@js.native
object toolbarMod extends js.Object {
  
  def Toolbar(options: Hidden): Toolbar = js.native
  @js.native
  trait Toolbar extends js.Object {
    
    def destroy(): Unit = js.native
    
    var hidden: Boolean = js.native
    
    var items: js.Array[ToolbarItem] = js.native
    
    @JSName("off")
    def off_attach(event: attach, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_detach(event: detach, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_hide(event: hide, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_show(event: show, handler: js.Function): Unit = js.native
    
    @JSName("on")
    def on_attach(event: attach, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_detach(event: detach, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_hide(event: hide, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_show(event: show, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    
    @JSName("once")
    def once_attach(event: attach, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("once")
    def once_detach(event: detach, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("once")
    def once_hide(event: hide, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("once")
    def once_show(event: show, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    
    @JSName("removeListener")
    def removeListener_attach(event: attach, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_detach(event: detach, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_hide(event: hide, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_show(event: show, handler: js.Function): Unit = js.native
    
    var title: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jpm.FFAddonSDK.Frame
    - typings.jpm.FFAddonSDK.ActionButton
    - typings.jpm.FFAddonSDK.ToggleButton
  */
  trait ToolbarItem extends js.Object
}
