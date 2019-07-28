package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.bitbucket_cloud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitbucketCloudRepoAssociation
  extends RepoAssociationBase
     with RepoAssociation {
  var id: String
  var `type`: bitbucket_cloud
}

object BitbucketCloudRepoAssociation {
  @scala.inline
  def apply(clone_url: String, full_name: String, html_url: String, id: String, `type`: bitbucket_cloud): BitbucketCloudRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url, full_name = full_name, html_url = html_url, id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BitbucketCloudRepoAssociation]
  }
}

