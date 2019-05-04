package typings
package atJupyterlabRunningLib.atJupyterlabRunningMod.RunningSessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a running sessions widget.
  */
trait IOptions extends js.Object {
  /**
    * A service manager instance.
    */
  var manager: atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager
}

object IOptions {
  @scala.inline
  def apply(manager: atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager)
  
    __obj.asInstanceOf[IOptions]
  }
}

