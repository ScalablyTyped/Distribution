package typings.jestResolve.mod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindNodeModuleConfig extends js.Object {
  
  var basedir: Path = js.native
  
  var browser: js.UndefOr[Boolean] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  var moduleDirectory: js.UndefOr[js.Array[String]] = js.native
  
  var paths: js.UndefOr[js.Array[Path]] = js.native
  
  var resolver: js.UndefOr[Path | Null] = js.native
  
  var rootDir: js.UndefOr[Path] = js.native
  
  var throwIfNotFound: js.UndefOr[Boolean] = js.native
}
object FindNodeModuleConfig {
  
  @scala.inline
  def apply(basedir: Path): FindNodeModuleConfig = {
    val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindNodeModuleConfig]
  }
  
  @scala.inline
  implicit class FindNodeModuleConfigOps[Self <: FindNodeModuleConfig] (val x: Self) extends AnyVal {
    
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
    def setBasedir(value: Path): Self = this.set("basedir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: Boolean): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setModuleDirectoryVarargs(value: String*): Self = this.set("moduleDirectory", js.Array(value :_*))
    
    @scala.inline
    def setModuleDirectory(value: js.Array[String]): Self = this.set("moduleDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleDirectory: Self = this.set("moduleDirectory", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: Path*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[Path]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setResolver(value: Path): Self = this.set("resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    
    @scala.inline
    def setResolverNull: Self = this.set("resolver", null)
    
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDir: Self = this.set("rootDir", js.undefined)
    
    @scala.inline
    def setThrowIfNotFound(value: Boolean): Self = this.set("throwIfNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowIfNotFound: Self = this.set("throwIfNotFound", js.undefined)
  }
}
