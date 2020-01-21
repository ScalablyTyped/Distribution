package typings.jupyterlabExtensionmanager

import typings.jupyterlabExtensionmanager.companionsMod.IInstallInfo
import typings.jupyterlabExtensionmanager.companionsMod.IKernelInstallInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKernel extends js.Object {
  /**
    * Information about any kernel companions.
    */
  var kernel: js.UndefOr[js.Array[IKernelInstallInfo]] = js.undefined
  /**
    * Information about any server extension companions.
    */
  var server: js.UndefOr[IInstallInfo] = js.undefined
}

object AnonKernel {
  @scala.inline
  def apply(kernel: js.Array[IKernelInstallInfo] = null, server: IInstallInfo = null): AnonKernel = {
    val __obj = js.Dynamic.literal()
    if (kernel != null) __obj.updateDynamic("kernel")(kernel.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKernel]
  }
}

