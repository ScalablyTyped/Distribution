package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List triggers response.
  */
@js.native
trait SchemaListTriggersResponse extends js.Object {
  /**
    * All GTM Triggers of a GTM Container.
    */
  var triggers: js.UndefOr[js.Array[SchemaTrigger]] = js.native
}

object SchemaListTriggersResponse {
  @scala.inline
  def apply(triggers: js.Array[SchemaTrigger] = null): SchemaListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTriggersResponse]
  }
}

