package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplodeEffect extends js.Object {
  var pieces: js.UndefOr[scala.Double] = js.undefined
}

object ExplodeEffect {
  @scala.inline
  def apply(pieces: scala.Int | scala.Double = null): ExplodeEffect = {
    val __obj = js.Dynamic.literal()
    if (pieces != null) __obj.updateDynamic("pieces")(pieces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplodeEffect]
  }
}

