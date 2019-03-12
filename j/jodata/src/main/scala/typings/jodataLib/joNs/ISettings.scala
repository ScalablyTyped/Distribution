package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO What is the most appropriate place for these interfaces?
// They are only required by the `jo` class.
trait ISettings extends js.Object {
  def isSet(): scala.Boolean
  def reset(): scala.Unit
}

object ISettings {
  @scala.inline
  def apply(isSet: () => scala.Boolean, reset: () => scala.Unit, toString: () => java.lang.String): ISettings = {
    val __obj = js.Dynamic.literal(isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ISettings]
  }
}

