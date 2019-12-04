package typings.jestDashWorker.buildBaseBaseWorkerPoolMod

import typings.jestDashWorker.buildTypesMod.WorkerInterface
import typings.jestDashWorker.buildTypesMod.WorkerOptions
import typings.jestDashWorker.buildTypesMod.WorkerPoolOptions
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWorkerPool extends js.Object {
  val _options: WorkerPoolOptions
  val _stderr: js.Any
  val _stdout: js.Any
  val _workers: js.Any
  def createWorker(_workerOptions: WorkerOptions): WorkerInterface
  def end(): Unit
  def getStderr(): ReadableStream
  def getStdout(): ReadableStream
  def getWorkerById(workerId: Double): WorkerInterface
  def getWorkers(): js.Array[WorkerInterface]
}

object BaseWorkerPool {
  @scala.inline
  def apply(
    _options: WorkerPoolOptions,
    _stderr: js.Any,
    _stdout: js.Any,
    _workers: js.Any,
    createWorker: WorkerOptions => WorkerInterface,
    end: () => Unit,
    getStderr: () => ReadableStream,
    getStdout: () => ReadableStream,
    getWorkerById: Double => WorkerInterface,
    getWorkers: () => js.Array[WorkerInterface]
  ): BaseWorkerPool = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], _stderr = _stderr.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any], _workers = _workers.asInstanceOf[js.Any], createWorker = js.Any.fromFunction1(createWorker), end = js.Any.fromFunction0(end), getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkerById = js.Any.fromFunction1(getWorkerById), getWorkers = js.Any.fromFunction0(getWorkers))
  
    __obj.asInstanceOf[BaseWorkerPool]
  }
}

