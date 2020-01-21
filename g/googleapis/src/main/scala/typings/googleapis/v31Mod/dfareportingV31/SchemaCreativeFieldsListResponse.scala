package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Field List Response
  */
@js.native
trait SchemaCreativeFieldsListResponse extends js.Object {
  /**
    * Creative field collection.
    */
  var creativeFields: js.UndefOr[js.Array[SchemaCreativeField]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeFieldsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCreativeFieldsListResponse {
  @scala.inline
  def apply(
    creativeFields: js.Array[SchemaCreativeField] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaCreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeFields != null) __obj.updateDynamic("creativeFields")(creativeFields.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeFieldsListResponse]
  }
}

