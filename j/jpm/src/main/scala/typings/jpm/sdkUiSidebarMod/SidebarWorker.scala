package typings.jpm.sdkUiSidebarMod

import typings.jpm.FFAddonSDK.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarWorker extends js.Object {
  var port: Port
}

object SidebarWorker {
  @scala.inline
  def apply(port: Port): SidebarWorker = {
    val __obj = js.Dynamic.literal(port = port)
  
    __obj.asInstanceOf[SidebarWorker]
  }
}

