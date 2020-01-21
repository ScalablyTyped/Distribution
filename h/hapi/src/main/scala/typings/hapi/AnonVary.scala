package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVary extends js.Object {
  var vary: Boolean
  var weak: Boolean
}

object AnonVary {
  @scala.inline
  def apply(vary: Boolean, weak: Boolean): AnonVary = {
    val __obj = js.Dynamic.literal(vary = vary.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVary]
  }
}

