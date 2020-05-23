package typings.keyvMysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var keySize: js.UndefOr[Double] = js.undefined
  var table: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(keySize: js.UndefOr[Double] = js.undefined, table: String = null, uri: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keySize)) __obj.updateDynamic("keySize")(keySize.get.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

