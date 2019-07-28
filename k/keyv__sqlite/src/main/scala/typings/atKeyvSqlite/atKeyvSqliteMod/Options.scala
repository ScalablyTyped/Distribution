package typings.atKeyvSqlite.atKeyvSqliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var busyTimeout: js.UndefOr[Double] = js.undefined
  var keySize: js.UndefOr[Double] = js.undefined
  var table: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    busyTimeout: Int | Double = null,
    keySize: Int | Double = null,
    table: String = null,
    uri: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (busyTimeout != null) __obj.updateDynamic("busyTimeout")(busyTimeout.asInstanceOf[js.Any])
    if (keySize != null) __obj.updateDynamic("keySize")(keySize.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Options]
  }
}

