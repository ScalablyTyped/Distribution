package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitbucketCloudRepoAssociation
  extends RepoAssociationBase
     with RepoAssociation {
  var id: java.lang.String
  var `type`: ionicLib.ionicLibStrings.bitbucket_cloud
}

object BitbucketCloudRepoAssociation {
  @scala.inline
  def apply(
    clone_url: java.lang.String,
    full_name: java.lang.String,
    html_url: java.lang.String,
    id: java.lang.String,
    `type`: ionicLib.ionicLibStrings.bitbucket_cloud
  ): BitbucketCloudRepoAssociation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("clone_url")(clone_url)
    __obj.updateDynamic("full_name")(full_name)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[BitbucketCloudRepoAssociation]
  }
}

