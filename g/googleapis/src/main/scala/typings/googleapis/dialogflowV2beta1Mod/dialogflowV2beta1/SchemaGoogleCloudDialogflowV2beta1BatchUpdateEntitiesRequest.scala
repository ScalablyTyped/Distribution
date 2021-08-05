package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for EntityTypes.BatchUpdateEntities.
  */
trait SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntitiesRequest extends StObject {
  
  /**
    * Required. The entities to update or create.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.undefined
  
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
object SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntitiesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntitiesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntitiesRequest](x: Self) {
    
    inline def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
