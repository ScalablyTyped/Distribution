package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataSource extends js.Object {
  var dataSource: String | js.Any
  var public: js.UndefOr[Boolean] = js.undefined
  var relations: js.UndefOr[js.Any] = js.undefined
}

object AnonDataSource {
  @scala.inline
  def apply(dataSource: String | js.Any, public: js.UndefOr[Boolean] = js.undefined, relations: js.Any = null): AnonDataSource = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataSource]
  }
}

