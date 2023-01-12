package typings.jestWorker.mod

import typings.node.childProcessMod.ForkOptions
import typings.node.workerThreadsMod.ResourceLimits_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerPoolOptions extends StObject {
  
  var enableWorkerThreads: Boolean
  
  var forkOptions: ForkOptions
  
  var idleMemoryLimit: js.UndefOr[Double] = js.undefined
  
  var maxRetries: Double
  
  var numWorkers: Double
  
  var resourceLimits: ResourceLimits_
  
  var setupArgs: js.Array[Any]
}
object WorkerPoolOptions {
  
  inline def apply(
    enableWorkerThreads: Boolean,
    forkOptions: ForkOptions,
    maxRetries: Double,
    numWorkers: Double,
    resourceLimits: ResourceLimits_,
    setupArgs: js.Array[Any]
  ): WorkerPoolOptions = {
    val __obj = js.Dynamic.literal(enableWorkerThreads = enableWorkerThreads.asInstanceOf[js.Any], forkOptions = forkOptions.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], numWorkers = numWorkers.asInstanceOf[js.Any], resourceLimits = resourceLimits.asInstanceOf[js.Any], setupArgs = setupArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerPoolOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerPoolOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableWorkerThreads(value: Boolean): Self = StObject.set(x, "enableWorkerThreads", value.asInstanceOf[js.Any])
    
    inline def setForkOptions(value: ForkOptions): Self = StObject.set(x, "forkOptions", value.asInstanceOf[js.Any])
    
    inline def setIdleMemoryLimit(value: Double): Self = StObject.set(x, "idleMemoryLimit", value.asInstanceOf[js.Any])
    
    inline def setIdleMemoryLimitUndefined: Self = StObject.set(x, "idleMemoryLimit", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    inline def setResourceLimits(value: ResourceLimits_): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
    
    inline def setSetupArgs(value: js.Array[Any]): Self = StObject.set(x, "setupArgs", value.asInstanceOf[js.Any])
    
    inline def setSetupArgsVarargs(value: Any*): Self = StObject.set(x, "setupArgs", js.Array(value*))
  }
}
