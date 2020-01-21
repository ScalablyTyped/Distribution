package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends js.Object {
  var source: js.UndefOr[IgAppModule] = js.undefined
  var userIds: js.Array[Double | String]
}

object AnonSource {
  @scala.inline
  def apply(userIds: js.Array[Double | String], source: IgAppModule = null): AnonSource = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSource]
  }
}

