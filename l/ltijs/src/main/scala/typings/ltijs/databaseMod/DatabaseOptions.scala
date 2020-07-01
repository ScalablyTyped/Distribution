package typings.ltijs.databaseMod

import typings.ltijs.anon.KeepAlive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseOptions extends js.Object {
  var connection: js.UndefOr[KeepAlive] = js.undefined
  var plugin: js.UndefOr[js.Object] = js.undefined
  var url: String
}

object DatabaseOptions {
  @scala.inline
  def apply(url: String, connection: KeepAlive = null, plugin: js.Object = null): DatabaseOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseOptions]
  }
}

