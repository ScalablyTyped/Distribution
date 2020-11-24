package typings.jestWorker.baseWorkerPoolMod

import typings.jestWorker.typesMod.WorkerPoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-worker/build/base/BaseWorkerPool", JSImport.Default)
@js.native
class default protected () extends BaseWorkerPool {
  def this(workerPath: String, options: WorkerPoolOptions) = this()
}
