package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var association: js.UndefOr[scala.Null | AppAssociation] = js.undefined
  var id: java.lang.String
  var name: java.lang.String
  var org: scala.Null | Org
  var repo_url: js.UndefOr[java.lang.String] = js.undefined
  var slug: java.lang.String
}

object App {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    slug: java.lang.String,
    association: AppAssociation = null,
    org: Org = null,
    repo_url: java.lang.String = null
  ): App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("slug")(slug)
    if (association != null) __obj.updateDynamic("association")(association)
    if (org != null) __obj.updateDynamic("org")(org)
    if (repo_url != null) __obj.updateDynamic("repo_url")(repo_url)
    __obj.asInstanceOf[App]
  }
}

