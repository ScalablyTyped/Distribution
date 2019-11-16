package typings.jestDashResolve.buildTypesMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverConfig extends js.Object {
  var browser: js.UndefOr[Boolean] = js.undefined
  var defaultPlatform: js.UndefOr[String | Null] = js.undefined
  var extensions: js.Array[String]
  var hasCoreModules: Boolean
  var moduleDirectories: js.Array[String]
  var moduleNameMapper: js.UndefOr[js.Array[ModuleNameMapperConfig] | Null] = js.undefined
  var modulePaths: js.Array[Path]
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
  var resolver: js.UndefOr[Path | Null] = js.undefined
  var rootDir: Path
}

object ResolverConfig {
  @scala.inline
  def apply(
    extensions: js.Array[String],
    hasCoreModules: Boolean,
    moduleDirectories: js.Array[String],
    modulePaths: js.Array[Path],
    rootDir: Path,
    browser: js.UndefOr[Boolean] = js.undefined,
    defaultPlatform: String = null,
    moduleNameMapper: js.Array[ModuleNameMapperConfig] = null,
    platforms: js.Array[String] = null,
    resolver: Path = null
  ): ResolverConfig = {
    val __obj = js.Dynamic.literal(extensions = extensions, hasCoreModules = hasCoreModules, moduleDirectories = moduleDirectories, modulePaths = modulePaths, rootDir = rootDir)
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser)
    if (defaultPlatform != null) __obj.updateDynamic("defaultPlatform")(defaultPlatform)
    if (moduleNameMapper != null) __obj.updateDynamic("moduleNameMapper")(moduleNameMapper)
    if (platforms != null) __obj.updateDynamic("platforms")(platforms)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    __obj.asInstanceOf[ResolverConfig]
  }
}

