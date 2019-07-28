package typings.immutabilityDashHelper

import typings.immutabilityDashHelper.immutabilityDashHelperMod._ObjectSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Unset[T]
  extends _ObjectSpec[T, js.Any] {
  @JSName("$unset")
  var $unset: js.Array[String]
}

object Anon_Unset {
  @scala.inline
  def apply[T]($unset: js.Array[String]): Anon_Unset[T] = {
    val __obj = js.Dynamic.literal($unset = $unset)
  
    __obj.asInstanceOf[Anon_Unset[T]]
  }
}

