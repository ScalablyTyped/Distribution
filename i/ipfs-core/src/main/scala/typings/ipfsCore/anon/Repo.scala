package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.IPFSRepo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repo extends js.Object {
  
  var repo: IPFSRepo = js.native
}
object Repo {
  
  @scala.inline
  def apply(repo: IPFSRepo): Repo = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repo]
  }
  
  @scala.inline
  implicit class RepoOps[Self <: Repo] (val x: Self) extends AnyVal {
    
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
    def setRepo(value: IPFSRepo): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
