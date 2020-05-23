package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  // the term with which to search.
  var limit: js.UndefOr[Double] = js.undefined
  var term: String
}

object Limit {
  @scala.inline
  def apply(term: String, limit: js.UndefOr[Double] = js.undefined): Limit = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

