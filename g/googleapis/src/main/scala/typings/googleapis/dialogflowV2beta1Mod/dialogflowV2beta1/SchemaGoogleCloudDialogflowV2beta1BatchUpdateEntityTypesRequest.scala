package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for EntityTypes.BatchUpdateEntityTypes.
  */
trait SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesRequest extends StObject {
  
  /**
    * The collection of entity types to update or create.
    */
  var entityTypeBatchInline: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch] = js.undefined
  
  /**
    * The URI to a Google Cloud Storage file containing entity types to update
    * or create. The file format can either be a serialized proto (of
    * EntityBatch type) or a JSON object. Note: The URI must start with
    * &quot;gs://&quot;.
    */
  var entityTypeBatchUri: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The language of entity synonyms defined in `entity_types`. If
    * not specified, the agent&#39;s default language is used. [Many
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
object SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesRequest](x: Self) {
    
    inline def setEntityTypeBatchInline(value: SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch): Self = StObject.set(x, "entityTypeBatchInline", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeBatchInlineUndefined: Self = StObject.set(x, "entityTypeBatchInline", js.undefined)
    
    inline def setEntityTypeBatchUri(value: String): Self = StObject.set(x, "entityTypeBatchUri", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeBatchUriUndefined: Self = StObject.set(x, "entityTypeBatchUri", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
