package typings.koaDocs

import typings.koaJoiRouter.mod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var extendedDescription: js.UndefOr[String] = js.undefined
  var groupName: String
  var prefix: js.UndefOr[String] = js.undefined
  var routes: js.Array[Spec]
}

object AnonDescription {
  @scala.inline
  def apply(
    groupName: String,
    routes: js.Array[Spec],
    description: String = null,
    extendedDescription: String = null,
    prefix: String = null
  ): AnonDescription = {
    val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extendedDescription != null) __obj.updateDynamic("extendedDescription")(extendedDescription.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

