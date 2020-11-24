package typings.jupyterlabMainmenu.kernelMod

import typings.jupyterlabMainmenu.kernelMod.IKernelMenu.IKernelUser
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKernelMenu_ extends IJupyterLabMenu {
  
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}
