package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
  * Source Repo.
  */
@js.native
trait SchemaCloudRepoSourceContext extends js.Object {
  
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaAliasContext] = js.native
  
  /**
    * The ID of the repo.
    */
  var repoId: js.UndefOr[SchemaRepoId] = js.native
  
  /**
    * A revision ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}
object SchemaCloudRepoSourceContext {
  
  @scala.inline
  def apply(): SchemaCloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudRepoSourceContext]
  }
  
  @scala.inline
  implicit class SchemaCloudRepoSourceContextOps[Self <: SchemaCloudRepoSourceContext] (val x: Self) extends AnyVal {
    
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
    def setRepoId(value: SchemaRepoId): Self = this.set("repoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoId: Self = this.set("repoId", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
  }
}
