package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTask extends StObject {
  
  /** Counter prefix that can be used to prefix counters. Not currently used in Dataflow. */
  var counterPrefix: js.UndefOr[String] = js.native
  
  /** The instructions in the MapTask. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.native
  
  /** System-defined name of the stage containing this MapTask. Unique across the workflow. */
  var stageName: js.UndefOr[String] = js.native
  
  /** System-defined name of this MapTask. Unique across the workflow. */
  var systemName: js.UndefOr[String] = js.native
}
object MapTask {
  
  @scala.inline
  def apply(): MapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTask]
  }
  
  @scala.inline
  implicit class MapTaskMutableBuilder[Self <: MapTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounterPrefix(value: String): Self = StObject.set(x, "counterPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterPrefixUndefined: Self = StObject.set(x, "counterPrefix", js.undefined)
    
    @scala.inline
    def setInstructions(value: js.Array[ParallelInstruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    @scala.inline
    def setInstructionsVarargs(value: ParallelInstruction*): Self = StObject.set(x, "instructions", js.Array(value :_*))
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
  }
}
