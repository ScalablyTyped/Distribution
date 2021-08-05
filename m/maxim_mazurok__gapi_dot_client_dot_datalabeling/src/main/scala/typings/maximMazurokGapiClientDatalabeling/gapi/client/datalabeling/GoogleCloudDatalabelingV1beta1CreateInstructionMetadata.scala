package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1CreateInstructionMetadata extends StObject {
  
  /** Timestamp when create instruction request was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The name of the created Instruction. projects/{project_id}/instructions/{instruction_id} */
  var instruction: js.UndefOr[String] = js.undefined
  
  /** Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details. */
  var partialFailures: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
}
object GoogleCloudDatalabelingV1beta1CreateInstructionMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1CreateInstructionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CreateInstructionMetadata]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1CreateInstructionMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    inline def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    inline def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    inline def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value :_*))
  }
}
