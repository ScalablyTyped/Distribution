package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.Write.
  */
@js.native
trait SchemaWriteResponse extends js.Object {
  /**
    * The time at which the commit occurred.
    */
  var commitTime: js.UndefOr[String] = js.native
  /**
    * The ID of the stream. Only set on the first message, when a new stream
    * was created.
    */
  var streamId: js.UndefOr[String] = js.native
  /**
    * A token that represents the position of this response in the stream. This
    * can be used by a client to resume the stream at this point.  This field
    * is always set.
    */
  var streamToken: js.UndefOr[String] = js.native
  /**
    * The result of applying the writes.  This i-th write result corresponds to
    * the i-th write in the request.
    */
  var writeResults: js.UndefOr[js.Array[SchemaWriteResult]] = js.native
}

object SchemaWriteResponse {
  @scala.inline
  def apply(
    commitTime: String = null,
    streamId: String = null,
    streamToken: String = null,
    writeResults: js.Array[SchemaWriteResult] = null
  ): SchemaWriteResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTime != null) __obj.updateDynamic("commitTime")(commitTime.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamToken != null) __obj.updateDynamic("streamToken")(streamToken.asInstanceOf[js.Any])
    if (writeResults != null) __obj.updateDynamic("writeResults")(writeResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWriteResponse]
  }
}

