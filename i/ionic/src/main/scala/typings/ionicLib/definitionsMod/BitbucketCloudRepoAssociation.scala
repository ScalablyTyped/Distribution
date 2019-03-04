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
    val __obj = js.Dynamic.literal(clone_url = clone_url, full_name = full_name, html_url = html_url, id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BitbucketCloudRepoAssociation]
  }
}

