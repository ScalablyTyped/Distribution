package typings.jointjs.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rotation extends js.Object {
  var angle: Double
  var cx: js.UndefOr[Double] = js.undefined
  var cy: js.UndefOr[Double] = js.undefined
}

object Rotation {
  @scala.inline
  def apply(angle: Double, cx: Int | Double = null, cy: Int | Double = null): Rotation = {
    val __obj = js.Dynamic.literal(angle = angle)
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
}

