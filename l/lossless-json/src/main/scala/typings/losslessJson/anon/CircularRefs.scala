package typings.losslessJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularRefs extends js.Object {
  var circularRefs: js.UndefOr[Boolean] = js.undefined
}

object CircularRefs {
  @scala.inline
  def apply(circularRefs: js.UndefOr[Boolean] = js.undefined): CircularRefs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(circularRefs)) __obj.updateDynamic("circularRefs")(circularRefs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularRefs]
  }
}

