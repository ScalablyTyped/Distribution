package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapTask consists of an ordered set of instructions, each of which describes
  * one particular low-level operation for the worker to perform in order to
  * accomplish the MapTask&#39;s WorkItem.  Each instruction must appear in the
  * list before any instructions which depends on its output.
  */
@js.native
trait SchemaMapTask extends js.Object {
  
  /**
    * Counter prefix that can be used to prefix counters. Not currently used in
    * Dataflow.
    */
  var counterPrefix: js.UndefOr[String] = js.native
  
  /**
    * The instructions in the MapTask.
    */
  var instructions: js.UndefOr[js.Array[SchemaParallelInstruction]] = js.native
  
  /**
    * System-defined name of the stage containing this MapTask. Unique across
    * the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  
  /**
    * System-defined name of this MapTask. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
}
object SchemaMapTask {
  
  @scala.inline
  def apply(): SchemaMapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMapTask]
  }
  
  @scala.inline
  implicit class SchemaMapTaskOps[Self <: SchemaMapTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCounterPrefix(value: String): Self = this.set("counterPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounterPrefix: Self = this.set("counterPrefix", js.undefined)
    
    @scala.inline
    def setInstructionsVarargs(value: SchemaParallelInstruction*): Self = this.set("instructions", js.Array(value :_*))
    
    @scala.inline
    def setInstructions(value: js.Array[SchemaParallelInstruction]): Self = this.set("instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstructions: Self = this.set("instructions", js.undefined)
    
    @scala.inline
    def setStageName(value: String): Self = this.set("stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = this.set("systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemName: Self = this.set("systemName", js.undefined)
  }
}
