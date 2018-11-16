package typings
package lassoLib.lassoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso", "transforms")
@js.native
object transformsNs extends js.Object {
  def createTransformer(
    unfilteredTransforms: js.Array[_],
    lassoContext: lassoLib.libLassoContextMod.default,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], _]
  ): scala.Unit = js.native
}

