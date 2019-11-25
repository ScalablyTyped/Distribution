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
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], circles = circles.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], crescent = crescent.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.updateDynamic("lines-small")(`lines-small`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bubbles]
  }
}

