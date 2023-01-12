package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingComputationConfig extends StObject {
  
  /** Unique identifier for this computation. */
  var computationId: js.UndefOr[String] = js.undefined
  
  /** Instructions that comprise the computation. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.undefined
  
  /** Stage name of this computation. */
  var stageName: js.UndefOr[String] = js.undefined
  
  /** System defined name for this computation. */
  var systemName: js.UndefOr[String] = js.undefined
  
  /** Map from user name of stateful transforms in this stage to their state family. */
  var transformUserNameToStateFamily: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object StreamingComputationConfig {
  
  inline def apply(): StreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingComputationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingComputationConfig] (val x: Self) extends AnyVal {
    
    inline def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    inline def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    inline def setInstructions(value: js.Array[ParallelInstruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setInstructionsVarargs(value: ParallelInstruction*): Self = StObject.set(x, "instructions", js.Array(value*))
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    inline def setTransformUserNameToStateFamily(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "transformUserNameToStateFamily", value.asInstanceOf[js.Any])
    
    inline def setTransformUserNameToStateFamilyUndefined: Self = StObject.set(x, "transformUserNameToStateFamily", js.undefined)
  }
}
