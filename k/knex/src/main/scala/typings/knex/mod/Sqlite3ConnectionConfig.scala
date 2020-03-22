package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used with SQLite3 adapter */
trait Sqlite3ConnectionConfig extends _StaticConnectionConfig {
  var debug: js.UndefOr[Boolean] = js.undefined
  var expirationChecker: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var filename: String
}

object Sqlite3ConnectionConfig {
  @scala.inline
  def apply(
    filename: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    expirationChecker: () => Boolean = null
  ): Sqlite3ConnectionConfig = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    __obj.asInstanceOf[Sqlite3ConnectionConfig]
  }
}

