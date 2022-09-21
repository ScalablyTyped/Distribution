package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata extends StObject {
  
  /**
    * Timestamp when create instruction request was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the created Instruction. projects/{project_id\}/instructions/{instruction_id\}
    */
  var instruction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details.
    */
  var partialFailures: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionNull: Self = StObject.set(x, "instruction", null)
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    inline def setPartialFailures(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    inline def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    inline def setPartialFailuresVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value*))
  }
}
