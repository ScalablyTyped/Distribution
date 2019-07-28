package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSource extends js.Object {
  var dataSource: String | js.Any
  var public: js.UndefOr[Boolean] = js.undefined
  var relations: js.UndefOr[js.Any] = js.undefined
}

object Anon_DataSource {
  @scala.inline
  def apply(dataSource: String | js.Any, public: js.UndefOr[Boolean] = js.undefined, relations: js.Any = null): Anon_DataSource = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (relations != null) __obj.updateDynamic("relations")(relations)
    __obj.asInstanceOf[Anon_DataSource]
  }
}

