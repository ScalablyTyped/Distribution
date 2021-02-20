package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2FulfillmentFeature extends StObject {
  
  /** The type of the feature that enabled for fulfillment. */
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2FulfillmentFeature {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2FulfillmentFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2FulfillmentFeature]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2FulfillmentFeatureMutableBuilder[Self <: GoogleCloudDialogflowV2FulfillmentFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
