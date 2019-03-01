package typings
package grammarkdownLib.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var character: scala.Double
  var line: scala.Double
}

object Position {
  @scala.inline
  def apply(character: scala.Double, line: scala.Double): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("character")(character)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[Position]
  }
}

