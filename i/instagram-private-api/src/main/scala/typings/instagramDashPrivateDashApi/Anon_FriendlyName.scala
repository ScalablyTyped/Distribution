package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distTypesGraphqlDashRequestDotOptionsMod.InsightsFriendlyName
import typings.instagramDashPrivateDashApi.distTypesGraphqlDashRequestDotOptionsMod.InsightsSurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FriendlyName extends js.Object {
  var friendlyName: InsightsFriendlyName
  var name: js.UndefOr[InsightsSurface] = js.undefined
}

object Anon_FriendlyName {
  @scala.inline
  def apply(friendlyName: InsightsFriendlyName, name: InsightsSurface = null): Anon_FriendlyName = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FriendlyName]
  }
}

