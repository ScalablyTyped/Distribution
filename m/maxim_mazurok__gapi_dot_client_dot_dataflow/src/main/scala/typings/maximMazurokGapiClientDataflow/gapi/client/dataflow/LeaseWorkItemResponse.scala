package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeaseWorkItemResponse extends StObject {
  
  /** Untranslated bag-of-bytes WorkResponse for UnifiedWorker. */
  var unifiedWorkerResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LeaseWorkItemResponse & TopLevel[js.Any]
  ] = js.undefined
  
  /** A list of the leased WorkItems. */
  var workItems: js.UndefOr[js.Array[WorkItem]] = js.undefined
}
object LeaseWorkItemResponse {
  
  @scala.inline
  def apply(): LeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseWorkItemResponse]
  }
  
  @scala.inline
  implicit class LeaseWorkItemResponseMutableBuilder[Self <: LeaseWorkItemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnifiedWorkerResponse(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LeaseWorkItemResponse & TopLevel[js.Any]
    ): Self = StObject.set(x, "unifiedWorkerResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnifiedWorkerResponseUndefined: Self = StObject.set(x, "unifiedWorkerResponse", js.undefined)
    
    @scala.inline
    def setWorkItems(value: js.Array[WorkItem]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsUndefined: Self = StObject.set(x, "workItems", js.undefined)
    
    @scala.inline
    def setWorkItemsVarargs(value: WorkItem*): Self = StObject.set(x, "workItems", js.Array(value :_*))
  }
}
