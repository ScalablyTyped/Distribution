package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for EntityTypes.BatchCreateEntities.
  */
trait SchemaGoogleCloudDialogflowV2BatchCreateEntitiesRequest extends StObject {
  
  /**
    * Required. The entities to create.
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
}
object SchemaGoogleCloudDialogflowV2BatchCreateEntitiesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2BatchCreateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchCreateEntitiesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2BatchCreateEntitiesRequest](x: Self) {
    
    inline def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
