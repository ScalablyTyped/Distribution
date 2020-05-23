package typings.lobibox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Width extends js.Object {
  var width: js.UndefOr[Double] = js.undefined
}

object Width {
  @scala.inline
  def apply(width: js.UndefOr[Double] = js.undefined): Width = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
}

