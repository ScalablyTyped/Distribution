package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SourceContext referring to a Gerrit project.
  */
@js.native
trait SchemaGerritSourceContext extends js.Object {
  
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaAliasContext] = js.native
  
  /**
    * The full project name within the host. Projects may be nested, so
    * &quot;project/subproject&quot; is a valid project name. The &quot;repo
    * name&quot; is the hostURI/project.
    */
  var gerritProject: js.UndefOr[String] = js.native
  
  /**
    * The URI of a running Gerrit instance.
    */
  var hostUri: js.UndefOr[String] = js.native
  
  /**
    * A revision (commit) ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}
object SchemaGerritSourceContext {
  
  @scala.inline
  def apply(): SchemaGerritSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGerritSourceContext]
  }
  
  @scala.inline
  implicit class SchemaGerritSourceContextOps[Self <: SchemaGerritSourceContext] (val x: Self) extends AnyVal {
    
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
    def setAliasContext(value: SchemaAliasContext): Self = this.set("aliasContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasContext: Self = this.set("aliasContext", js.undefined)
    
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
