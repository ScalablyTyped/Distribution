package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeaseWorkItemResponse extends StObject {
  
  /** Untranslated bag-of-bytes WorkResponse for UnifiedWorker. */
  var unifiedWorkerResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** A list of the leased WorkItems. */
  var workItems: js.UndefOr[js.Array[WorkItem]] = js.undefined
}
object LeaseWorkItemResponse {
  
  inline def apply(): LeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseWorkItemResponse]
  }
  
  extension [Self <: LeaseWorkItemResponse](x: Self) {
    
    inline def setUnifiedWorkerResponse(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "unifiedWorkerResponse", value.asInstanceOf[js.Any])
    
    inline def setUnifiedWorkerResponseUndefined: Self = StObject.set(x, "unifiedWorkerResponse", js.undefined)
    
    inline def setWorkItems(value: js.Array[WorkItem]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsUndefined: Self = StObject.set(x, "workItems", js.undefined)
    
    inline def setWorkItemsVarargs(value: WorkItem*): Self = StObject.set(x, "workItems", js.Array(value*))
  }
}
