package typings.gulpDashTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Character extends js.Object {
  var character: Double
  var line: Double
  var position: Double
}

object Anon_Character {
  @scala.inline
  def apply(character: Double, line: Double, position: Double): Anon_Character = {
    val __obj = js.Dynamic.literal(character = character, line = line, position = position)
  
    __obj.asInstanceOf[Anon_Character]
  }
}

