package typings
package leakageLib.leakageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leakage", "iterate")
@js.native
object iterateNs extends js.Object {
  def async(iteratorFn: js.Function0[stdLib.Promise[scala.Unit]]): stdLib.Promise[leakageLib.leakageMod.Result] = js.native
  def async(
    iteratorFn: js.Function0[stdLib.Promise[scala.Unit]],
    options: leakageLib.leakageMod.IterateOptions
  ): stdLib.Promise[leakageLib.leakageMod.Result] = js.native
}

