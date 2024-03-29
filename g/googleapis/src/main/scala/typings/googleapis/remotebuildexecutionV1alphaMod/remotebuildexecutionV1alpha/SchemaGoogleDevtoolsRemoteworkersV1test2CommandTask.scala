package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  inline def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask](x: Self) {
    
    inline def setExpectedOutputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs): Self = StObject.set(x, "expectedOutputs", value.asInstanceOf[js.Any])
    
    inline def setExpectedOutputsUndefined: Self = StObject.set(x, "expectedOutputs", js.undefined)
    
    inline def setInputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setTimeouts(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    
    inline def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
  }
}
