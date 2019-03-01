package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add[K, V] extends MapSpec[K, V] {
  @JSName("$add")
  var $add: js.Array[js.Tuple2[K, V]]
}

object Anon_Add {
  @scala.inline
  def apply[K, V]($add: js.Array[js.Tuple2[K, V]]): Anon_Add[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$add")($add)
    __obj.asInstanceOf[Anon_Add[K, V]]
  }
}

