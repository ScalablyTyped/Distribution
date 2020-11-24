package typings.jestChangedFiles.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedFiles extends js.Object {
  
  var changedFiles: Paths = js.native
  
  var repos: Repos = js.native
}
object ChangedFiles {
  
  @scala.inline
  def apply(changedFiles: Paths, repos: Repos): ChangedFiles = {
    val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedFiles]
  }
  
  @scala.inline
  implicit class ChangedFilesOps[Self <: ChangedFiles] (val x: Self) extends AnyVal {
    
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
    def setChangedFiles(value: Paths): Self = this.set("changedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepos(value: Repos): Self = this.set("repos", value.asInstanceOf[js.Any])
  }
}
