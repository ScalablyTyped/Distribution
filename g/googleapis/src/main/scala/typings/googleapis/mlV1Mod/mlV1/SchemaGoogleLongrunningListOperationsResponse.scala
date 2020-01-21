package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Operations.ListOperations.
  */
@js.native
trait SchemaGoogleLongrunningListOperationsResponse extends js.Object {
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of operations that matches the specified filter in the request.
    */
  var operations: js.UndefOr[js.Array[SchemaGoogleLongrunningOperation]] = js.native
}

object SchemaGoogleLongrunningListOperationsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, operations: js.Array[SchemaGoogleLongrunningOperation] = null): SchemaGoogleLongrunningListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleLongrunningListOperationsResponse]
  }
}

