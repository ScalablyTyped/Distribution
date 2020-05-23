package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait All extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var tags: String | js.Array[String]
}

object All {
  @scala.inline
  def apply(tags: String | js.Array[String], all: js.UndefOr[Boolean] = js.undefined): All = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
}

