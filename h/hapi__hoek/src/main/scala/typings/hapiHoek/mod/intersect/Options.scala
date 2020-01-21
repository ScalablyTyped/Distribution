package typings.hapiHoek.mod.intersect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When true, return the first overlapping value.
    *
    * @default false
    */
  val first: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(first: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

