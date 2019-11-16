package typings.atKeystonejsListDashPlugins.atKeystonejsListDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtTrackingOptions extends TrackingOptions {
  var format: js.UndefOr[String] = js.undefined
}

object AtTrackingOptions {
  @scala.inline
  def apply(
    access: js.Any,
    createdAtField: String = null,
    format: String = null,
    updatedAtField: String = null
  ): AtTrackingOptions = {
    val __obj = js.Dynamic.literal(access = access)
    if (createdAtField != null) __obj.updateDynamic("createdAtField")(createdAtField)
    if (format != null) __obj.updateDynamic("format")(format)
    if (updatedAtField != null) __obj.updateDynamic("updatedAtField")(updatedAtField)
    __obj.asInstanceOf[AtTrackingOptions]
  }
}

