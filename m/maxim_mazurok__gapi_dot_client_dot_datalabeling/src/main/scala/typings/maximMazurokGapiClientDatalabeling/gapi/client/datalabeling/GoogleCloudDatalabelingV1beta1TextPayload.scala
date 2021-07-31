package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1TextPayload extends StObject {
  
  /** Text content. */
  var textContent: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1TextPayload {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1TextPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TextPayload]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1TextPayloadMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1TextPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
  }
}
