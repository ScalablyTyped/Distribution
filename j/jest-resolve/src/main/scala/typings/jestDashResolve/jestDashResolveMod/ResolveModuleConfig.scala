package typings.jestDashResolve.jestDashResolveMod

import typings.atJestTypes.buildConfigMod.Path
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
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(skipNodeResolution)) __obj.updateDynamic("skipNodeResolution")(skipNodeResolution)
    __obj.asInstanceOf[ResolveModuleConfig]
  }
}

