package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for Intents.BatchUpdateIntents.
  */
trait SchemaGoogleCloudDialogflowV2BatchUpdateIntentsRequest extends StObject {
  
  /**
    * The collection of intents to update or create.
    */
  var intentBatchInline: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentBatch] = js.undefined
  
  /**
    * The URI to a Google Cloud Storage file containing intents to update or
    * create. The file format can either be a serialized proto (of IntentBatch
    * type) or JSON object. Note: The URI must start with &quot;gs://&quot;.
    */
  var intentBatchUri: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The resource view to apply to the returned intent.
    */
  var intentView: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The language of training phrases, parameters and rich messages
    * defined in `intents`. If not specified, the agent&#39;s default language
    * is used. [Many
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
object SchemaGoogleCloudDialogflowV2BatchUpdateIntentsRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2BatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchUpdateIntentsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2BatchUpdateIntentsRequest](x: Self) {
    
    inline def setIntentBatchInline(value: SchemaGoogleCloudDialogflowV2IntentBatch): Self = StObject.set(x, "intentBatchInline", value.asInstanceOf[js.Any])
    
    inline def setIntentBatchInlineUndefined: Self = StObject.set(x, "intentBatchInline", js.undefined)
    
    inline def setIntentBatchUri(value: String): Self = StObject.set(x, "intentBatchUri", value.asInstanceOf[js.Any])
    
    inline def setIntentBatchUriUndefined: Self = StObject.set(x, "intentBatchUri", js.undefined)
    
    inline def setIntentView(value: String): Self = StObject.set(x, "intentView", value.asInstanceOf[js.Any])
    
    inline def setIntentViewUndefined: Self = StObject.set(x, "intentView", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
