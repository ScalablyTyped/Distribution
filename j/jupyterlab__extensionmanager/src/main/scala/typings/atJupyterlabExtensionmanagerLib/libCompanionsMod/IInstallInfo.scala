package typings
package atJupyterlabExtensionmanagerLib.libCompanionsMod

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
  var managers: js.Array[java.lang.String]
  /**
    * Overrides of the base install info on a per-manager basis.
    */
  var overrides: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[IInstallInfoEntry]]] = js.undefined
}

object IInstallInfo {
  @scala.inline
  def apply(
    base: IInstallInfoEntry,
    managers: js.Array[java.lang.String],
    overrides: org.scalablytyped.runtime.StringDictionary[js.UndefOr[IInstallInfoEntry]] = null
  ): IInstallInfo = {
    val __obj = js.Dynamic.literal(base = base, managers = managers)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[IInstallInfo]
  }
}

