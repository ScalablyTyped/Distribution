package typings.jstimezonedetect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  def name(): String
}

object AnonName {
  @scala.inline
  def apply(name: () => String): AnonName = {
    val __obj = js.Dynamic.literal(name = js.Any.fromFunction0(name))
  
    __obj.asInstanceOf[AnonName]
  }
}

