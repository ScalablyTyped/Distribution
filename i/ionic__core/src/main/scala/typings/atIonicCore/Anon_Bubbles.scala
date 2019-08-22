package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bubbles extends js.Object {
  var bubbles: Anon_Circles
  var circles: Anon_Circles
  var circular: Anon_CirclesDur
  var crescent: Anon_CirclesDurFn
  var dots: Anon_
  var lines: Anon_Dur
  var `lines-small`: Anon_Dur
}

object Anon_Bubbles {
  @scala.inline
  def apply(
    bubbles: Anon_Circles,
    circles: Anon_Circles,
    circular: Anon_CirclesDur,
    crescent: Anon_CirclesDurFn,
    dots: Anon_,
    lines: Anon_Dur,
    `lines-small`: Anon_Dur
  ): Anon_Bubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, circles = circles, circular = circular, crescent = crescent, dots = dots, lines = lines)
    __obj.updateDynamic("lines-small")(`lines-small`)
    __obj.asInstanceOf[Anon_Bubbles]
  }
}

