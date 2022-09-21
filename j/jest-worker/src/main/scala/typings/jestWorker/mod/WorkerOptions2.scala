package typings.jestWorker.mod

import typings.jestWorker.anon.STATECHANGE
import typings.node.childProcessMod.ForkOptions
import typings.node.workerThreadsMod.ResourceLimits_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerOptions2 extends StObject {
  
  /**
    * This mainly exists so the path can be changed during testing.
    * https://github.com/facebook/jest/issues/9543
    */
  var childWorkerPath: js.UndefOr[String] = js.undefined
  
  var forkOptions: ForkOptions
  
  /**
    * After a job has executed the memory usage it should return to.
    *
    * @remarks
    * Note this is different from ResourceLimits in that it checks at idle, after
    * a job is complete. So you could have a resource limit of 500MB but an idle
    * limit of 50MB. The latter will only trigger if after a job has completed the
    * memory usage hasn't returned back down under 50MB.
    */
  var idleMemoryLimit: js.UndefOr[Double] = js.undefined
  
  var maxRetries: Double
  
  /**
    * Used to immediately bind event handlers.
    */
  var on: js.UndefOr[STATECHANGE] = js.undefined
  
  var resourceLimits: ResourceLimits_
  
  var setupArgs: js.Array[Any]
  
  /**
    * This is useful for debugging individual tests allowing you to see
    * the raw output of the worker.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var workerData: js.UndefOr[Any] = js.undefined
  
  var workerId: Double
  
  var workerPath: String
}
object WorkerOptions2 {
  
  inline def apply(
    forkOptions: ForkOptions,
    maxRetries: Double,
    resourceLimits: ResourceLimits_,
    setupArgs: js.Array[Any],
    workerId: Double,
    workerPath: String
  ): WorkerOptions2 = {
    val __obj = js.Dynamic.literal(forkOptions = forkOptions.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], resourceLimits = resourceLimits.asInstanceOf[js.Any], setupArgs = setupArgs.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions2]
  }
  
  extension [Self <: WorkerOptions2](x: Self) {
    
    inline def setChildWorkerPath(value: String): Self = StObject.set(x, "childWorkerPath", value.asInstanceOf[js.Any])
    
    inline def setChildWorkerPathUndefined: Self = StObject.set(x, "childWorkerPath", js.undefined)
    
    inline def setForkOptions(value: ForkOptions): Self = StObject.set(x, "forkOptions", value.asInstanceOf[js.Any])
    
    inline def setIdleMemoryLimit(value: Double): Self = StObject.set(x, "idleMemoryLimit", value.asInstanceOf[js.Any])
    
    inline def setIdleMemoryLimitUndefined: Self = StObject.set(x, "idleMemoryLimit", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setOn(value: STATECHANGE): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setResourceLimits(value: ResourceLimits_): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
    
    inline def setSetupArgs(value: js.Array[Any]): Self = StObject.set(x, "setupArgs", value.asInstanceOf[js.Any])
    
    inline def setSetupArgsVarargs(value: Any*): Self = StObject.set(x, "setupArgs", js.Array(value*))
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setWorkerData(value: Any): Self = StObject.set(x, "workerData", value.asInstanceOf[js.Any])
    
    inline def setWorkerDataUndefined: Self = StObject.set(x, "workerData", js.undefined)
    
    inline def setWorkerId(value: Double): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
  }
}
