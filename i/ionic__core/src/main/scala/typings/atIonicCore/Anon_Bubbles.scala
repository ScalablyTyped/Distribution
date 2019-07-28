package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bubbles extends js.Object {
  var bubbles: Anon_Circles
  var circles: Anon_Circles
  var crescent: Anon_CirclesDur
  var dots: Anon_
  var lines: Anon_Dur
  var `lines-small`: Anon_Dur
}

object Anon_Bubbles {
  @scala.inline
  def apply(
    bubbles: Anon_Circles,
    circles: Anon_Circles,
    crescent: Anon_CirclesDur,
    dots: Anon_,
    lines: Anon_Dur,
    `lines-small`: Anon_Dur
  ): Anon_Bubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, circles = circles, crescent = crescent, dots = dots, lines = lines)
    __obj.updateDynamic("lines-small")(`lines-small`)
    __obj.asInstanceOf[Anon_Bubbles]
  }
}

