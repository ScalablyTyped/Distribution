package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Push[T]
  extends _ArraySpec[T, js.Any] {
  @JSName("$push")
  var $push: js.Array[T]
}

object Anon_Push {
  @scala.inline
  def apply[T]($push: js.Array[T]): Anon_Push[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$push")($push)
    __obj.asInstanceOf[Anon_Push[T]]
  }
}

