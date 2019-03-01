package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Set[T]
  extends immutabilityDashHelperLib.immutabilityDashHelperMod._Spec[T, js.Any] {
  @JSName("$set")
  var $set: T
}

object Anon_Set {
  @scala.inline
  def apply[T]($set: T): Anon_Set[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$set")($set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Set[T]]
  }
}

