package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Source extends js.Object {
  var source: js.UndefOr[IgAppModule] = js.undefined
  var userIds: js.Array[Double | String]
}

object Anon_Source {
  @scala.inline
  def apply(userIds: js.Array[Double | String], source: IgAppModule = null): Anon_Source = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Source]
  }
}

