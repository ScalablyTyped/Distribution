package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a shell-style task to execute, suitable for providing as the Bots
  * interface&#39;s `Lease.payload` field.
  */
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask extends StObject {
  
  /**
    * The expected outputs from the task.
    */
  var expectedOutputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs] = js.undefined
  
  /**
    * The inputs to the task.
    */
  var inputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs] = js.undefined
  
  /**
    * The timeouts of this task.
    */
  var timeouts: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedOutputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs): Self = StObject.set(x, "expectedOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedOutputsUndefined: Self = StObject.set(x, "expectedOutputs", js.undefined)
    
    @scala.inline
    def setInputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setTimeouts(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
  }
}
