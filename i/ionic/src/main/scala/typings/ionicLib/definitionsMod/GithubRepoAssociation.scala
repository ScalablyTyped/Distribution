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
    val __obj = js.Dynamic.literal(clone_url = clone_url, full_name = full_name, html_url = html_url, id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GithubRepoAssociation]
  }
}

