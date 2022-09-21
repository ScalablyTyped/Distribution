package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTask extends StObject {
  
  /** Counter prefix that can be used to prefix counters. Not currently used in Dataflow. */
  var counterPrefix: js.UndefOr[String] = js.undefined
  
  /** The instructions in the MapTask. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.undefined
  
  /** System-defined name of the stage containing this MapTask. Unique across the workflow. */
  var stageName: js.UndefOr[String] = js.undefined
  
  /** System-defined name of this MapTask. Unique across the workflow. */
  var systemName: js.UndefOr[String] = js.undefined
}
object MapTask {
  
  inline def apply(): MapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTask]
  }
  
  extension [Self <: MapTask](x: Self) {
    
    inline def setCounterPrefix(value: String): Self = StObject.set(x, "counterPrefix", value.asInstanceOf[js.Any])
    
    inline def setCounterPrefixUndefined: Self = StObject.set(x, "counterPrefix", js.undefined)
    
    inline def setInstructions(value: js.Array[ParallelInstruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setInstructionsVarargs(value: ParallelInstruction*): Self = StObject.set(x, "instructions", js.Array(value*))
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
  }
}
