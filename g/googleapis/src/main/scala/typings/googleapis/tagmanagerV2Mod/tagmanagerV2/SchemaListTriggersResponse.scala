package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List triggers response.
  */
@js.native
trait SchemaListTriggersResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All GTM Triggers of a GTM Container.
    */
  var trigger: js.UndefOr[js.Array[SchemaTrigger]] = js.native
}

object SchemaListTriggersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, trigger: js.Array[SchemaTrigger] = null): SchemaListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTriggersResponse]
  }
}

