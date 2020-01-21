package typings.jupyterlabExtensionmanager.companionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInstallInfoEntry extends js.Object {
  /**
    * Whether the package also includes the lab extension.
    */
  var bundles_extension: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the companion package/module.
    */
  var name: js.UndefOr[String] = js.undefined
}

object IInstallInfoEntry {
  @scala.inline
  def apply(bundles_extension: js.UndefOr[Boolean] = js.undefined, name: String = null): IInstallInfoEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bundles_extension)) __obj.updateDynamic("bundles_extension")(bundles_extension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstallInfoEntry]
  }
}

