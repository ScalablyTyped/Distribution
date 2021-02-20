package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResultBatch extends StObject {
  
  /** A cursor that points to the position after the last result in the batch. */
  var endCursor: js.UndefOr[String] = js.native
  
  /** The result type for every entity in `entity_results`. */
  var entityResultType: js.UndefOr[String] = js.native
  
  /** The results for this batch. */
  var entityResults: js.UndefOr[js.Array[EntityResult]] = js.native
  
  /** The state of the query after the current batch. */
  var moreResults: js.UndefOr[String] = js.native
  
  /** A cursor that points to the position after the last skipped result. Will be set when `skipped_results` != 0. */
  var skippedCursor: js.UndefOr[String] = js.native
  
  /** The number of results skipped, typically because of an offset. */
  var skippedResults: js.UndefOr[Double] = js.native
  
  /**
    * The version number of the snapshot this batch was returned from. This applies to the range of results from the query's `start_cursor` (or the beginning of the query if no cursor was
    * given) to this batch's `end_cursor` (not the query's `end_cursor`). In a single transaction, subsequent query result batches for the same query can have a greater snapshot version
    * number. Each batch's snapshot version is valid for all preceding batches. The value will be zero for eventually consistent queries.
    */
  var snapshotVersion: js.UndefOr[String] = js.native
}
object QueryResultBatch {
  
  @scala.inline
  def apply(): QueryResultBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResultBatch]
  }
  
  @scala.inline
  implicit class QueryResultBatchMutableBuilder[Self <: QueryResultBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndCursor(value: String): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
    
    @scala.inline
    def setEntityResultType(value: String): Self = StObject.set(x, "entityResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityResultTypeUndefined: Self = StObject.set(x, "entityResultType", js.undefined)
    
    @scala.inline
    def setEntityResults(value: js.Array[EntityResult]): Self = StObject.set(x, "entityResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityResultsUndefined: Self = StObject.set(x, "entityResults", js.undefined)
    
    @scala.inline
    def setEntityResultsVarargs(value: EntityResult*): Self = StObject.set(x, "entityResults", js.Array(value :_*))
    
    @scala.inline
    def setMoreResults(value: String): Self = StObject.set(x, "moreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreResultsUndefined: Self = StObject.set(x, "moreResults", js.undefined)
    
    @scala.inline
    def setSkippedCursor(value: String): Self = StObject.set(x, "skippedCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippedCursorUndefined: Self = StObject.set(x, "skippedCursor", js.undefined)
    
    @scala.inline
    def setSkippedResults(value: Double): Self = StObject.set(x, "skippedResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippedResultsUndefined: Self = StObject.set(x, "skippedResults", js.undefined)
    
    @scala.inline
    def setSnapshotVersion(value: String): Self = StObject.set(x, "snapshotVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotVersionUndefined: Self = StObject.set(x, "snapshotVersion", js.undefined)
  }
}
