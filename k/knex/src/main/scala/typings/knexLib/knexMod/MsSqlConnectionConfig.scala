package typings
package knexLib.knexMod

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
    val __obj = js.Dynamic.literal(database = database, options = options, password = password, server = server, user = user)
  
    __obj.asInstanceOf[MsSqlConnectionConfig]
  }
}

