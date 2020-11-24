package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudRepoSourceContext extends js.Object {
  
  /** An alias, which may be a branch or tag. */
  var aliasContext: js.UndefOr[AliasContext] = js.native
  
  /** The name of an alias (branch, tag, etc.). */
  var aliasName: js.UndefOr[String] = js.native
  
  /** The ID of the repo. */
  var repoId: js.UndefOr[RepoId] = js.native
  
  /** A revision ID. */
  var revisionId: js.UndefOr[String] = js.native
}
object CloudRepoSourceContext {
  
  @scala.inline
  def apply(): CloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudRepoSourceContext]
  }
  
  @scala.inline
  implicit class CloudRepoSourceContextOps[Self <: CloudRepoSourceContext] (val x: Self) extends AnyVal {
    
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
    def setAliasContext(value: AliasContext): Self = this.set("aliasContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasContext: Self = this.set("aliasContext", js.undefined)
    
    @scala.inline
    def setAliasName(value: String): Self = this.set("aliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasName: Self = this.set("aliasName", js.undefined)
    
    @scala.inline
    def setRepoId(value: RepoId): Self = this.set("repoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoId: Self = this.set("repoId", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
  }
}
