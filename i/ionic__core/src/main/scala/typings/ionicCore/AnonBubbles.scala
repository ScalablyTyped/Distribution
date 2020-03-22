package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBubbles extends js.Object {
  var bubbles: AnonCircles
  var circles: AnonCircles
  var circular: AnonDur
  var crescent: AnonFn
  var dots: AnonCirclesDur
  var lines: AnonLines
  var `lines-small`: AnonLines
}

object AnonBubbles {
  @scala.inline
  def apply(
    bubbles: AnonCircles,
    circles: AnonCircles,
    circular: AnonDur,
    crescent: AnonFn,
    dots: AnonCirclesDur,
    lines: AnonLines,
    `lines-small`: AnonLines
  ): AnonBubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], circles = circles.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], crescent = crescent.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.updateDynamic("lines-small")(`lines-small`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBubbles]
  }
}

