package typings.immutabilityDashHelper.immutabilityDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutability-helper", "Context")
@js.native
class Context () extends js.Object {
  var commands: js.Any = js.native
  def extend[T](directive: String, fn: js.Function2[/* param */ js.Any, /* old */ T, T]): Unit = js.native
  def isEquals(x: js.Any, y: js.Any): Boolean = js.native
  def update[T, C /* <: CustomCommands[js.Object] */](`object`: T, $spec: Spec[T, C]): T = js.native
}

