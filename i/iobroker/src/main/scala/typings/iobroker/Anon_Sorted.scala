package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sorted extends js.Object {
  var sorted: js.UndefOr[Boolean] = js.undefined
}

object Anon_Sorted {
  @scala.inline
  def apply(sorted: js.UndefOr[Boolean] = js.undefined): Anon_Sorted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Sorted]
  }
}

