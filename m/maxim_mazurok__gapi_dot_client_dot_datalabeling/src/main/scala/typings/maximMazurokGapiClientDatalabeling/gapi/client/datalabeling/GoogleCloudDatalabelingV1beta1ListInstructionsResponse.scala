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
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ListInstructionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListInstructionsResponse]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ListInstructionsResponse](x: Self) {
    
    inline def setInstructions(value: js.Array[GoogleCloudDatalabelingV1beta1Instruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setInstructionsVarargs(value: GoogleCloudDatalabelingV1beta1Instruction*): Self = StObject.set(x, "instructions", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
