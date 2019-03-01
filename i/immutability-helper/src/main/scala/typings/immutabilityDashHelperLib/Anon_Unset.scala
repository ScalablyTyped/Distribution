package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Unset[T]
  extends _ObjectSpec[T, js.Any] {
  @JSName("$unset")
  var $unset: js.Array[java.lang.String]
}

object Anon_Unset {
  @scala.inline
  def apply[T]($unset: js.Array[java.lang.String]): Anon_Unset[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$unset")($unset)
    __obj.asInstanceOf[Anon_Unset[T]]
  }
}

