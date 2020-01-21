package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Empty response.
  */
@js.native
trait SchemaEmptyResponse extends js.Object {
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
}

object SchemaEmptyResponse {
  @scala.inline
  def apply(errors: SchemaErrors = null): SchemaEmptyResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEmptyResponse]
  }
}

