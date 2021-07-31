package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2BatchCreateEntitiesRequest extends StObject {
  
  /** Required. The entities to create. */
  var entities: js.UndefOr[js.Array[GoogleCloudDialogflowV2EntityTypeEntity]] = js.undefined
  
  /**
    * Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity
    * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    */
  var languageCode: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2BatchCreateEntitiesRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2BatchCreateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchCreateEntitiesRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2BatchCreateEntitiesRequestMutableBuilder[Self <: GoogleCloudDialogflowV2BatchCreateEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[GoogleCloudDialogflowV2EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: GoogleCloudDialogflowV2EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
