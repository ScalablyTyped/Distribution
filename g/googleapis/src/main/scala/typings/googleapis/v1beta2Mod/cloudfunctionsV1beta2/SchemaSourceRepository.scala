package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the location of the function source in a remote repository.
  */
@js.native
trait SchemaSourceRepository extends js.Object {
  
  /**
    * The name of the branch from which the function should be fetched.
    */
  var branch: js.UndefOr[String] = js.native
  
  /**
    * Output only. The id of the revision that was resolved at the moment of
    * function creation or update. For example when a user deployed from a
    * branch, it will be the revision id of the latest change on this branch at
    * that time. If user deployed from revision then this value will be always
    * equal to the revision specified by the user.
    */
  var deployedRevision: js.UndefOr[String] = js.native
  
  /**
    * URL to the hosted repository where the function is defined. Only paths in
    * https://source.developers.google.com domain are supported. The path
    * should contain the name of the repository.
    */
  var repositoryUrl: js.UndefOr[String] = js.native
  
  /**
    * The id of the revision that captures the state of the repository from
    * which the function should be fetched.
    */
  var revision: js.UndefOr[String] = js.native
  
  /**
    * The path within the repository where the function is defined. The path
    * should point to the directory where Cloud Functions files are located.
    * Use &quot;/&quot; if the function is defined directly in the root
    * directory of a repository.
    */
  var sourcePath: js.UndefOr[String] = js.native
  
  /**
    * The name of the tag that captures the state of the repository from which
    * the function should be fetched.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaSourceRepository {
  
  @scala.inline
  def apply(): SchemaSourceRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceRepository]
  }
  
  @scala.inline
  implicit class SchemaSourceRepositoryOps[Self <: SchemaSourceRepository] (val x: Self) extends AnyVal {
    
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
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    
    @scala.inline
    def setDeployedRevision(value: String): Self = this.set("deployedRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployedRevision: Self = this.set("deployedRevision", js.undefined)
    
    @scala.inline
    def setRepositoryUrl(value: String): Self = this.set("repositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryUrl: Self = this.set("repositoryUrl", js.undefined)
    
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    
    @scala.inline
    def setSourcePath(value: String): Self = this.set("sourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePath: Self = this.set("sourcePath", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
