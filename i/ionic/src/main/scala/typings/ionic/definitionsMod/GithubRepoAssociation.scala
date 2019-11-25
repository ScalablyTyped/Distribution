package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.github
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GithubRepoAssociation
  extends RepoAssociationBase
     with RepoAssociation {
  var id: Double
  var `type`: github
}

object GithubRepoAssociation {
  @scala.inline
  def apply(clone_url: String, full_name: String, html_url: String, id: Double, `type`: github): GithubRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubRepoAssociation]
  }
}

