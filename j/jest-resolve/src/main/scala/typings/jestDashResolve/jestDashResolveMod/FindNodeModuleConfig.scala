package typings.jestDashResolve.jestDashResolveMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindNodeModuleConfig extends js.Object {
  var basedir: Path
  var browser: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var moduleDirectory: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[js.Array[Path]] = js.undefined
  var resolver: js.UndefOr[Path | Null] = js.undefined
  var rootDir: js.UndefOr[Path] = js.undefined
}

object FindNodeModuleConfig {
  @scala.inline
  def apply(
    basedir: Path,
    browser: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    moduleDirectory: js.Array[String] = null,
    paths: js.Array[Path] = null,
    resolver: Path = null,
    rootDir: Path = null
  ): FindNodeModuleConfig = {
    val __obj = js.Dynamic.literal(basedir = basedir)
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (moduleDirectory != null) __obj.updateDynamic("moduleDirectory")(moduleDirectory)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir)
    __obj.asInstanceOf[FindNodeModuleConfig]
  }
}

