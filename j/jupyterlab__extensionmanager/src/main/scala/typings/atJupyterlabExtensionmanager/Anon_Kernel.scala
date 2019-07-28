package typings.atJupyterlabExtensionmanager

import typings.atJupyterlabExtensionmanager.libCompanionsMod.IInstallInfo
import typings.atJupyterlabExtensionmanager.libCompanionsMod.IKernelInstallInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Kernel extends js.Object {
  /**
    * Information about any kernel companions.
    */
  var kernel: js.UndefOr[js.Array[IKernelInstallInfo]] = js.undefined
  /**
    * Information about any server extension companions.
    */
  var server: js.UndefOr[IInstallInfo] = js.undefined
}

object Anon_Kernel {
  @scala.inline
  def apply(kernel: js.Array[IKernelInstallInfo] = null, server: IInstallInfo = null): Anon_Kernel = {
    val __obj = js.Dynamic.literal()
    if (kernel != null) __obj.updateDynamic("kernel")(kernel)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Anon_Kernel]
  }
}

