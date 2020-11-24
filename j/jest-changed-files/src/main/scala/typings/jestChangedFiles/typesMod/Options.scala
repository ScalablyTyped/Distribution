package typings.jestChangedFiles.typesMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var changedSince: js.UndefOr[String] = js.native
  
  var includePaths: js.UndefOr[js.Array[Path]] = js.native
  
  var lastCommit: js.UndefOr[Boolean] = js.native
  
  var withAncestor: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setChangedSince(value: String): Self = this.set("changedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedSince: Self = this.set("changedSince", js.undefined)
    
    @scala.inline
    def setIncludePathsVarargs(value: Path*): Self = this.set("includePaths", js.Array(value :_*))
    
    @scala.inline
    def setIncludePaths(value: js.Array[Path]): Self = this.set("includePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePaths: Self = this.set("includePaths", js.undefined)
    
    @scala.inline
    def setLastCommit(value: Boolean): Self = this.set("lastCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastCommit: Self = this.set("lastCommit", js.undefined)
    
    @scala.inline
    def setWithAncestor(value: Boolean): Self = this.set("withAncestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithAncestor: Self = this.set("withAncestor", js.undefined)
  }
}
