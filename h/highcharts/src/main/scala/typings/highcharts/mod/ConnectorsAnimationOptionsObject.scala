package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsAnimationOptionsObject extends js.Object {
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object ConnectorsAnimationOptionsObject {
  @scala.inline
  def apply(reversed: js.UndefOr[Boolean] = js.undefined): ConnectorsAnimationOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsAnimationOptionsObject]
  }
}

