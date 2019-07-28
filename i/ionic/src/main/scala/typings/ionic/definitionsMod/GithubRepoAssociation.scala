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
    val __obj = js.Dynamic.literal(clone_url = clone_url, full_name = full_name, html_url = html_url, id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GithubRepoAssociation]
  }
}

