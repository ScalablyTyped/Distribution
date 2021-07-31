package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration information for a single streaming computation.
  */
trait SchemaStreamingComputationConfig extends StObject {
  
  /**
    * Unique identifier for this computation.
    */
  var computationId: js.UndefOr[String] = js.undefined
  
  /**
    * Instructions that comprise the computation.
    */
  var instructions: js.UndefOr[js.Array[SchemaParallelInstruction]] = js.undefined
  
  /**
    * Stage name of this computation.
    */
  var stageName: js.UndefOr[String] = js.undefined
  
  /**
    * System defined name for this computation.
    */
  var systemName: js.UndefOr[String] = js.undefined
  
  /**
    * Map from user name of stateful transforms in this stage to their state
    * family.
    */
  var transformUserNameToStateFamily: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaStreamingComputationConfig {
  
  @scala.inline
  def apply(): SchemaStreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationConfig]
  }
  
  @scala.inline
  implicit class SchemaStreamingComputationConfigMutableBuilder[Self <: SchemaStreamingComputationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    @scala.inline
    def setInstructions(value: js.Array[SchemaParallelInstruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    @scala.inline
    def setInstructionsVarargs(value: SchemaParallelInstruction*): Self = StObject.set(x, "instructions", js.Array(value :_*))
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    @scala.inline
    def setTransformUserNameToStateFamily(value: StringDictionary[String]): Self = StObject.set(x, "transformUserNameToStateFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUserNameToStateFamilyUndefined: Self = StObject.set(x, "transformUserNameToStateFamily", js.undefined)
  }
}
