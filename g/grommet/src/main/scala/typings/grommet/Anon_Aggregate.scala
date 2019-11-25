package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aggregate extends js.Object {
  var aggregate: js.UndefOr[Boolean] = js.undefined
}

object Anon_Aggregate {
  @scala.inline
  def apply(aggregate: js.UndefOr[Boolean] = js.undefined): Anon_Aggregate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregate)) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Aggregate]
  }
}

