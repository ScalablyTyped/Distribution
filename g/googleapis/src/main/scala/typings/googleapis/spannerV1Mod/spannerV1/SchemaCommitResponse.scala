package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Commit.
  */
@js.native
trait SchemaCommitResponse extends js.Object {
  /**
    * The Cloud Spanner timestamp at which the transaction committed.
    */
  var commitTimestamp: js.UndefOr[String] = js.native
}

object SchemaCommitResponse {
  @scala.inline
  def apply(commitTimestamp: String = null): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTimestamp != null) __obj.updateDynamic("commitTimestamp")(commitTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommitResponse]
  }
}

