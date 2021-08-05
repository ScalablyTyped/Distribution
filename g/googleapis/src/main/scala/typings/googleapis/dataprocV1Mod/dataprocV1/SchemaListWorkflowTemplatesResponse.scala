package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to a request to list workflow templates in a project.
  */
trait SchemaListWorkflowTemplatesResponse extends StObject {
  
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent
    * &lt;code&gt;ListWorkflowTemplatesRequest&lt;/code&gt;.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. WorkflowTemplates list.
    */
  var templates: js.UndefOr[js.Array[SchemaWorkflowTemplate]] = js.undefined
}
object SchemaListWorkflowTemplatesResponse {
  
  inline def apply(): SchemaListWorkflowTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkflowTemplatesResponse]
  }
  
  extension [Self <: SchemaListWorkflowTemplatesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTemplates(value: js.Array[SchemaWorkflowTemplate]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: SchemaWorkflowTemplate*): Self = StObject.set(x, "templates", js.Array(value :_*))
  }
}
