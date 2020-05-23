package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var reduce: js.UndefOr[Boolean] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: String, reduce: js.UndefOr[Boolean] = js.undefined): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce)) __obj.updateDynamic("reduce")(reduce.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

