package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduce extends js.Object {
  var key: String
  var reduce: js.UndefOr[Boolean] = js.undefined
}

object Reduce {
  @scala.inline
  def apply(key: String, reduce: js.UndefOr[Boolean] = js.undefined): Reduce = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce)) __obj.updateDynamic("reduce")(reduce.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduce]
  }
}

