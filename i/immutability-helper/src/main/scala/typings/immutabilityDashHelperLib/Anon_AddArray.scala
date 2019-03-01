package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddArray[T] extends SetSpec[T] {
  @JSName("$add")
  var $add: js.Array[T]
}

object Anon_AddArray {
  @scala.inline
  def apply[T]($add: js.Array[T]): Anon_AddArray[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$add")($add)
    __obj.asInstanceOf[Anon_AddArray[T]]
  }
}

