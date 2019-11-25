package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used with SQLite3 adapter */
trait Sqlite3ConnectionConfig extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var filename: String
}

object Sqlite3ConnectionConfig {
  @scala.inline
  def apply(filename: String, debug: js.UndefOr[Boolean] = js.undefined): Sqlite3ConnectionConfig = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sqlite3ConnectionConfig]
  }
}

