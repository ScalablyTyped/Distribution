package typings.atKeystonejsListDashPlugins.atKeystonejsListDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingOptions extends js.Object {
  var access: js.Any
  var createdAtField: js.UndefOr[String] = js.undefined
   // TODO: insert fields here
  var updatedAtField: js.UndefOr[String] = js.undefined
}

object TrackingOptions {
  @scala.inline
  def apply(access: js.Any, createdAtField: String = null, updatedAtField: String = null): TrackingOptions = {
    val __obj = js.Dynamic.literal(access = access)
    if (createdAtField != null) __obj.updateDynamic("createdAtField")(createdAtField)
    if (updatedAtField != null) __obj.updateDynamic("updatedAtField")(updatedAtField)
    __obj.asInstanceOf[TrackingOptions]
  }
}

