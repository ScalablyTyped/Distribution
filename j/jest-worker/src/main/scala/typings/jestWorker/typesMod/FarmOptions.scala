package typings.jestWorker.typesMod

import typings.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FarmOptions extends js.Object {
  
  var WorkerPool: js.UndefOr[
    js.Function2[
      /* workerPath */ String, 
      /* options */ js.UndefOr[WorkerPoolOptions], 
      WorkerPoolInterface
    ]
  ] = js.native
  
  var computeWorkerKey: js.UndefOr[js.Function2[/* method */ String, /* repeated */ js.Any, String | Null]] = js.native
  
  var enableWorkerThreads: js.UndefOr[Boolean] = js.native
  
  var exposedMethods: js.UndefOr[js.Array[String]] = js.native
  
  var forkOptions: js.UndefOr[ForkOptions] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var numWorkers: js.UndefOr[Double] = js.native
  
  var setupArgs: js.UndefOr[js.Array[_]] = js.native
}
object FarmOptions {
  
  @scala.inline
  def apply(): FarmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FarmOptions]
  }
  
  @scala.inline
  implicit class FarmOptionsOps[Self <: FarmOptions] (val x: Self) extends AnyVal {
    
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
    def setWorkerPool(
      value: (/* workerPath */ String, /* options */ js.UndefOr[WorkerPoolOptions]) => WorkerPoolInterface
    ): Self = this.set("WorkerPool", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWorkerPool: Self = this.set("WorkerPool", js.undefined)
    
    @scala.inline
    def setComputeWorkerKey(value: (/* method */ String, /* repeated */ js.Any) => String | Null): Self = this.set("computeWorkerKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComputeWorkerKey: Self = this.set("computeWorkerKey", js.undefined)
    
    @scala.inline
    def setEnableWorkerThreads(value: Boolean): Self = this.set("enableWorkerThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableWorkerThreads: Self = this.set("enableWorkerThreads", js.undefined)
    
    @scala.inline
    def setExposedMethodsVarargs(value: String*): Self = this.set("exposedMethods", js.Array(value :_*))
    
    @scala.inline
    def setExposedMethods(value: js.Array[String]): Self = this.set("exposedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposedMethods: Self = this.set("exposedMethods", js.undefined)
    
    @scala.inline
    def setForkOptions(value: ForkOptions): Self = this.set("forkOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForkOptions: Self = this.set("forkOptions", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setNumWorkers(value: Double): Self = this.set("numWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumWorkers: Self = this.set("numWorkers", js.undefined)
    
    @scala.inline
    def setSetupArgsVarargs(value: js.Any*): Self = this.set("setupArgs", js.Array(value :_*))
    
    @scala.inline
    def setSetupArgs(value: js.Array[_]): Self = this.set("setupArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupArgs: Self = this.set("setupArgs", js.undefined)
  }
}
