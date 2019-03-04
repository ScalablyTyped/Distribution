package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Unshift[T]
  extends _ArraySpec[T, js.Any] {
  @JSName("$unshift")
  var $unshift: js.Array[T]
}

object Anon_Unshift {
  @scala.inline
  def apply[T]($unshift: js.Array[T]): Anon_Unshift[T] = {
    val __obj = js.Dynamic.literal($unshift = $unshift)
  
    __obj.asInstanceOf[Anon_Unshift[T]]
  }
}

