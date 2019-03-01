package typings
package atKeyvMysqlLib.atKeyvMysqlMod.KeyvMysqlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var keySize: js.UndefOr[scala.Double] = js.undefined
  var table: js.UndefOr[java.lang.String] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    keySize: scala.Int | scala.Double = null,
    table: java.lang.String = null,
    uri: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (keySize != null) __obj.updateDynamic("keySize")(keySize.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Options]
  }
}

