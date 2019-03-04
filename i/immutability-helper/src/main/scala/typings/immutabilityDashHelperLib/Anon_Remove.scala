package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Remove[K]
  extends MapSpec[K, js.Any] {
  @JSName("$remove")
  var $remove: js.Array[K]
}

object Anon_Remove {
  @scala.inline
  def apply[K]($remove: js.Array[K]): Anon_Remove[K] = {
    val __obj = js.Dynamic.literal($remove = $remove)
  
    __obj.asInstanceOf[Anon_Remove[K]]
  }
}

