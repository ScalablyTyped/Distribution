package typings.koaDashDocs

import typings.koaDashJoiDashRouter.koaDashJoiDashRouterMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var extendedDescription: js.UndefOr[String] = js.undefined
  var groupName: String
  var prefix: js.UndefOr[String] = js.undefined
  var routes: js.Array[Spec]
}

object Anon_Description {
  @scala.inline
  def apply(
    groupName: String,
    routes: js.Array[Spec],
    description: String = null,
    extendedDescription: String = null,
    prefix: String = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal(groupName = groupName, routes = routes)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extendedDescription != null) __obj.updateDynamic("extendedDescription")(extendedDescription)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_Description]
  }
}

