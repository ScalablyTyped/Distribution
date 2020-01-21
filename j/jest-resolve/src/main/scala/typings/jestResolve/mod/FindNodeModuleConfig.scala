package typings.jestResolve.mod

import typings.jestTypes.configMod.Path
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
    val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any])
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (moduleDirectory != null) __obj.updateDynamic("moduleDirectory")(moduleDirectory.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindNodeModuleConfig]
  }
}

