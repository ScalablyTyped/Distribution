package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a request to lease WorkItems.
  */
trait SchemaLeaseWorkItemResponse extends StObject {
  
  /**
    * Untranslated bag-of-bytes WorkResponse for UnifiedWorker.
    */
  var unifiedWorkerResponse: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * A list of the leased WorkItems.
    */
  var workItems: js.UndefOr[js.Array[SchemaWorkItem]] = js.undefined
}
object SchemaLeaseWorkItemResponse {
  
  @scala.inline
  def apply(): SchemaLeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseWorkItemResponse]
  }
  
  @scala.inline
  implicit class SchemaLeaseWorkItemResponseMutableBuilder[Self <: SchemaLeaseWorkItemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnifiedWorkerResponse(value: StringDictionary[js.Any]): Self = StObject.set(x, "unifiedWorkerResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnifiedWorkerResponseUndefined: Self = StObject.set(x, "unifiedWorkerResponse", js.undefined)
    
    @scala.inline
    def setWorkItems(value: js.Array[SchemaWorkItem]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsUndefined: Self = StObject.set(x, "workItems", js.undefined)
    
    @scala.inline
    def setWorkItemsVarargs(value: SchemaWorkItem*): Self = StObject.set(x, "workItems", js.Array(value :_*))
  }
}
