package typings
package jpmLib.sdkUiSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarWorker extends js.Object {
  var port: jpmLib.FFAddonSDKNs.Port
}

object SidebarWorker {
  @scala.inline
  def apply(port: jpmLib.FFAddonSDKNs.Port): SidebarWorker = {
    val __obj = js.Dynamic.literal(port = port)
  
    __obj.asInstanceOf[SidebarWorker]
  }
}

