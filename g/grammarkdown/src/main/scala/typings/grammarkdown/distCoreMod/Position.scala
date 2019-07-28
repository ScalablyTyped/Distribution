package typings.grammarkdown.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var character: Double
  var line: Double
}

object Position {
  @scala.inline
  def apply(character: Double, line: Double): Position = {
    val __obj = js.Dynamic.literal(character = character, line = line)
  
    __obj.asInstanceOf[Position]
  }
}

