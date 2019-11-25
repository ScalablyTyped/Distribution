package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.bitbucket_server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitbucketServerRepoAssociation
  extends RepoAssociationBase
     with RepoAssociation {
  var id: Double
  var `type`: bitbucket_server
}

object BitbucketServerRepoAssociation {
  @scala.inline
  def apply(clone_url: String, full_name: String, html_url: String, id: Double, `type`: bitbucket_server): BitbucketServerRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitbucketServerRepoAssociation]
  }
}

