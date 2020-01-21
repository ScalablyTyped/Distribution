package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReviewsReplyResponse extends js.Object {
  var result: js.UndefOr[SchemaReviewReplyResult] = js.native
}

object SchemaReviewsReplyResponse {
  @scala.inline
  def apply(result: SchemaReviewReplyResult = null): SchemaReviewsReplyResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReviewsReplyResponse]
  }
}

