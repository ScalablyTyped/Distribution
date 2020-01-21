package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.Write.  The first request creates a stream, or
  * resumes an existing one from a token.  When creating a new stream, the
  * server replies with a response containing only an ID and a token, to use in
  * the next request.  When resuming a stream, the server first streams any
  * responses later than the given token, then a response containing only an
  * up-to-date token, to use in the next request.
  */
@js.native
trait SchemaWriteRequest extends js.Object {
  /**
    * Labels associated with this write request.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The ID of the write stream to resume. This may only be set in the first
    * message. When left empty, a new write stream will be created.
    */
  var streamId: js.UndefOr[String] = js.native
  /**
    * A stream token that was previously sent by the server.  The client should
    * set this field to the token from the most recent WriteResponse it has
    * received. This acknowledges that the client has received responses up to
    * this token. After sending this token, earlier tokens may not be used
    * anymore.  The server may close the stream if there are too many
    * unacknowledged responses.  Leave this field unset when creating a new
    * stream. To resume a stream at a specific point, set this field and the
    * `stream_id` field.  Leave this field unset when creating a new stream.
    */
  var streamToken: js.UndefOr[String] = js.native
  /**
    * The writes to apply.  Always executed atomically and in order. This must
    * be empty on the first request. This may be empty on the last request.
    * This must not be empty on all other requests.
    */
  var writes: js.UndefOr[js.Array[SchemaWrite]] = js.native
}

object SchemaWriteRequest {
  @scala.inline
  def apply(
    labels: StringDictionary[String] = null,
    streamId: String = null,
    streamToken: String = null,
    writes: js.Array[SchemaWrite] = null
  ): SchemaWriteRequest = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamToken != null) __obj.updateDynamic("streamToken")(streamToken.asInstanceOf[js.Any])
    if (writes != null) __obj.updateDynamic("writes")(writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWriteRequest]
  }
}

