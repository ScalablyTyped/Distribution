package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowTemplatesResponse extends StObject {
  
  /**
    * Output only. This token is included in the response if there are more results to fetch. To fetch additional results, provide this value as the page_token in a subsequent
    * ListWorkflowTemplatesRequest.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Output only. WorkflowTemplates list. */
  var templates: js.UndefOr[js.Array[WorkflowTemplate]] = js.undefined
}
object ListWorkflowTemplatesResponse {
  
  @scala.inline
  def apply(): ListWorkflowTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListWorkflowTemplatesResponseMutableBuilder[Self <: ListWorkflowTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTemplates(value: js.Array[WorkflowTemplate]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTemplatesVarargs(value: WorkflowTemplate*): Self = StObject.set(x, "templates", js.Array(value :_*))
  }
}
