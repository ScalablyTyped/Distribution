package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAll extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var tags: String | js.Array[String]
}

object AnonAll {
  @scala.inline
  def apply(tags: String | js.Array[String], all: js.UndefOr[Boolean] = js.undefined): AnonAll = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAll]
  }
}

