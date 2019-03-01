package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoveArray[T] extends SetSpec[T] {
  @JSName("$remove")
  var $remove: js.Array[T]
}

object Anon_RemoveArray {
  @scala.inline
  def apply[T]($remove: js.Array[T]): Anon_RemoveArray[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$remove")($remove)
    __obj.asInstanceOf[Anon_RemoveArray[T]]
  }
}

