package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for an object.
  */
@js.native
trait SchemaObjectOptions extends js.Object {
  /**
    * Options that determine how the object is displayed in the Cloud Search
    * results page.
    */
  var displayOptions: js.UndefOr[SchemaObjectDisplayOptions] = js.native
  /**
    * The freshness options for an object.
    */
  var freshnessOptions: js.UndefOr[SchemaFreshnessOptions] = js.native
}

object SchemaObjectOptions {
  @scala.inline
  def apply(displayOptions: SchemaObjectDisplayOptions = null, freshnessOptions: SchemaFreshnessOptions = null): SchemaObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (freshnessOptions != null) __obj.updateDynamic("freshnessOptions")(freshnessOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObjectOptions]
  }
}

