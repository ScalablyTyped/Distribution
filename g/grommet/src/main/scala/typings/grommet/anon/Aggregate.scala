package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregate extends js.Object {
  var aggregate: js.UndefOr[Boolean] = js.undefined
}

object Aggregate {
  @scala.inline
  def apply(aggregate: js.UndefOr[Boolean] = js.undefined): Aggregate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregate)) __obj.updateDynamic("aggregate")(aggregate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregate]
  }
}

