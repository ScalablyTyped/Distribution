package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used with SQLite3 adapter */
trait Sqlite3ConnectionConfig extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var filename: java.lang.String
}

object Sqlite3ConnectionConfig {
  @scala.inline
  def apply(filename: java.lang.String, debug: js.UndefOr[scala.Boolean] = js.undefined): Sqlite3ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[Sqlite3ConnectionConfig]
  }
}

