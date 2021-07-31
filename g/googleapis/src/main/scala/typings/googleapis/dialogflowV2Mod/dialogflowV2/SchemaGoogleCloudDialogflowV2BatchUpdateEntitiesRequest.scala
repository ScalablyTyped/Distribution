package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for EntityTypes.BatchUpdateEntities.
  */
trait SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest extends StObject {
  
  /**
    * Required. The entities to update or create.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]] = js.undefined
  
  /**
    * Optional. The language of entity synonyms defined in `entities`. If not
    * specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequestMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
