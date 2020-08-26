package typings.jestHasteMap.mod

import typings.jestHasteMap.typesMod.HasteRegExp
import typings.jestHasteMap.typesMod.Mapper
import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.native
  var computeDependencies: js.UndefOr[Boolean] = js.native
  var computeSha1: js.UndefOr[Boolean] = js.native
  var console: js.UndefOr[Console] = js.native
  var dependencyExtractor: js.UndefOr[String] = js.native
  var extensions: js.Array[String] = js.native
  var forceNodeFilesystemAPI: js.UndefOr[Boolean] = js.native
  var hasteImplModulePath: js.UndefOr[String] = js.native
  var ignorePattern: js.UndefOr[HasteRegExp] = js.native
  var mapper: js.UndefOr[Mapper] = js.native
  var maxWorkers: Double = js.native
  var mocksPattern: js.UndefOr[String] = js.native
  var name: String = js.native
  var platforms: js.Array[String] = js.native
  var providesModuleNodeModules: js.UndefOr[js.Array[String]] = js.native
  var resetCache: js.UndefOr[Boolean] = js.native
  var retainAllFiles: Boolean = js.native
  var rootDir: String = js.native
  var roots: js.Array[String] = js.native
  var skipPackageJson: js.UndefOr[Boolean] = js.native
  var throwOnModuleCollision: js.UndefOr[Boolean] = js.native
  var useWatchman: js.UndefOr[Boolean] = js.native
  var watch: js.UndefOr[Boolean] = js.native
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
    roots: js.Array[String]
  ): Options = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], retainAllFiles = retainAllFiles.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWorkers(value: Double): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformsVarargs(value: String*): Self = this.set("platforms", js.Array(value :_*))
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetainAllFiles(value: Boolean): Self = this.set("retainAllFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDir(value: String): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootsVarargs(value: String*): Self = this.set("roots", js.Array(value :_*))
    @scala.inline
    def setRoots(value: js.Array[String]): Self = this.set("roots", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheDirectory(value: String): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheDirectory: Self = this.set("cacheDirectory", js.undefined)
    @scala.inline
    def setComputeDependencies(value: Boolean): Self = this.set("computeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeDependencies: Self = this.set("computeDependencies", js.undefined)
    @scala.inline
    def setComputeSha1(value: Boolean): Self = this.set("computeSha1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeSha1: Self = this.set("computeSha1", js.undefined)
    @scala.inline
    def setConsole(value: Console): Self = this.set("console", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    @scala.inline
    def setDependencyExtractor(value: String): Self = this.set("dependencyExtractor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencyExtractor: Self = this.set("dependencyExtractor", js.undefined)
    @scala.inline
    def setForceNodeFilesystemAPI(value: Boolean): Self = this.set("forceNodeFilesystemAPI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceNodeFilesystemAPI: Self = this.set("forceNodeFilesystemAPI", js.undefined)
    @scala.inline
    def setHasteImplModulePath(value: String): Self = this.set("hasteImplModulePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasteImplModulePath: Self = this.set("hasteImplModulePath", js.undefined)
    @scala.inline
    def setIgnorePatternFunction1(value: /* str */ String => Boolean): Self = this.set("ignorePattern", js.Any.fromFunction1(value))
    @scala.inline
    def setIgnorePattern(value: HasteRegExp): Self = this.set("ignorePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePattern: Self = this.set("ignorePattern", js.undefined)
    @scala.inline
    def setMapper(value: /* item */ String => js.Array[String] | Null): Self = this.set("mapper", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapper: Self = this.set("mapper", js.undefined)
    @scala.inline
    def setMocksPattern(value: String): Self = this.set("mocksPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMocksPattern: Self = this.set("mocksPattern", js.undefined)
    @scala.inline
    def setProvidesModuleNodeModulesVarargs(value: String*): Self = this.set("providesModuleNodeModules", js.Array(value :_*))
    @scala.inline
    def setProvidesModuleNodeModules(value: js.Array[String]): Self = this.set("providesModuleNodeModules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvidesModuleNodeModules: Self = this.set("providesModuleNodeModules", js.undefined)
    @scala.inline
    def setResetCache(value: Boolean): Self = this.set("resetCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetCache: Self = this.set("resetCache", js.undefined)
    @scala.inline
    def setSkipPackageJson(value: Boolean): Self = this.set("skipPackageJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipPackageJson: Self = this.set("skipPackageJson", js.undefined)
    @scala.inline
    def setThrowOnModuleCollision(value: Boolean): Self = this.set("throwOnModuleCollision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnModuleCollision: Self = this.set("throwOnModuleCollision", js.undefined)
    @scala.inline
    def setUseWatchman(value: Boolean): Self = this.set("useWatchman", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseWatchman: Self = this.set("useWatchman", js.undefined)
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
  
}

