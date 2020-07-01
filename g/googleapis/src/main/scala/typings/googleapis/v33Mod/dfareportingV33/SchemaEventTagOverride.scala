package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event tag override information.
  */
@js.native
trait SchemaEventTagOverride extends js.Object {
  /**
    * Whether this override is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * ID of this event tag override. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaEventTagOverride {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, id: String = null): SchemaEventTagOverride = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventTagOverride]
  }
}

