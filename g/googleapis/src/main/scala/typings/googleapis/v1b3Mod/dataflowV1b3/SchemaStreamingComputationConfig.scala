package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamingComputationConfig extends StObject {
  
  /**
    * Unique identifier for this computation.
    */
  var computationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instructions that comprise the computation.
    */
  var instructions: js.UndefOr[js.Array[SchemaParallelInstruction]] = js.undefined
  
  /**
    * Stage name of this computation.
    */
  var stageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System defined name for this computation.
    */
  var systemName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Map from user name of stateful transforms in this stage to their state family.
    */
  var transformUserNameToStateFamily: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaStreamingComputationConfig {
  
  inline def apply(): SchemaStreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationConfig]
  }
  
  extension [Self <: SchemaStreamingComputationConfig](x: Self) {
    
    inline def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    inline def setComputationIdNull: Self = StObject.set(x, "computationId", null)
    
    inline def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    inline def setInstructions(value: js.Array[SchemaParallelInstruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setInstructionsVarargs(value: SchemaParallelInstruction*): Self = StObject.set(x, "instructions", js.Array(value*))
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameNull: Self = StObject.set(x, "stageName", null)
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameNull: Self = StObject.set(x, "systemName", null)
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    inline def setTransformUserNameToStateFamily(value: StringDictionary[String]): Self = StObject.set(x, "transformUserNameToStateFamily", value.asInstanceOf[js.Any])
    
    inline def setTransformUserNameToStateFamilyNull: Self = StObject.set(x, "transformUserNameToStateFamily", null)
    
    inline def setTransformUserNameToStateFamilyUndefined: Self = StObject.set(x, "transformUserNameToStateFamily", js.undefined)
  }
}
