package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.bitbucket_cloud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitbucketCloudRepoAssociation
  extends RepoAssociationBase
     with RepoAssociation {
  
  var id: String = js.native
  
  var `type`: bitbucket_cloud = js.native
}
object BitbucketCloudRepoAssociation {
  
  @scala.inline
  def apply(clone_url: String, full_name: String, html_url: String, id: String, `type`: bitbucket_cloud): BitbucketCloudRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitbucketCloudRepoAssociation]
  }
  
  @scala.inline
  implicit class BitbucketCloudRepoAssociationMutableBuilder[Self <: BitbucketCloudRepoAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bitbucket_cloud): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
