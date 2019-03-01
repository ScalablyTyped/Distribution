package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportSignalrServer extends js.Object {
  var create: js.UndefOr[java.lang.String] = js.undefined
  var destroy: js.UndefOr[java.lang.String] = js.undefined
  var read: js.UndefOr[java.lang.String] = js.undefined
  var update: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceTransportSignalrServer {
  @scala.inline
  def apply(
    create: java.lang.String = null,
    destroy: java.lang.String = null,
    read: java.lang.String = null,
    update: java.lang.String = null
  ): DataSourceTransportSignalrServer = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (read != null) __obj.updateDynamic("read")(read)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[DataSourceTransportSignalrServer]
  }
}

