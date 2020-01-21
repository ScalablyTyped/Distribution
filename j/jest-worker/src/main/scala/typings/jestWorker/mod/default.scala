package typings.jestWorker.mod

import typings.jestWorker.typesMod.FarmOptions
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-worker", JSImport.Default)
@js.native
class default protected () extends JestWorker {
  def this(workerPath: String) = this()
  def this(workerPath: String, options: FarmOptions) = this()
  /* CompleteClass */
  override var _bindExposedWorkerMethods: js.Any = js.native
  /* CompleteClass */
  override var _callFunctionWithArgs: js.Any = js.native
  /* CompleteClass */
  override var _ending: js.Any = js.native
  /* CompleteClass */
  override var _farm: js.Any = js.native
  /* CompleteClass */
  override var _options: js.Any = js.native
  /* CompleteClass */
  override var _workerPool: js.Any = js.native
  /* CompleteClass */
  override def end(): Unit = js.native
  /* CompleteClass */
  override def getStderr(): ReadableStream = js.native
  /* CompleteClass */
  override def getStdout(): ReadableStream = js.native
}

