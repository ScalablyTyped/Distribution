package typings.jestWorker.typesMod

import typings.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerPoolOptions extends js.Object {
  
  var enableWorkerThreads: Boolean = js.native
  
  var forkOptions: ForkOptions = js.native
  
  var maxRetries: Double = js.native
  
  var numWorkers: Double = js.native
  
  var setupArgs: js.Array[_] = js.native
}
object WorkerPoolOptions {
  
  @scala.inline
  def apply(
    enableWorkerThreads: Boolean,
    forkOptions: ForkOptions,
    maxRetries: Double,
    numWorkers: Double,
    setupArgs: js.Array[_]
  ): WorkerPoolOptions = {
    val __obj = js.Dynamic.literal(enableWorkerThreads = enableWorkerThreads.asInstanceOf[js.Any], forkOptions = forkOptions.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], numWorkers = numWorkers.asInstanceOf[js.Any], setupArgs = setupArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerPoolOptions]
  }
  
  @scala.inline
  implicit class WorkerPoolOptionsOps[Self <: WorkerPoolOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableWorkerThreads(value: Boolean): Self = this.set("enableWorkerThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForkOptions(value: ForkOptions): Self = this.set("forkOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumWorkers(value: Double): Self = this.set("numWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupArgsVarargs(value: js.Any*): Self = this.set("setupArgs", js.Array(value :_*))
    
    @scala.inline
    def setSetupArgs(value: js.Array[_]): Self = this.set("setupArgs", value.asInstanceOf[js.Any])
  }
}
