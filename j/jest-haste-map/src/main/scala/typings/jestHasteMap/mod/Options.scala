package typings.jestHasteMap.mod

import typings.jestHasteMap.typesMod.HasteRegExp
import typings.jestHasteMap.typesMod.Mapper
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
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], retainAllFiles = retainAllFiles.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any])
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(computeDependencies)) __obj.updateDynamic("computeDependencies")(computeDependencies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(computeSha1)) __obj.updateDynamic("computeSha1")(computeSha1.get.asInstanceOf[js.Any])
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (dependencyExtractor != null) __obj.updateDynamic("dependencyExtractor")(dependencyExtractor.asInstanceOf[js.Any])
    if (!js.isUndefined(forceNodeFilesystemAPI)) __obj.updateDynamic("forceNodeFilesystemAPI")(forceNodeFilesystemAPI.get.asInstanceOf[js.Any])
    if (hasteImplModulePath != null) __obj.updateDynamic("hasteImplModulePath")(hasteImplModulePath.asInstanceOf[js.Any])
    if (ignorePattern != null) __obj.updateDynamic("ignorePattern")(ignorePattern.asInstanceOf[js.Any])
    if (mapper != null) __obj.updateDynamic("mapper")(js.Any.fromFunction1(mapper))
    if (mocksPattern != null) __obj.updateDynamic("mocksPattern")(mocksPattern.asInstanceOf[js.Any])
    if (providesModuleNodeModules != null) __obj.updateDynamic("providesModuleNodeModules")(providesModuleNodeModules.asInstanceOf[js.Any])
    if (!js.isUndefined(resetCache)) __obj.updateDynamic("resetCache")(resetCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipPackageJson)) __obj.updateDynamic("skipPackageJson")(skipPackageJson.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnModuleCollision)) __obj.updateDynamic("throwOnModuleCollision")(throwOnModuleCollision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useWatchman)) __obj.updateDynamic("useWatchman")(useWatchman.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

