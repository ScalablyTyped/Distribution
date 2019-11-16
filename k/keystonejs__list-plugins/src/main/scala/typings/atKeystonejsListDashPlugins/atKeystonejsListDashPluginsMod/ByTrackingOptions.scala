package typings.atKeystonejsListDashPlugins.atKeystonejsListDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByTrackingOptions extends TrackingOptions {
  var ref: js.UndefOr[String] = js.undefined
}

object ByTrackingOptions {
  @scala.inline
  def apply(access: js.Any, createdAtField: String = null, ref: String = null, updatedAtField: String = null): ByTrackingOptions = {
    val __obj = js.Dynamic.literal(access = access)
    if (createdAtField != null) __obj.updateDynamic("createdAtField")(createdAtField)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (updatedAtField != null) __obj.updateDynamic("updatedAtField")(updatedAtField)
    __obj.asInstanceOf[ByTrackingOptions]
  }
}

