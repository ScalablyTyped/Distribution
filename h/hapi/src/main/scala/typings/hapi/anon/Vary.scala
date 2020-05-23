package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vary extends js.Object {
  var vary: Boolean
  var weak: Boolean
}

object Vary {
  @scala.inline
  def apply(vary: Boolean, weak: Boolean): Vary = {
    val __obj = js.Dynamic.literal(vary = vary.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vary]
  }
}

