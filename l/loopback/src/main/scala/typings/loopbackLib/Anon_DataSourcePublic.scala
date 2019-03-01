package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSourcePublic extends js.Object {
  var dataSource: java.lang.String | js.Any
  var public: js.UndefOr[scala.Boolean] = js.undefined
  var relations: js.UndefOr[js.Any] = js.undefined
}

object Anon_DataSourcePublic {
  @scala.inline
  def apply(
    dataSource: java.lang.String | js.Any,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    relations: js.Any = null
  ): Anon_DataSourcePublic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (relations != null) __obj.updateDynamic("relations")(relations)
    __obj.asInstanceOf[Anon_DataSourcePublic]
  }
}

