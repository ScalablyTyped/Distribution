package typings.instagramPrivateApi

import typings.instagramPrivateApi.graphqlRequestOptionsMod.InsightsFriendlyName
import typings.instagramPrivateApi.graphqlRequestOptionsMod.InsightsSurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFriendlyName extends js.Object {
  var friendlyName: InsightsFriendlyName
  var name: js.UndefOr[InsightsSurface] = js.undefined
}

object AnonFriendlyName {
  @scala.inline
  def apply(friendlyName: InsightsFriendlyName, name: InsightsSurface = null): AnonFriendlyName = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFriendlyName]
  }
}

