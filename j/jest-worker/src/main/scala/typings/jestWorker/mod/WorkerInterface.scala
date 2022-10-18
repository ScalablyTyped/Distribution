package typings.jestWorker.mod

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerInterface extends StObject {
  
  def forceExit(): Unit = js.native
  
  def getMemoryUsage(): js.Promise[Double | Null] = js.native
  
  def getStderr(): ReadableStream | Null = js.native
  
  def getStdout(): ReadableStream | Null = js.native
  
  def getWorkerId(): Double = js.native
  
  /**
    * Some system level identifier for the worker. IE, process id, thread id, etc.
    */
  def getWorkerSystemId(): Double = js.native
  
  /**
    * Checks to see if the child worker is actually running.
    */
  def isWorkerRunning(): Boolean = js.native
  
  def send(
    request: ChildMessage,
    onProcessStart: OnStart,
    onProcessEnd: OnEnd,
    onCustomMessage: OnCustomMessage
  ): Unit = js.native
  
  def state: WorkerStates = js.native
  
  def waitForExit(): js.Promise[Unit] = js.native
  
  /**
    * When the worker child is started and ready to start handling requests.
    *
    * @remarks
    * This mostly exists to help with testing so that you don't check the status
    * of things like isWorkerRunning before it actually is.
    */
  def waitForWorkerReady(): js.Promise[Unit] = js.native
}
