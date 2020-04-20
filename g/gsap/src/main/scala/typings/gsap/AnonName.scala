package typings.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var time: Double
}

object AnonName {
  @scala.inline
  def apply(name: String, time: Double): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

