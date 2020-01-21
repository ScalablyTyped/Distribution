package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.RunQuery.
  */
@js.native
trait SchemaRunQueryRequest extends js.Object {
  /**
    * The GQL query to run.
    */
  var gqlQuery: js.UndefOr[SchemaGqlQuery] = js.native
  /**
    * Entities are partitioned into subsets, identified by a partition ID.
    * Queries are scoped to a single partition. This partition ID is normalized
    * with the standard default context partition ID.
    */
  var partitionId: js.UndefOr[SchemaPartitionId] = js.native
  /**
    * The query to run.
    */
  var query: js.UndefOr[SchemaQuery] = js.native
  /**
    * The options for this query.
    */
  var readOptions: js.UndefOr[SchemaReadOptions] = js.native
}

object SchemaRunQueryRequest {
  @scala.inline
  def apply(
    gqlQuery: SchemaGqlQuery = null,
    partitionId: SchemaPartitionId = null,
    query: SchemaQuery = null,
    readOptions: SchemaReadOptions = null
  ): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (gqlQuery != null) __obj.updateDynamic("gqlQuery")(gqlQuery.asInstanceOf[js.Any])
    if (partitionId != null) __obj.updateDynamic("partitionId")(partitionId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (readOptions != null) __obj.updateDynamic("readOptions")(readOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
}

