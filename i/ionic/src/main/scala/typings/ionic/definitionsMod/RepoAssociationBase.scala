package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoAssociationBase extends js.Object {
  var clone_url: String
  var full_name: String
  var html_url: String
}

object RepoAssociationBase {
  @scala.inline
  def apply(clone_url: String, full_name: String, html_url: String): RepoAssociationBase = {
    val __obj = js.Dynamic.literal(clone_url = clone_url, full_name = full_name, html_url = html_url)
  
    __obj.asInstanceOf[RepoAssociationBase]
  }
}

