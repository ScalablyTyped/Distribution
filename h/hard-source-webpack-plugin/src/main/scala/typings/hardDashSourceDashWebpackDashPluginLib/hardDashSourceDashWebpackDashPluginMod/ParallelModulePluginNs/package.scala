package typings
package hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ParallelModulePluginNs {
  // NOTE: not using `Parameters` and `ReturnType` on purpose to compatibility. better of code this below.
  //     type forkFn = (...args: Parameters<typeof fork>) => ReturnType<typeof fork>
  // this code working on supported versions of `infer` keyword (version 2.8 higher.
  type forkFn = js.Function3[
    /* modulePath */ java.lang.String, 
    /* args */ js.UndefOr[js.Array[java.lang.String]], 
    /* options */ js.UndefOr[nodeLib.childUnderscoreProcessMod.ForkOptions], 
    nodeLib.childUnderscoreProcessMod.ChildProcess
  ]
}
