package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsSqlConnectionConfig extends js.Object {
  var database: java.lang.String
  var options: MsSqlOptionsConfig
  var password: java.lang.String
  var server: java.lang.String
  var user: java.lang.String
}

object MsSqlConnectionConfig {
  @scala.inline
  def apply(
    database: java.lang.String,
    options: MsSqlOptionsConfig,
    password: java.lang.String,
    server: java.lang.String,
    user: java.lang.String
  ): MsSqlConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("database")(database)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("server")(server)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[MsSqlConnectionConfig]
  }
}

