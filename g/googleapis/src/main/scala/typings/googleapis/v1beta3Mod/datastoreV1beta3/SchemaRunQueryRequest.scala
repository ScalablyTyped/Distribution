package typings.googleapis.v1beta3Mod.datastoreV1beta3

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
  def apply(): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
  @scala.inline
  implicit class SchemaRunQueryRequestOps[Self <: SchemaRunQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGqlQuery(value: SchemaGqlQuery): Self = this.set("gqlQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGqlQuery: Self = this.set("gqlQuery", js.undefined)
    @scala.inline
    def setPartitionId(value: SchemaPartitionId): Self = this.set("partitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionId: Self = this.set("partitionId", js.undefined)
    @scala.inline
    def setQuery(value: SchemaQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReadOptions(value: SchemaReadOptions): Self = this.set("readOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOptions: Self = this.set("readOptions", js.undefined)
  }
  
}

