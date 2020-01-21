package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBubbles extends js.Object {
  var bubbles: AnonCircles
  var circles: AnonCircles
  var circular: AnonCirclesDur
  var crescent: AnonCirclesDurFn
  var dots: Anon
  var lines: AnonDur
  var `lines-small`: AnonDur
}

object AnonBubbles {
  @scala.inline
  def apply(
    bubbles: AnonCircles,
    circles: AnonCircles,
    circular: AnonCirclesDur,
    crescent: AnonCirclesDurFn,
    dots: Anon,
    lines: AnonDur,
    `lines-small`: AnonDur
  ): AnonBubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], circles = circles.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], crescent = crescent.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.updateDynamic("lines-small")(`lines-small`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBubbles]
  }
}

