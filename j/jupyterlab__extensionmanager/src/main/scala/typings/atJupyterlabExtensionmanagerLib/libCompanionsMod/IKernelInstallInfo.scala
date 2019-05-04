package typings
package atJupyterlabExtensionmanagerLib.libCompanionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKernelInstallInfo extends IInstallInfo {
  /**
    * A specification of which kernels the current install info applies to.
    */
  var kernel_spec: atJupyterlabExtensionmanagerLib.Anon_Displayname
}

object IKernelInstallInfo {
  @scala.inline
  def apply(
    base: IInstallInfoEntry,
    kernel_spec: atJupyterlabExtensionmanagerLib.Anon_Displayname,
    managers: js.Array[java.lang.String],
    overrides: org.scalablytyped.runtime.StringDictionary[js.UndefOr[IInstallInfoEntry]] = null
  ): IKernelInstallInfo = {
    val __obj = js.Dynamic.literal(base = base, kernel_spec = kernel_spec, managers = managers)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[IKernelInstallInfo]
  }
}

