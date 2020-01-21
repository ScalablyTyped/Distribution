package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Variables Response.
  */
@js.native
trait SchemaListVariablesResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All GTM Variables of a GTM Container.
    */
  var variable: js.UndefOr[js.Array[SchemaVariable]] = js.native
}

object SchemaListVariablesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, variable: js.Array[SchemaVariable] = null): SchemaListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListVariablesResponse]
  }
}

