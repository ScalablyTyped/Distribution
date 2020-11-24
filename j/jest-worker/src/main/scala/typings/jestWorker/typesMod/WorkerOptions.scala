package typings.jestWorker.typesMod

import typings.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerOptions extends js.Object {
  
  var forkOptions: ForkOptions = js.native
  
  var maxRetries: Double = js.native
  
  var setupArgs: js.Array[_] = js.native
  
  var workerId: Double = js.native
  
  var workerPath: String = js.native
}
object WorkerOptions {
  
  @scala.inline
  def apply(
    forkOptions: ForkOptions,
    maxRetries: Double,
    setupArgs: js.Array[_],
    workerId: Double,
    workerPath: String
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal(forkOptions = forkOptions.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], setupArgs = setupArgs.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
  
  @scala.inline
  implicit class WorkerOptionsOps[Self <: WorkerOptions] (val x: Self) extends AnyVal {
    
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
    def setForkOptions(value: ForkOptions): Self = this.set("forkOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupArgsVarargs(value: js.Any*): Self = this.set("setupArgs", js.Array(value :_*))
    
    @scala.inline
    def setSetupArgs(value: js.Array[_]): Self = this.set("setupArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerId(value: Double): Self = this.set("workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerPath(value: String): Self = this.set("workerPath", value.asInstanceOf[js.Any])
  }
}
