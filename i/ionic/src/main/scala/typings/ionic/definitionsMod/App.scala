package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var association: js.UndefOr[Null | AppAssociation] = js.undefined
  var id: String
  var name: String
  var org: Null | Org
  var repo_url: js.UndefOr[String] = js.undefined
  var slug: String
}

object App {
  @scala.inline
  def apply(
    id: String,
    name: String,
    slug: String,
    association: AppAssociation = null,
    org: Org = null,
    repo_url: String = null
  ): App = {
    val __obj = js.Dynamic.literal(id = id, name = name, slug = slug)
    if (association != null) __obj.updateDynamic("association")(association)
    if (org != null) __obj.updateDynamic("org")(org)
    if (repo_url != null) __obj.updateDynamic("repo_url")(repo_url)
    __obj.asInstanceOf[App]
  }
}

