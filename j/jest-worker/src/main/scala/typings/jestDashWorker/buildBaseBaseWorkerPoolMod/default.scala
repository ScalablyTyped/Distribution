package typings.jestDashWorker.buildBaseBaseWorkerPoolMod

import typings.jestDashWorker.buildTypesMod.WorkerInterface
import typings.jestDashWorker.buildTypesMod.WorkerOptions
import typings.jestDashWorker.buildTypesMod.WorkerPoolOptions
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-worker/build/base/BaseWorkerPool", JSImport.Default)
@js.native
class default protected () extends BaseWorkerPool {
  def this(workerPath: String, options: WorkerPoolOptions) = this()
  /* CompleteClass */
  override val _options: WorkerPoolOptions = js.native
  /* CompleteClass */
  override val _stderr: js.Any = js.native
  /* CompleteClass */
  override val _stdout: js.Any = js.native
  /* CompleteClass */
  override val _workers: js.Any = js.native
  /* CompleteClass */
  override def createWorker(_workerOptions: WorkerOptions): WorkerInterface = js.native
  /* CompleteClass */
  override def end(): Unit = js.native
  /* CompleteClass */
  override def getStderr(): ReadableStream = js.native
  /* CompleteClass */
  override def getStdout(): ReadableStream = js.native
  /* CompleteClass */
  override def getWorkerById(workerId: Double): WorkerInterface = js.native
  /* CompleteClass */
  override def getWorkers(): js.Array[WorkerInterface] = js.native
}

