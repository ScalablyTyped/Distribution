package typings.jestResolve.nodeModulesPathsMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeModulesPathsOptions extends js.Object {
  var moduleDirectory: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[js.Array[Path]] = js.undefined
}

object NodeModulesPathsOptions {
  @scala.inline
  def apply(moduleDirectory: js.Array[String] = null, paths: js.Array[Path] = null): NodeModulesPathsOptions = {
    val __obj = js.Dynamic.literal()
    if (moduleDirectory != null) __obj.updateDynamic("moduleDirectory")(moduleDirectory.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModulesPathsOptions]
  }
}

