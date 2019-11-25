package typings.kendoDashUi.kendo.data

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
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportSignalrClient]
  }
}

