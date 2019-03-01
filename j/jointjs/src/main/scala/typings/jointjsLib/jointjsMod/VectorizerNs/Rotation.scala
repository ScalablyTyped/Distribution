package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rotation extends js.Object {
  var angle: scala.Double
  var cx: js.UndefOr[scala.Double] = js.undefined
  var cy: js.UndefOr[scala.Double] = js.undefined
}

object Rotation {
  @scala.inline
  def apply(angle: scala.Double, cx: scala.Int | scala.Double = null, cy: scala.Int | scala.Double = null): Rotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angle")(angle)
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
}

