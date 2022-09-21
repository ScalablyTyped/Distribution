package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentKnowledgebasesDocumentsList
  extends StObject
     with StandardParameters {
  
  /**
    * The filter expression used to filter documents returned by the list method. The expression has the following syntax: [AND ] ... The following fields and operators are supported: * knowledge_types with has(:) operator * display_name with has(:) operator * state with equals(=) operator Examples: * "knowledge_types:FAQ" matches documents with FAQ knowledge type. * "display_name:customer" matches documents whose display name contains "customer". * "state=ACTIVE" matches documents with ACTIVE state. * "knowledge_types:FAQ AND state=ACTIVE" matches all active FAQ documents. For more information about filtering, see [API Filtering](https://aip.dev/160).
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of items to return in a single page. By default 10 and at most 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous list request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The knowledge base to list all documents for. Format: `projects//locations//knowledgeBases/`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentKnowledgebasesDocumentsList {
  
  inline def apply(): ParamsResourceProjectsAgentKnowledgebasesDocumentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentKnowledgebasesDocumentsList]
  }
  
  extension [Self <: ParamsResourceProjectsAgentKnowledgebasesDocumentsList](x: Self) {
    
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
