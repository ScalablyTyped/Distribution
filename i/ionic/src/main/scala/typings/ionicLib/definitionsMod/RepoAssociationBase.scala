package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoAssociationBase extends js.Object {
  var clone_url: java.lang.String
  var full_name: java.lang.String
  var html_url: java.lang.String
}

object RepoAssociationBase {
  @scala.inline
  def apply(clone_url: java.lang.String, full_name: java.lang.String, html_url: java.lang.String): RepoAssociationBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone_url")(clone_url)
    __obj.updateDynamic("full_name")(full_name)
    __obj.updateDynamic("html_url")(html_url)
    __obj.asInstanceOf[RepoAssociationBase]
  }
}

