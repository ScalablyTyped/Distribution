package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstructionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Filter is not supported at this moment.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A token identifying a page of results for the server to return. Typically obtained by ListInstructionsResponse.next_page_token of the previous [DataLabelingService.ListInstructions] call. Return first page if empty.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Instruction resource parent, format: projects/{project_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstructionsList {
  
  inline def apply(): ParamsResourceProjectsInstructionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstructionsList]
  }
  
  extension [Self <: ParamsResourceProjectsInstructionsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
