package typings.koaMulter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  /** Optional maximum number of files per field to accept. */
  var maxCount: js.UndefOr[Double] = js.undefined
  /** The field name. */
  var name: String
}

object Field {
  @scala.inline
  def apply(name: String, maxCount: js.UndefOr[Double] = js.undefined): Field = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(maxCount)) __obj.updateDynamic("maxCount")(maxCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

