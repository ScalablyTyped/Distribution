package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bubbles extends js.Object {
  var bubbles: Circles
  var circles: Circles
  var circular: Dur
  var crescent: Fn
  var dots: CirclesDur
  var lines: Lines
  var `lines-small`: Lines
}

object Bubbles {
  @scala.inline
  def apply(
    bubbles: Circles,
    circles: Circles,
    circular: Dur,
    crescent: Fn,
    dots: CirclesDur,
    lines: Lines,
    `lines-small`: Lines
  ): Bubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], circles = circles.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], crescent = crescent.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.updateDynamic("lines-small")(`lines-small`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bubbles]
  }
}

