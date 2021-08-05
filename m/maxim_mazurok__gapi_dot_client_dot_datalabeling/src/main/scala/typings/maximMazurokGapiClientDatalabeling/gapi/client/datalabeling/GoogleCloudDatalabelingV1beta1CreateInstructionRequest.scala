package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1CreateInstructionRequest extends StObject {
  
  /** Required. Instruction of how to perform the labeling task. */
  var instruction: js.UndefOr[GoogleCloudDatalabelingV1beta1Instruction] = js.undefined
}
object GoogleCloudDatalabelingV1beta1CreateInstructionRequest {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1CreateInstructionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CreateInstructionRequest]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1CreateInstructionRequest](x: Self) {
    
    inline def setInstruction(value: GoogleCloudDatalabelingV1beta1Instruction): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
  }
}
