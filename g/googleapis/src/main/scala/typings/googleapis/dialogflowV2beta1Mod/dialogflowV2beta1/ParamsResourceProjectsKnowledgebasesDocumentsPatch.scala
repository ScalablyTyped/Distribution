package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsKnowledgebasesDocumentsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The document resource name. The name must be empty when creating a
    * document. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base
    * ID>/documents/<Document ID>`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Document] = js.undefined
  
  /**
    * Optional. Not specified means `update all`. Currently, only
    * `display_name` can be updated, an InvalidArgument will be returned for
    * attempting to update other fields.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsKnowledgebasesDocumentsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsKnowledgebasesDocumentsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsKnowledgebasesDocumentsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsKnowledgebasesDocumentsPatchMutableBuilder[Self <: ParamsResourceProjectsKnowledgebasesDocumentsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1Document): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
