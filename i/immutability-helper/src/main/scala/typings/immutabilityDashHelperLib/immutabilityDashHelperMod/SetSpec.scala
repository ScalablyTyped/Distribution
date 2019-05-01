package typings
package immutabilityDashHelperLib.immutabilityDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSpec[T] extends js.Object {
  @JSName("$add")
  var $add: js.UndefOr[js.Array[T]] = js.undefined
  @JSName("$remove")
  var $remove: js.UndefOr[js.Array[T]] = js.undefined
}

object SetSpec {
  @scala.inline
  def apply[T]($add: js.Array[T] = null, $remove: js.Array[T] = null): SetSpec[T] = {
    val __obj = js.Dynamic.literal()
    if ($add != null) __obj.updateDynamic("$add")($add)
    if ($remove != null) __obj.updateDynamic("$remove")($remove)
    __obj.asInstanceOf[SetSpec[T]]
  }
}

