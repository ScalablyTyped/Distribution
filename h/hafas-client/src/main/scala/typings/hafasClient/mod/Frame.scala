package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var destination: Stop | Location
  var origin: Stop | Location
  var t: js.UndefOr[Double] = js.undefined
}

object Frame {
  @scala.inline
  def apply(destination: Stop | Location, origin: Stop | Location, t: js.UndefOr[Double] = js.undefined): Frame = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    if (!js.isUndefined(t)) __obj.updateDynamic("t")(t.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

