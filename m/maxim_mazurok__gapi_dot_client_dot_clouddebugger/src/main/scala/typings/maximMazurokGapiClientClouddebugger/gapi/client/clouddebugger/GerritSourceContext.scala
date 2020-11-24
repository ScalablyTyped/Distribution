package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GerritSourceContext extends js.Object {
  
  /** An alias, which may be a branch or tag. */
  var aliasContext: js.UndefOr[AliasContext] = js.native
  
  /** The name of an alias (branch, tag, etc.). */
  var aliasName: js.UndefOr[String] = js.native
  
  /** The full project name within the host. Projects may be nested, so "project/subproject" is a valid project name. The "repo name" is hostURI/project. */
  var gerritProject: js.UndefOr[String] = js.native
  
  /** The URI of a running Gerrit instance. */
  var hostUri: js.UndefOr[String] = js.native
  
  /** A revision (commit) ID. */
  var revisionId: js.UndefOr[String] = js.native
}
object GerritSourceContext {
  
  @scala.inline
  def apply(): GerritSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GerritSourceContext]
  }
  
  @scala.inline
  implicit class GerritSourceContextOps[Self <: GerritSourceContext] (val x: Self) extends AnyVal {
    
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
    def setGerritProject(value: String): Self = this.set("gerritProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGerritProject: Self = this.set("gerritProject", js.undefined)
    
    @scala.inline
    def setHostUri(value: String): Self = this.set("hostUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostUri: Self = this.set("hostUri", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
  }
}
