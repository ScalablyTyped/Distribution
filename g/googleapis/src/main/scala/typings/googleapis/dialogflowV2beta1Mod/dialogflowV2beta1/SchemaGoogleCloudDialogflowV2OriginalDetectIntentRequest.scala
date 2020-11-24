package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the contents of the original request that was passed to the
  * `[Streaming]DetectIntent` call.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest extends js.Object {
  
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
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The source of this request, e.g., `google`, `facebook`, `slack`. It is
    * set by Dialogflow-owned servers.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Optional. The version of the protocol used for this request. This field
    * is AoG-specific.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequestOps[Self <: SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPayload(value: StringDictionary[js.Any]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
