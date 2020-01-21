package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Order document List Response
  */
@js.native
trait SchemaOrderDocumentsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#orderDocumentsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Order document collection
    */
  var orderDocuments: js.UndefOr[js.Array[SchemaOrderDocument]] = js.native
}

object SchemaOrderDocumentsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    orderDocuments: js.Array[SchemaOrderDocument] = null
  ): SchemaOrderDocumentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (orderDocuments != null) __obj.updateDynamic("orderDocuments")(orderDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderDocumentsListResponse]
  }
}

