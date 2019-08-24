package typings.jestDashWorker.buildTypesMod

import typings.node.childUnderscoreProcessMod.ForkOptions
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
    val __obj = js.Dynamic.literal(forkOptions = forkOptions, maxRetries = maxRetries, setupArgs = setupArgs, workerId = workerId, workerPath = workerPath)
  
    __obj.asInstanceOf[WorkerOptions]
  }
}

