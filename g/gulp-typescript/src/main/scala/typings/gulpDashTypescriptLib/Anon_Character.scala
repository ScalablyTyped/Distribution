package typings
package gulpDashTypescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Character extends js.Object {
  var character: scala.Double
  var line: scala.Double
  var position: scala.Double
}

object Anon_Character {
  @scala.inline
  def apply(character: scala.Double, line: scala.Double, position: scala.Double): Anon_Character = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("character")(character)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Character]
  }
}

