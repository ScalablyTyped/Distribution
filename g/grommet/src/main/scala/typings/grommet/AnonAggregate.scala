package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAggregate extends js.Object {
  var aggregate: js.UndefOr[Boolean] = js.undefined
}

object AnonAggregate {
  @scala.inline
  def apply(aggregate: js.UndefOr[Boolean] = js.undefined): AnonAggregate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregate)) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAggregate]
  }
}

