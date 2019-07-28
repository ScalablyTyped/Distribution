package typings.atJupyterlabExtensionmanager.libCompanionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabExtensionmanager.Anon_Displayname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKernelInstallInfo extends IInstallInfo {
  /**
    * A specification of which kernels the current install info applies to.
    */
  var kernel_spec: Anon_Displayname
}

object IKernelInstallInfo {
  @scala.inline
  def apply(
    base: IInstallInfoEntry,
    kernel_spec: Anon_Displayname,
    managers: js.Array[String],
    overrides: StringDictionary[js.UndefOr[IInstallInfoEntry]] = null
  ): IKernelInstallInfo = {
    val __obj = js.Dynamic.literal(base = base, kernel_spec = kernel_spec, managers = managers)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[IKernelInstallInfo]
  }
}

