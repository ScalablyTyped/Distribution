package typings.hardSourceWebpackPlugin.mod.ParallelModulePlugin

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fork: js.UndefOr[
    js.Function3[/* fork */ forkFn, /* compiler */ Compiler_, /* webpackBin */ String, Unit]
  ] = js.undefined
  var minModules: js.UndefOr[Double] = js.undefined
  var numWorkers: js.UndefOr[Double | js.Function0[Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fork: (/* fork */ forkFn, /* compiler */ Compiler_, /* webpackBin */ String) => Unit = null,
    minModules: js.UndefOr[Double] = js.undefined,
    numWorkers: Double | js.Function0[Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fork != null) __obj.updateDynamic("fork")(js.Any.fromFunction3(fork))
    if (!js.isUndefined(minModules)) __obj.updateDynamic("minModules")(minModules.get.asInstanceOf[js.Any])
    if (numWorkers != null) __obj.updateDynamic("numWorkers")(numWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

