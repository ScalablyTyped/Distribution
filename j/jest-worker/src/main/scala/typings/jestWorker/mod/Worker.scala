package typings.jestWorker.mod

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Jest farm (publicly called "Worker") is a class that allows you to queue
  * methods across multiple child processes, in order to parallelize work. This
  * is done by providing an absolute path to a module that will be loaded on each
  * of the child processes, and bridged to the main process.
  *
  * Bridged methods are specified by using the "exposedMethods" property of the
  * "options" object. This is an array of strings, where each of them corresponds
  * to the exported name in the loaded module.
  *
  * You can also control the amount of workers by using the "numWorkers" property
  * of the "options" object, and the settings passed to fork the process through
  * the "forkOptions" property. The amount of workers defaults to the amount of
  * CPUS minus one.
  *
  * Queueing calls can be done in two ways:
  *   - Standard method: calls will be redirected to the first available worker,
  *     so they will get executed as soon as they can.
  *
  *   - Sticky method: if a "computeWorkerKey" method is provided within the
  *     config, the resulting string of this method will be used as a key.
  *     Every time this key is returned, it is guaranteed that your job will be
  *     processed by the same worker. This is specially useful if your workers
  *     are caching results.
  */
@JSImport("jest-worker", "Worker")
@js.native
open class Worker protected ()
  extends StObject
     with Worker2 {
  def this(workerPath: String) = this()
  def this(workerPath: String, options: WorkerFarmOptions) = this()
  
  /* private */ /* CompleteClass */
  var _bindExposedWorkerMethods: Any = js.native
  
  /* private */ /* CompleteClass */
  var _callFunctionWithArgs: Any = js.native
  
  /* private */ /* CompleteClass */
  var _ending: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _farm: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _options: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _workerPool: Any = js.native
  
  /* CompleteClass */
  override def end(): js.Promise[PoolExitResult] = js.native
  
  /* CompleteClass */
  override def getStderr(): ReadableStream = js.native
  
  /* CompleteClass */
  override def getStdout(): ReadableStream = js.native
}
