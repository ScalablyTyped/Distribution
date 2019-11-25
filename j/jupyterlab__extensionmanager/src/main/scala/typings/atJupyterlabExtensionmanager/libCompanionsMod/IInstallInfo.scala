package typings.atJupyterlabExtensionmanager.libCompanionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInstallInfo extends js.Object {
  /**
    * The base/default install info.
    */
  var base: IInstallInfoEntry
  /**
    * Which package managers that have the package/module.
    */
  var managers: js.Array[String]
  /**
    * Overrides of the base install info on a per-manager basis.
    */
  var overrides: js.UndefOr[StringDictionary[js.UndefOr[IInstallInfoEntry]]] = js.undefined
}

object IInstallInfo {
  @scala.inline
  def apply(
    base: IInstallInfoEntry,
    managers: js.Array[String],
    overrides: StringDictionary[js.UndefOr[IInstallInfoEntry]] = null
  ): IInstallInfo = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstallInfo]
  }
}

