package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionSpec extends StObject {
  
  /**
    * Optional. Specifies the maximum desired number of tasks the execution should run at given time. Must be <= task_count. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism. +optional
    */
  var parallelism: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
    */
  var taskCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Describes the task(s) that will be created when executing an execution.
    */
  var template: js.UndefOr[SchemaTaskTemplateSpec] = js.undefined
}
object SchemaExecutionSpec {
  
  inline def apply(): SchemaExecutionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionSpec]
  }
  
  extension [Self <: SchemaExecutionSpec](x: Self) {
    
    inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    inline def setParallelismNull: Self = StObject.set(x, "parallelism", null)
    
    inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
    
    inline def setTaskCount(value: Double): Self = StObject.set(x, "taskCount", value.asInstanceOf[js.Any])
    
    inline def setTaskCountNull: Self = StObject.set(x, "taskCount", null)
    
    inline def setTaskCountUndefined: Self = StObject.set(x, "taskCount", js.undefined)
    
    inline def setTemplate(value: SchemaTaskTemplateSpec): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
