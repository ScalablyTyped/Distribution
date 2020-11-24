package typings.jestResolve.nodeModulesPathsMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeModulesPathsOptions extends js.Object {
  
  var moduleDirectory: js.UndefOr[js.Array[String]] = js.native
  
  var paths: js.UndefOr[js.Array[Path]] = js.native
}
object NodeModulesPathsOptions {
  
  @scala.inline
  def apply(): NodeModulesPathsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeModulesPathsOptions]
  }
  
  @scala.inline
  implicit class NodeModulesPathsOptionsOps[Self <: NodeModulesPathsOptions] (val x: Self) extends AnyVal {
    
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
  }
}
