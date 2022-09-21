package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1CreateInstructionRequest extends StObject {
  
  /**
    * Required. Instruction of how to perform the labeling task.
    */
  var instruction: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1Instruction] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1CreateInstructionRequest {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1CreateInstructionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1CreateInstructionRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1CreateInstructionRequest](x: Self) {
    
    inline def setInstruction(value: SchemaGoogleCloudDatalabelingV1beta1Instruction): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
  }
}
