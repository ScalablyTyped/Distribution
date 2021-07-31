package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the location of the function source in a remote repository.
  */
trait SchemaSourceRepository extends StObject {
  
  /**
    * The name of the branch from which the function should be fetched.
    */
  var branch: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The id of the revision that was resolved at the moment of
    * function creation or update. For example when a user deployed from a
    * branch, it will be the revision id of the latest change on this branch at
    * that time. If user deployed from revision then this value will be always
    * equal to the revision specified by the user.
    */
  var deployedRevision: js.UndefOr[String] = js.undefined
  
  /**
    * URL to the hosted repository where the function is defined. Only paths in
    * https://source.developers.google.com domain are supported. The path
    * should contain the name of the repository.
    */
  var repositoryUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the revision that captures the state of the repository from
    * which the function should be fetched.
    */
  var revision: js.UndefOr[String] = js.undefined
  
  /**
    * The path within the repository where the function is defined. The path
    * should point to the directory where Cloud Functions files are located.
    * Use &quot;/&quot; if the function is defined directly in the root
    * directory of a repository.
    */
  var sourcePath: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the tag that captures the state of the repository from which
    * the function should be fetched.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object SchemaSourceRepository {
  
  @scala.inline
  def apply(): SchemaSourceRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceRepository]
  }
  
  @scala.inline
  implicit class SchemaSourceRepositoryMutableBuilder[Self <: SchemaSourceRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    @scala.inline
    def setDeployedRevision(value: String): Self = StObject.set(x, "deployedRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedRevisionUndefined: Self = StObject.set(x, "deployedRevision", js.undefined)
    
    @scala.inline
    def setRepositoryUrl(value: String): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUrlUndefined: Self = StObject.set(x, "repositoryUrl", js.undefined)
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    @scala.inline
    def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
