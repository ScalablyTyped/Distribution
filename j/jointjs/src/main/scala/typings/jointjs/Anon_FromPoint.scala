package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromPoint extends js.Object {
  var fromPoint: js.UndefOr[Boolean] = js.undefined
}

object Anon_FromPoint {
  @scala.inline
  def apply(fromPoint: js.UndefOr[Boolean] = js.undefined): Anon_FromPoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fromPoint)) __obj.updateDynamic("fromPoint")(fromPoint)
    __obj.asInstanceOf[Anon_FromPoint]
  }
}

