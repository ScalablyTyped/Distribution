package typings
package immutabilityDashHelperLib.immutabilityDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutability-helper", "Context")
@js.native
class Context () extends js.Object {
  var commands: js.Any = js.native
  def extend[T](directive: java.lang.String, fn: js.Function2[/* param */ js.Any, /* old */ T, T]): scala.Unit = js.native
  def isEquals(x: js.Any, y: js.Any): scala.Boolean = js.native
  def update[T, C /* <: CustomCommands[js.Object] */](`object`: T, $spec: Spec[T, C]): T = js.native
}

