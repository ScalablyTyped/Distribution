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
  def apply(
    isSet: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String]
  ): ISettings = {
    val __obj = js.Dynamic.literal(isSet = isSet, reset = reset, toString = toString)
  
    __obj.asInstanceOf[ISettings]
  }
}

