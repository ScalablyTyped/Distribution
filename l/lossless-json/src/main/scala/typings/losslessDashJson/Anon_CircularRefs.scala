package typings.losslessDashJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CircularRefs extends js.Object {
  var circularRefs: js.UndefOr[Boolean] = js.undefined
}

object Anon_CircularRefs {
  @scala.inline
  def apply(circularRefs: js.UndefOr[Boolean] = js.undefined): Anon_CircularRefs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(circularRefs)) __obj.updateDynamic("circularRefs")(circularRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CircularRefs]
  }
}

