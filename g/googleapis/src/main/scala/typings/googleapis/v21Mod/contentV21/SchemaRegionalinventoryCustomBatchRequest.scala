package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionalinventoryCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaRegionalinventoryCustomBatchRequestEntry]] = js.undefined
}
object SchemaRegionalinventoryCustomBatchRequest {
  
  @scala.inline
  def apply(): SchemaRegionalinventoryCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalinventoryCustomBatchRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionalinventoryCustomBatchRequestMutableBuilder[Self <: SchemaRegionalinventoryCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaRegionalinventoryCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaRegionalinventoryCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
