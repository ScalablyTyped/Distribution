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
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], hasCoreModules = hasCoreModules.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], modulePaths = modulePaths.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (defaultPlatform != null) __obj.updateDynamic("defaultPlatform")(defaultPlatform.asInstanceOf[js.Any])
    if (moduleNameMapper != null) __obj.updateDynamic("moduleNameMapper")(moduleNameMapper.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverConfig]
  }
}

