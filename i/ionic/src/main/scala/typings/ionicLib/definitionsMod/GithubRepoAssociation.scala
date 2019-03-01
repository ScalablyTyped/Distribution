package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GithubRepoAssociation
  extends RepoAssociationBase
     with RepoAssociation {
  var id: scala.Double
  var `type`: ionicLib.ionicLibStrings.github
}

object GithubRepoAssociation {
  @scala.inline
  def apply(
    clone_url: java.lang.String,
    full_name: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    `type`: ionicLib.ionicLibStrings.github
  ): GithubRepoAssociation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("clone_url")(clone_url)
    __obj.updateDynamic("full_name")(full_name)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GithubRepoAssociation]
  }
}

