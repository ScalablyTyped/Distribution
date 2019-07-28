package typings.immutabilityDashHelper

import typings.immutabilityDashHelper.immutabilityDashHelperMod._ObjectSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Toggle[T]
  extends _ObjectSpec[T, js.Any] {
  @JSName("$toggle")
  var $toggle: js.Array[String]
}

object Anon_Toggle {
  @scala.inline
  def apply[T]($toggle: js.Array[String]): Anon_Toggle[T] = {
    val __obj = js.Dynamic.literal($toggle = $toggle)
  
    __obj.asInstanceOf[Anon_Toggle[T]]
  }
}

