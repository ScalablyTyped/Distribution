package typings
package immutabilityDashHelperLib.immutabilityDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapSpec[K, V] extends js.Object {
  @JSName("$add")
  var $add: js.UndefOr[js.Array[js.Tuple2[K, V]]] = js.undefined
  @JSName("$remove")
  var $remove: js.UndefOr[js.Array[K]] = js.undefined
}

object MapSpec {
  @scala.inline
  def apply[K, V]($add: js.Array[js.Tuple2[K, V]] = null, $remove: js.Array[K] = null): MapSpec[K, V] = {
    val __obj = js.Dynamic.literal()
    if ($add != null) __obj.updateDynamic("$add")($add)
    if ($remove != null) __obj.updateDynamic("$remove")($remove)
    __obj.asInstanceOf[MapSpec[K, V]]
  }
}

