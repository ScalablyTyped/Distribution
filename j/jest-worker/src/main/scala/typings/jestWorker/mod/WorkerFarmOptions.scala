package typings.jestWorker.mod

import org.scalablytyped.runtime.Instantiable2
import typings.node.childProcessMod.ForkOptions
import typings.node.workerThreadsMod.ResourceLimits_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerFarmOptions extends StObject {
  
  var WorkerPool: js.UndefOr[
    Instantiable2[
      /* workerPath */ String, 
      /* options */ js.UndefOr[WorkerPoolOptions], 
      WorkerPoolInterface
    ]
  ] = js.undefined
  
  var computeWorkerKey: js.UndefOr[js.Function2[/* method */ String, /* repeated */ Any, String | Null]] = js.undefined
  
  var enableWorkerThreads: js.UndefOr[Boolean] = js.undefined
  
  var exposedMethods: js.UndefOr[js.Array[String]] = js.undefined
  
  var forkOptions: js.UndefOr[ForkOptions] = js.undefined
  
  var idleMemoryLimit: js.UndefOr[Double] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var numWorkers: js.UndefOr[Double] = js.undefined
  
  var resourceLimits: js.UndefOr[ResourceLimits_] = js.undefined
  
  var setupArgs: js.UndefOr[js.Array[Any]] = js.undefined
  
  var taskQueue: js.UndefOr[TaskQueue] = js.undefined
  
  var workerSchedulingPolicy: js.UndefOr[WorkerSchedulingPolicy] = js.undefined
}
object WorkerFarmOptions {
  
  inline def apply(): WorkerFarmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerFarmOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerFarmOptions] (val x: Self) extends AnyVal {
    
    inline def setComputeWorkerKey(value: (/* method */ String, /* repeated */ Any) => String | Null): Self = StObject.set(x, "computeWorkerKey", js.Any.fromFunction2(value))
    
    inline def setComputeWorkerKeyUndefined: Self = StObject.set(x, "computeWorkerKey", js.undefined)
    
    inline def setEnableWorkerThreads(value: Boolean): Self = StObject.set(x, "enableWorkerThreads", value.asInstanceOf[js.Any])
    
    inline def setEnableWorkerThreadsUndefined: Self = StObject.set(x, "enableWorkerThreads", js.undefined)
    
    inline def setExposedMethods(value: js.Array[String]): Self = StObject.set(x, "exposedMethods", value.asInstanceOf[js.Any])
    
    inline def setExposedMethodsUndefined: Self = StObject.set(x, "exposedMethods", js.undefined)
    
    inline def setExposedMethodsVarargs(value: String*): Self = StObject.set(x, "exposedMethods", js.Array(value*))
    
    inline def setForkOptions(value: ForkOptions): Self = StObject.set(x, "forkOptions", value.asInstanceOf[js.Any])
    
    inline def setForkOptionsUndefined: Self = StObject.set(x, "forkOptions", js.undefined)
    
    inline def setIdleMemoryLimit(value: Double): Self = StObject.set(x, "idleMemoryLimit", value.asInstanceOf[js.Any])
    
    inline def setIdleMemoryLimitUndefined: Self = StObject.set(x, "idleMemoryLimit", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    inline def setResourceLimits(value: ResourceLimits_): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
    
    inline def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
    
    inline def setSetupArgs(value: js.Array[Any]): Self = StObject.set(x, "setupArgs", value.asInstanceOf[js.Any])
    
    inline def setSetupArgsUndefined: Self = StObject.set(x, "setupArgs", js.undefined)
    
    inline def setSetupArgsVarargs(value: Any*): Self = StObject.set(x, "setupArgs", js.Array(value*))
    
    inline def setTaskQueue(value: TaskQueue): Self = StObject.set(x, "taskQueue", value.asInstanceOf[js.Any])
    
    inline def setTaskQueueUndefined: Self = StObject.set(x, "taskQueue", js.undefined)
    
    inline def setWorkerPool(
      value: Instantiable2[
          /* workerPath */ String, 
          /* options */ js.UndefOr[WorkerPoolOptions], 
          WorkerPoolInterface
        ]
    ): Self = StObject.set(x, "WorkerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "WorkerPool", js.undefined)
    
    inline def setWorkerSchedulingPolicy(value: WorkerSchedulingPolicy): Self = StObject.set(x, "workerSchedulingPolicy", value.asInstanceOf[js.Any])
    
    inline def setWorkerSchedulingPolicyUndefined: Self = StObject.set(x, "workerSchedulingPolicy", js.undefined)
  }
}
