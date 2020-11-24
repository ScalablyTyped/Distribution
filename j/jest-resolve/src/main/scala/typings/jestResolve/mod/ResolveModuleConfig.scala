package typings.jestResolve.mod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveModuleConfig extends js.Object {
  
  var paths: js.UndefOr[js.Array[Path]] = js.native
  
  var skipNodeResolution: js.UndefOr[Boolean] = js.native
}
object ResolveModuleConfig {
  
  @scala.inline
  def apply(): ResolveModuleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveModuleConfig]
  }
  
  @scala.inline
  implicit class ResolveModuleConfigOps[Self <: ResolveModuleConfig] (val x: Self) extends AnyVal {
    
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
    def setPathsVarargs(value: Path*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[Path]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setSkipNodeResolution(value: Boolean): Self = this.set("skipNodeResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipNodeResolution: Self = this.set("skipNodeResolution", js.undefined)
  }
}
