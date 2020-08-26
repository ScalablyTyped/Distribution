package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.bitbucket_cloud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class BitbucketCloudRepoAssociationOps[Self <: BitbucketCloudRepoAssociation] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: bitbucket_cloud): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

