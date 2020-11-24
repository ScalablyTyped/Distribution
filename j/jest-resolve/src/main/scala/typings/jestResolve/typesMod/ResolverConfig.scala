package typings.jestResolve.typesMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverConfig extends js.Object {
  
  var defaultPlatform: js.UndefOr[String | Null] = js.native
  
  var extensions: js.Array[String] = js.native
  
  var hasCoreModules: Boolean = js.native
  
  var moduleDirectories: js.Array[String] = js.native
  
  var moduleNameMapper: js.UndefOr[js.Array[ModuleNameMapperConfig] | Null] = js.native
  
  var modulePaths: js.UndefOr[js.Array[Path]] = js.native
  
  var platforms: js.UndefOr[js.Array[String]] = js.native
  
  var resolver: js.UndefOr[Path | Null] = js.native
  
  var rootDir: Path = js.native
}
object ResolverConfig {
  
  @scala.inline
  def apply(
    extensions: js.Array[String],
    hasCoreModules: Boolean,
    moduleDirectories: js.Array[String],
    rootDir: Path
  ): ResolverConfig = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], hasCoreModules = hasCoreModules.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverConfig]
  }
  
  @scala.inline
  implicit class ResolverConfigOps[Self <: ResolverConfig] (val x: Self) extends AnyVal {
    
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
    def setHasCoreModules(value: Boolean): Self = this.set("hasCoreModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleDirectoriesVarargs(value: String*): Self = this.set("moduleDirectories", js.Array(value :_*))
    
    @scala.inline
    def setModuleDirectories(value: js.Array[String]): Self = this.set("moduleDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPlatform(value: String): Self = this.set("defaultPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPlatform: Self = this.set("defaultPlatform", js.undefined)
    
    @scala.inline
    def setDefaultPlatformNull: Self = this.set("defaultPlatform", null)
    
    @scala.inline
    def setModuleNameMapperVarargs(value: ModuleNameMapperConfig*): Self = this.set("moduleNameMapper", js.Array(value :_*))
    
    @scala.inline
    def setModuleNameMapper(value: js.Array[ModuleNameMapperConfig]): Self = this.set("moduleNameMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleNameMapper: Self = this.set("moduleNameMapper", js.undefined)
    
    @scala.inline
    def setModuleNameMapperNull: Self = this.set("moduleNameMapper", null)
    
    @scala.inline
    def setModulePathsVarargs(value: Path*): Self = this.set("modulePaths", js.Array(value :_*))
    
    @scala.inline
    def setModulePaths(value: js.Array[Path]): Self = this.set("modulePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulePaths: Self = this.set("modulePaths", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: String*): Self = this.set("platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
    
    @scala.inline
    def setResolver(value: Path): Self = this.set("resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    
    @scala.inline
    def setResolverNull: Self = this.set("resolver", null)
  }
}
