package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ListInstructionsResponse extends StObject {
  
  /** The list of Instructions to return. */
  var instructions: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Instruction]] = js.undefined
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ListInstructionsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ListInstructionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListInstructionsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ListInstructionsResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ListInstructionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstructions(value: js.Array[GoogleCloudDatalabelingV1beta1Instruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    @scala.inline
    def setInstructionsVarargs(value: GoogleCloudDatalabelingV1beta1Instruction*): Self = StObject.set(x, "instructions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
