package typings.jestWorker.typesMod

import typings.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FarmOptions extends js.Object {
  var WorkerPool: js.UndefOr[
    js.Function2[
      /* workerPath */ String, 
      /* options */ js.UndefOr[WorkerPoolOptions], 
      WorkerPoolInterface
    ]
  ] = js.undefined
  var computeWorkerKey: js.UndefOr[js.Function2[/* method */ String, /* repeated */ js.Any, String | Null]] = js.undefined
  var enableWorkerThreads: js.UndefOr[Boolean] = js.undefined
  var exposedMethods: js.UndefOr[js.Array[String]] = js.undefined
  var forkOptions: js.UndefOr[ForkOptions] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var numWorkers: js.UndefOr[Double] = js.undefined
  var setupArgs: js.UndefOr[js.Array[_]] = js.undefined
}

object FarmOptions {
  @scala.inline
  def apply(
    WorkerPool: (/* workerPath */ String, /* options */ js.UndefOr[WorkerPoolOptions]) => WorkerPoolInterface = null,
    computeWorkerKey: (/* method */ String, /* repeated */ js.Any) => String | Null = null,
    enableWorkerThreads: js.UndefOr[Boolean] = js.undefined,
    exposedMethods: js.Array[String] = null,
    forkOptions: ForkOptions = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    numWorkers: js.UndefOr[Double] = js.undefined,
    setupArgs: js.Array[_] = null
  ): FarmOptions = {
    val __obj = js.Dynamic.literal()
    if (WorkerPool != null) __obj.updateDynamic("WorkerPool")(js.Any.fromFunction2(WorkerPool))
    if (computeWorkerKey != null) __obj.updateDynamic("computeWorkerKey")(js.Any.fromFunction2(computeWorkerKey))
    if (!js.isUndefined(enableWorkerThreads)) __obj.updateDynamic("enableWorkerThreads")(enableWorkerThreads.get.asInstanceOf[js.Any])
    if (exposedMethods != null) __obj.updateDynamic("exposedMethods")(exposedMethods.asInstanceOf[js.Any])
    if (forkOptions != null) __obj.updateDynamic("forkOptions")(forkOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numWorkers)) __obj.updateDynamic("numWorkers")(numWorkers.get.asInstanceOf[js.Any])
    if (setupArgs != null) __obj.updateDynamic("setupArgs")(setupArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FarmOptions]
  }
}

