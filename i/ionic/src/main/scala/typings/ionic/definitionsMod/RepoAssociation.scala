package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.GithubRepoAssociation
  - typings.ionic.definitionsMod.BitbucketCloudRepoAssociation
  - typings.ionic.definitionsMod.BitbucketServerRepoAssociation
*/
trait RepoAssociation extends StObject
object RepoAssociation {
  
  @scala.inline
  def BitbucketCloudRepoAssociation(clone_url: String, full_name: String, html_url: String, id: String): typings.ionic.definitionsMod.BitbucketCloudRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bitbucket_cloud")
    __obj.asInstanceOf[typings.ionic.definitionsMod.BitbucketCloudRepoAssociation]
  }
  
  @scala.inline
  def BitbucketServerRepoAssociation(clone_url: String, full_name: String, html_url: String, id: Double): typings.ionic.definitionsMod.BitbucketServerRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bitbucket_server")
    __obj.asInstanceOf[typings.ionic.definitionsMod.BitbucketServerRepoAssociation]
  }
  
  @scala.inline
  def GithubRepoAssociation(clone_url: String, full_name: String, html_url: String, id: Double): typings.ionic.definitionsMod.GithubRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("github")
    __obj.asInstanceOf[typings.ionic.definitionsMod.GithubRepoAssociation]
  }
}
