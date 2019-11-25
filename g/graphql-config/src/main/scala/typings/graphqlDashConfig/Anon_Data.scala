package typings.graphqlDashConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[scala.Nothing] = js.undefined
  var errors: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: js.UndefOr[scala.Nothing] = js.undefined, errors: js.UndefOr[scala.Nothing] = js.undefined): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

