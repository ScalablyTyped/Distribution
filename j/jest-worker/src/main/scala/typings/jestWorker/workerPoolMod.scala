package typings.jestWorker

import typings.jestWorker.typesMod.WorkerInterface
import typings.jestWorker.typesMod.WorkerOptions
import typings.jestWorker.typesMod.WorkerPoolInterface
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerPoolMod {
  
  @JSImport("jest-worker/build/WorkerPool", JSImport.Default)
  @js.native
  class default () extends WorkerPool
  
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
}
