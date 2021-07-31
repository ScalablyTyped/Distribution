package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapTask consists of an ordered set of instructions, each of which describes
  * one particular low-level operation for the worker to perform in order to
  * accomplish the MapTask&#39;s WorkItem.  Each instruction must appear in the
  * list before any instructions which depends on its output.
  */
trait SchemaMapTask extends StObject {
  
  /**
    * Counter prefix that can be used to prefix counters. Not currently used in
    * Dataflow.
    */
  var counterPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The instructions in the MapTask.
    */
  var instructions: js.UndefOr[js.Array[SchemaParallelInstruction]] = js.undefined
  
  /**
    * System-defined name of the stage containing this MapTask. Unique across
    * the workflow.
    */
  var stageName: js.UndefOr[String] = js.undefined
  
  /**
    * System-defined name of this MapTask. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.undefined
}
object SchemaMapTask {
  
  @scala.inline
  def apply(): SchemaMapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMapTask]
  }
  
  @scala.inline
  implicit class SchemaMapTaskMutableBuilder[Self <: SchemaMapTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounterPrefix(value: String): Self = StObject.set(x, "counterPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterPrefixUndefined: Self = StObject.set(x, "counterPrefix", js.undefined)
    
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
  }
}
