package typings.jestDashHasteDashMap.jestDashHasteDashMapMod

import typings.jestDashHasteDashMap.buildTypesMod.HasteRegExp
import typings.jestDashHasteDashMap.buildTypesMod.Mapper
import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.undefined
  var computeDependencies: js.UndefOr[Boolean] = js.undefined
  var computeSha1: js.UndefOr[Boolean] = js.undefined
  var console: js.UndefOr[Console] = js.undefined
  var dependencyExtractor: js.UndefOr[String] = js.undefined
  var extensions: js.Array[String]
  var forceNodeFilesystemAPI: js.UndefOr[Boolean] = js.undefined
  var hasteImplModulePath: js.UndefOr[String] = js.undefined
  var ignorePattern: js.UndefOr[HasteRegExp] = js.undefined
  var mapper: js.UndefOr[Mapper] = js.undefined
  var maxWorkers: Double
  var mocksPattern: js.UndefOr[String] = js.undefined
  var name: String
  var platforms: js.Array[String]
  var providesModuleNodeModules: js.UndefOr[js.Array[String]] = js.undefined
  var resetCache: js.UndefOr[Boolean] = js.undefined
  var retainAllFiles: Boolean
  var rootDir: String
  var roots: js.Array[String]
  var skipPackageJson: js.UndefOr[Boolean] = js.undefined
  var throwOnModuleCollision: js.UndefOr[Boolean] = js.undefined
  var useWatchman: js.UndefOr[Boolean] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extensions: js.Array[String],
    maxWorkers: Double,
    name: String,
    platforms: js.Array[String],
    retainAllFiles: Boolean,
    rootDir: String,
    roots: js.Array[String],
    cacheDirectory: String = null,
    computeDependencies: js.UndefOr[Boolean] = js.undefined,
    computeSha1: js.UndefOr[Boolean] = js.undefined,
    console: Console = null,
    dependencyExtractor: String = null,
    forceNodeFilesystemAPI: js.UndefOr[Boolean] = js.undefined,
    hasteImplModulePath: String = null,
    ignorePattern: HasteRegExp = null,
    mapper: /* item */ String => js.Array[String] | Null = null,
    mocksPattern: String = null,
    providesModuleNodeModules: js.Array[String] = null,
    resetCache: js.UndefOr[Boolean] = js.undefined,
    skipPackageJson: js.UndefOr[Boolean] = js.undefined,
    throwOnModuleCollision: js.UndefOr[Boolean] = js.undefined,
    useWatchman: js.UndefOr[Boolean] = js.undefined,
    watch: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(extensions = extensions, maxWorkers = maxWorkers, name = name, platforms = platforms, retainAllFiles = retainAllFiles, rootDir = rootDir, roots = roots)
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory)
    if (!js.isUndefined(computeDependencies)) __obj.updateDynamic("computeDependencies")(computeDependencies)
    if (!js.isUndefined(computeSha1)) __obj.updateDynamic("computeSha1")(computeSha1)
    if (console != null) __obj.updateDynamic("console")(console)
    if (dependencyExtractor != null) __obj.updateDynamic("dependencyExtractor")(dependencyExtractor)
    if (!js.isUndefined(forceNodeFilesystemAPI)) __obj.updateDynamic("forceNodeFilesystemAPI")(forceNodeFilesystemAPI)
    if (hasteImplModulePath != null) __obj.updateDynamic("hasteImplModulePath")(hasteImplModulePath)
    if (ignorePattern != null) __obj.updateDynamic("ignorePattern")(ignorePattern.asInstanceOf[js.Any])
    if (mapper != null) __obj.updateDynamic("mapper")(js.Any.fromFunction1(mapper))
    if (mocksPattern != null) __obj.updateDynamic("mocksPattern")(mocksPattern)
    if (providesModuleNodeModules != null) __obj.updateDynamic("providesModuleNodeModules")(providesModuleNodeModules)
    if (!js.isUndefined(resetCache)) __obj.updateDynamic("resetCache")(resetCache)
    if (!js.isUndefined(skipPackageJson)) __obj.updateDynamic("skipPackageJson")(skipPackageJson)
    if (!js.isUndefined(throwOnModuleCollision)) __obj.updateDynamic("throwOnModuleCollision")(throwOnModuleCollision)
    if (!js.isUndefined(useWatchman)) __obj.updateDynamic("useWatchman")(useWatchman)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[Options]
  }
}

