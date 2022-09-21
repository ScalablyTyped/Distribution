package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1EventInput extends StObject {
  
  /** Name of the event. */
  var event: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1EventInput {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1EventInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1EventInput]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1EventInput](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
