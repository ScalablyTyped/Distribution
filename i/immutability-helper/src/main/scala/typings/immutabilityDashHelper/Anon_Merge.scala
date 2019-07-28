package typings.immutabilityDashHelper

import typings.immutabilityDashHelper.immutabilityDashHelperMod._ObjectSpec
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Merge[T]
  extends _ObjectSpec[T, js.Any] {
  @JSName("$merge")
  var $merge: Partial[T]
}

object Anon_Merge {
  @scala.inline
  def apply[T]($merge: Partial[T]): Anon_Merge[T] = {
    val __obj = js.Dynamic.literal($merge = $merge)
  
    __obj.asInstanceOf[Anon_Merge[T]]
  }
}

