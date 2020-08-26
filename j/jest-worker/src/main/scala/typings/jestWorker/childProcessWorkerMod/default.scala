package typings.jestWorker.childProcessWorkerMod

import typings.jestWorker.typesMod.WorkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-worker/build/workers/ChildProcessWorker", JSImport.Default)
@js.native
class default protected () extends ChildProcessWorker {
  def this(options: WorkerOptions) = this()
}

