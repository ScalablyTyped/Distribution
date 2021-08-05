package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the contents of the original request that was passed to the
  * `[Streaming]DetectIntent` call.
  */
trait SchemaGoogleCloudDialogflowV2beta1OriginalDetectIntentRequest extends StObject {
  
  /**
    * Optional. This field is set to the value of the `QueryParameters.payload`
    * field passed in the request. Some integrations that query a Dialogflow
    * agent may provide additional information in the payload.  In particular
    * for the Telephony Gateway this field has the form: &lt;pre&gt;{
    * &quot;telephony&quot;: {    &quot;caller_id&quot;:
    * &quot;+18558363987&quot;  } }&lt;/pre&gt; Note: The caller ID field
    * (`caller_id`) will be redacted for Standard Edition agents and populated
    * with the caller ID in [E.164 format](https://en.wikipedia.org/wiki/E.164)
    * for Enterprise Edition agents.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The source of this request, e.g., `google`, `facebook`, `slack`. It is
    * set by Dialogflow-owned servers.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The version of the protocol used for this request. This field
    * is AoG-specific.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1OriginalDetectIntentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1OriginalDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1OriginalDetectIntentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1OriginalDetectIntentRequest](x: Self) {
    
    inline def setPayload(value: StringDictionary[js.Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
