package typings.jestResolve.mod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveModuleConfig extends js.Object {
  var paths: js.UndefOr[js.Array[Path]] = js.undefined
  var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
}

object ResolveModuleConfig {
  @scala.inline
  def apply(paths: js.Array[Path] = null, skipNodeResolution: js.UndefOr[Boolean] = js.undefined): ResolveModuleConfig = {
    val __obj = js.Dynamic.literal()
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(skipNodeResolution)) __obj.updateDynamic("skipNodeResolution")(skipNodeResolution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveModuleConfig]
  }
}

