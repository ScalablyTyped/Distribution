package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  var dataSource: String | js.Any
  var public: js.UndefOr[Boolean] = js.undefined
  var relations: js.UndefOr[js.Any] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(dataSource: String | js.Any, public: js.UndefOr[Boolean] = js.undefined, relations: js.Any = null): DataSource = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.get.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

