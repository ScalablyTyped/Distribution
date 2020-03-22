package typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabApputils.vdomMod.VDomModel
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
  var _sessionContext: js.Any = js.native
  var _triggerChange: js.Any = js.native
  /**
    * A display name for the activity.
    */
  def activityName(): String = js.native
  def activityName(`val`: String): js.Any = js.native
  /**
    * The name of the kernel.
    */
  def kernelName(): String = js.native
  def sessionContext(): js.Any = js.native
  def sessionContext(sessionContext: ISessionContext): js.Any = js.native
  /**
    * The current client session associated with the kernel status indicator.
    */
  @JSName("sessionContext")
  def sessionContext_Union(): ISessionContext | Null = js.native
  /**
    * The current status of the kernel.
    */
  def status(): js.UndefOr[String] = js.native
}

