package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Merge[T]
  extends immutabilityDashHelperLib.immutabilityDashHelperMod._ObjectSpec[T, js.Any] {
  @JSName("$merge")
  var $merge: stdLib.Partial[T]
}

object Anon_Merge {
  @scala.inline
  def apply[T]($merge: stdLib.Partial[T]): Anon_Merge[T] = {
    val __obj = js.Dynamic.literal($merge = $merge)
  
    __obj.asInstanceOf[Anon_Merge[T]]
  }
}

