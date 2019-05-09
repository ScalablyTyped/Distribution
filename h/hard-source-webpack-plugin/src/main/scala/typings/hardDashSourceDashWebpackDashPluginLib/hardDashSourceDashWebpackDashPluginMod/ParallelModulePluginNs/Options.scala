package typings
package hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginMod.ParallelModulePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fork: js.UndefOr[
    js.Function3[
      /* fork */ forkFn, 
      /* compiler */ webpackLib.webpackMod.Compiler, 
      /* webpackBin */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var minModules: js.UndefOr[scala.Double] = js.undefined
  var numWorkers: js.UndefOr[scala.Double | js.Function0[scala.Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fork: (/* fork */ forkFn, /* compiler */ webpackLib.webpackMod.Compiler, /* webpackBin */ java.lang.String) => scala.Unit = null,
    minModules: scala.Int | scala.Double = null,
    numWorkers: scala.Double | js.Function0[scala.Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fork != null) __obj.updateDynamic("fork")(js.Any.fromFunction3(fork))
    if (minModules != null) __obj.updateDynamic("minModules")(minModules.asInstanceOf[js.Any])
    if (numWorkers != null) __obj.updateDynamic("numWorkers")(numWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

