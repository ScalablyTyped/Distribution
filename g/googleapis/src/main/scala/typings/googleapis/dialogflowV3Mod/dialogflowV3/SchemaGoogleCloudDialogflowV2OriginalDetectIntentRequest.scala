package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest extends StObject {
  
  /**
    * Optional. This field is set to the value of the `QueryParameters.payload` field passed in the request. Some integrations that query a Dialogflow agent may provide additional information in the payload. In particular, for the Dialogflow Phone Gateway integration, this field has the form: { "telephony": { "caller_id": "+18558363987" \} \} Note: The caller ID field (`caller_id`) will be redacted for Trial Edition agents and populated with the caller ID in [E.164 format](https://en.wikipedia.org/wiki/E.164) for Essentials Edition agents.
    */
  var payload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The source of this request, e.g., `google`, `facebook`, `slack`. It is set by Dialogflow-owned servers.
    */
  var source: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The version of the protocol used for this request. This field is AoG-specific.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest](x: Self) {
    
    inline def setPayload(value: StringDictionary[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
