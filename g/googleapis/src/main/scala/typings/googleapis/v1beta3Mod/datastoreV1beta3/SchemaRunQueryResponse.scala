package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.RunQuery.
  */
@js.native
trait SchemaRunQueryResponse extends js.Object {
  /**
    * A batch of query results (always present).
    */
  var batch: js.UndefOr[SchemaQueryResultBatch] = js.native
  /**
    * The parsed form of the `GqlQuery` from the request, if it was set.
    */
  var query: js.UndefOr[SchemaQuery] = js.native
}

object SchemaRunQueryResponse {
  @scala.inline
  def apply(batch: SchemaQueryResultBatch = null, query: SchemaQuery = null): SchemaRunQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRunQueryResponse]
  }
}

