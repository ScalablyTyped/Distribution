package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch of results produced by a query.
  */
@js.native
trait SchemaQueryResultBatch extends js.Object {
  
  /**
    * A cursor that points to the position after the last result in the batch.
    */
  var endCursor: js.UndefOr[String] = js.native
  
  /**
    * The result type for every entity in `entity_results`.
    */
  var entityResultType: js.UndefOr[String] = js.native
  
  /**
    * The results for this batch.
    */
  var entityResults: js.UndefOr[js.Array[SchemaEntityResult]] = js.native
  
  /**
    * The state of the query after the current batch.
    */
  var moreResults: js.UndefOr[String] = js.native
  
  /**
    * A cursor that points to the position after the last skipped result. Will
    * be set when `skipped_results` != 0.
    */
  var skippedCursor: js.UndefOr[String] = js.native
  
  /**
    * The number of results skipped, typically because of an offset.
    */
  var skippedResults: js.UndefOr[Double] = js.native
  
  /**
    * The version number of the snapshot this batch was returned from. This
    * applies to the range of results from the query&#39;s `start_cursor` (or
    * the beginning of the query if no cursor was given) to this batch&#39;s
    * `end_cursor` (not the query&#39;s `end_cursor`).  In a single
    * transaction, subsequent query result batches for the same query can have
    * a greater snapshot version number. Each batch&#39;s snapshot version is
    * valid for all preceding batches. The value will be zero for eventually
    * consistent queries.
    */
  var snapshotVersion: js.UndefOr[String] = js.native
}
object SchemaQueryResultBatch {
  
  @scala.inline
  def apply(): SchemaQueryResultBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryResultBatch]
  }
  
  @scala.inline
  implicit class SchemaQueryResultBatchOps[Self <: SchemaQueryResultBatch] (val x: Self) extends AnyVal {
    
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
    def setEndCursor(value: String): Self = this.set("endCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndCursor: Self = this.set("endCursor", js.undefined)
    
    @scala.inline
    def setEntityResultType(value: String): Self = this.set("entityResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityResultType: Self = this.set("entityResultType", js.undefined)
    
    @scala.inline
    def setEntityResultsVarargs(value: SchemaEntityResult*): Self = this.set("entityResults", js.Array(value :_*))
    
    @scala.inline
    def setEntityResults(value: js.Array[SchemaEntityResult]): Self = this.set("entityResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityResults: Self = this.set("entityResults", js.undefined)
    
    @scala.inline
    def setMoreResults(value: String): Self = this.set("moreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoreResults: Self = this.set("moreResults", js.undefined)
    
    @scala.inline
    def setSkippedCursor(value: String): Self = this.set("skippedCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippedCursor: Self = this.set("skippedCursor", js.undefined)
    
    @scala.inline
    def setSkippedResults(value: Double): Self = this.set("skippedResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippedResults: Self = this.set("skippedResults", js.undefined)
    
    @scala.inline
    def setSnapshotVersion(value: String): Self = this.set("snapshotVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotVersion: Self = this.set("snapshotVersion", js.undefined)
  }
}
