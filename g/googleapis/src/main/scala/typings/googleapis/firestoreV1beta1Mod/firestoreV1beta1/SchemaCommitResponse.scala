package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.Commit.
  */
@js.native
trait SchemaCommitResponse extends js.Object {
  /**
    * The time at which the commit occurred.
    */
  var commitTime: js.UndefOr[String] = js.native
  /**
    * The result of applying the writes.  This i-th write result corresponds to
    * the i-th write in the request.
    */
  var writeResults: js.UndefOr[js.Array[SchemaWriteResult]] = js.native
}

object SchemaCommitResponse {
  @scala.inline
  def apply(commitTime: String = null, writeResults: js.Array[SchemaWriteResult] = null): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTime != null) __obj.updateDynamic("commitTime")(commitTime.asInstanceOf[js.Any])
    if (writeResults != null) __obj.updateDynamic("writeResults")(writeResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommitResponse]
  }
}

