package typings.jestWorker.typesMod

import typings.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerPoolOptions extends js.Object {
  var enableWorkerThreads: Boolean
  var forkOptions: ForkOptions
  var maxRetries: Double
  var numWorkers: Double
  var setupArgs: js.Array[_]
}

object WorkerPoolOptions {
  @scala.inline
  def apply(
    enableWorkerThreads: Boolean,
    forkOptions: ForkOptions,
    maxRetries: Double,
    numWorkers: Double,
    setupArgs: js.Array[_]
  ): WorkerPoolOptions = {
    val __obj = js.Dynamic.literal(enableWorkerThreads = enableWorkerThreads.asInstanceOf[js.Any], forkOptions = forkOptions.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], numWorkers = numWorkers.asInstanceOf[js.Any], setupArgs = setupArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerPoolOptions]
  }
}

