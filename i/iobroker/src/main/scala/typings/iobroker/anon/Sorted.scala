package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sorted extends js.Object {
  var sorted: js.UndefOr[Boolean] = js.undefined
}

object Sorted {
  @scala.inline
  def apply(sorted: js.UndefOr[Boolean] = js.undefined): Sorted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sorted]
  }
}

