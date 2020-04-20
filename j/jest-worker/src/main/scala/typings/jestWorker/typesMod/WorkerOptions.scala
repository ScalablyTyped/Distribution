package typings.jestWorker.typesMod

import typings.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOptions extends js.Object {
  var forkOptions: ForkOptions
  var maxRetries: Double
  var setupArgs: js.Array[_]
  var workerId: Double
  var workerPath: String
}

object WorkerOptions {
  @scala.inline
  def apply(
    forkOptions: ForkOptions,
    maxRetries: Double,
    setupArgs: js.Array[_],
    workerId: Double,
    workerPath: String
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal(forkOptions = forkOptions.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], setupArgs = setupArgs.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
}

