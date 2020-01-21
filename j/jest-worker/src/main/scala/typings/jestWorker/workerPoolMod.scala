package typings.jestWorker

import typings.jestWorker.typesMod.ChildMessage
import typings.jestWorker.typesMod.OnEnd
import typings.jestWorker.typesMod.OnStart
import typings.jestWorker.typesMod.WorkerInterface
import typings.jestWorker.typesMod.WorkerOptions
import typings.jestWorker.typesMod.WorkerPoolInterface
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-worker/build/WorkerPool", JSImport.Namespace)
@js.native
object workerPoolMod extends js.Object {
  @js.native
  trait WorkerPool
    extends typings.jestWorker.baseWorkerPoolMod.default
       with WorkerPoolInterface {
    /* InferMemberOverrides */
    override def createWorker(_workerOptions: WorkerOptions): WorkerInterface = js.native
    /* InferMemberOverrides */
    override def end(): Unit = js.native
    /* InferMemberOverrides */
    override def getStderr(): ReadableStream = js.native
    /* InferMemberOverrides */
    override def getStdout(): ReadableStream = js.native
    /* InferMemberOverrides */
    override def getWorkers(): js.Array[WorkerInterface] = js.native
  }
  
  @js.native
  class default () extends WorkerPool {
    /* CompleteClass */
    override def createWorker(options: WorkerOptions): WorkerInterface = js.native
    /* CompleteClass */
    override def end(): Unit = js.native
    /* CompleteClass */
    override def getStderr(): ReadableStream = js.native
    /* CompleteClass */
    override def getStdout(): ReadableStream = js.native
    /* CompleteClass */
    override def getWorkers(): js.Array[WorkerInterface] = js.native
    /* CompleteClass */
    override def send(workerId: Double, request: ChildMessage, onStart: OnStart, onEnd: OnEnd): Unit = js.native
  }
  
}

