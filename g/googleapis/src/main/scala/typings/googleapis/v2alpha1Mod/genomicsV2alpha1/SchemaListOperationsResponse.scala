package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Operations.ListOperations.
  */
@js.native
trait SchemaListOperationsResponse extends js.Object {
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of operations that matches the specified filter in the request.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
}

object SchemaListOperationsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, operations: js.Array[SchemaOperation] = null): SchemaListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListOperationsResponse]
  }
}

