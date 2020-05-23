package typings.gsap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var time: Double
}

object Name {
  @scala.inline
  def apply(name: String, time: Double): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

