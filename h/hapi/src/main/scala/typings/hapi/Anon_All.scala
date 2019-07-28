package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var tags: String | js.Array[String]
}

object Anon_All {
  @scala.inline
  def apply(tags: String | js.Array[String], all: js.UndefOr[Boolean] = js.undefined): Anon_All = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    __obj.asInstanceOf[Anon_All]
  }
}

