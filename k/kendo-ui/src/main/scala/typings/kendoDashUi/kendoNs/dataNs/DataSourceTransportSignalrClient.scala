package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportSignalrClient extends js.Object {
  var create: js.UndefOr[String] = js.undefined
  var destroy: js.UndefOr[String] = js.undefined
  var read: js.UndefOr[String] = js.undefined
  var update: js.UndefOr[String] = js.undefined
}

object DataSourceTransportSignalrClient {
  @scala.inline
  def apply(create: String = null, destroy: String = null, read: String = null, update: String = null): DataSourceTransportSignalrClient = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (read != null) __obj.updateDynamic("read")(read)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[DataSourceTransportSignalrClient]
  }
}

