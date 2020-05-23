package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Immediate extends js.Object {
  var immediate: Boolean
}

object Immediate {
  @scala.inline
  def apply(immediate: Boolean): Immediate = {
    val __obj = js.Dynamic.literal(immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immediate]
  }
}

