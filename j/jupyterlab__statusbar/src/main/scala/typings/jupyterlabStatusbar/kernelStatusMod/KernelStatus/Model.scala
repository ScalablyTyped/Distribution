package typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus

import typings.jupyterlabApputils.clientsessionMod.IClientSession
import typings.jupyterlabApputils.vdomMod.VDomModel
import typings.jupyterlabServices.kernelKernelMod.Kernel.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VDomModel for the kernel status indicator.
  */
@JSImport("@jupyterlab/statusbar/lib/defaults/kernelStatus", "KernelStatus.Model")
@js.native
class Model () extends VDomModel {
  var _activityName: js.Any = js.native
  var _getAllState: js.Any = js.native
  var _kernelName: js.Any = js.native
  var _kernelStatus: js.Any = js.native
  /**
    * React to changes in the kernel.
    */
  var _onKernelChanged: js.Any = js.native
  /**
    * React to changes to the kernel status.
    */
  var _onKernelStatusChanged: js.Any = js.native
  var _session: js.Any = js.native
  var _triggerChange: js.Any = js.native
  /**
    * A display name for the activity.
    */
  var activityName: String = js.native
  /**
    * The name of the kernel.
    */
  val kernelName: String = js.native
  /**
    * The current client session associated with the kernel status indicator.
    */
  var session: IClientSession | Null = js.native
  /**
    * The current status of the kernel.
    */
  val status: Status = js.native
}

