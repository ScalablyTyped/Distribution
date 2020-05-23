package typings.jstimezonedetect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  def name(): String
}

object Name {
  @scala.inline
  def apply(name: () => String): Name = {
    val __obj = js.Dynamic.literal(name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[Name]
  }
}

