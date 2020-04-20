package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO What is the most appropriate place for these interfaces?
// They are only required by the `jo` class.
trait ISettings extends js.Object {
  def isSet(): Boolean
  def reset(): Unit
}

object ISettings {
  @scala.inline
  def apply(isSet: () => Boolean, reset: () => Unit): ISettings = {
    val __obj = js.Dynamic.literal(isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ISettings]
  }
}

