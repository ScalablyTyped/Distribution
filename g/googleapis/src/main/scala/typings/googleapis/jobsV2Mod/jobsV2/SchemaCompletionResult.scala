package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Resource that represents completion results.
  */
@js.native
trait SchemaCompletionResult extends js.Object {
  /**
    * The URL for the company logo if `type=COMPANY_NAME`.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The suggestion for the query.
    */
  var suggestion: js.UndefOr[String] = js.native
  /**
    * The completion topic.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCompletionResult {
  @scala.inline
  def apply(imageUrl: String = null, suggestion: String = null, `type`: String = null): SchemaCompletionResult = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompletionResult]
  }
}

