package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  // the term with which to search.
  var limit: js.UndefOr[Double] = js.undefined
  var term: String
}

object AnonLimit {
  @scala.inline
  def apply(term: String, limit: Int | Double = null): AnonLimit = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
}

