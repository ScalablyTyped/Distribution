package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MariaSslConfiguration extends js.Object {
  var ca: js.UndefOr[java.lang.String] = js.undefined
  var capath: js.UndefOr[java.lang.String] = js.undefined
  var cert: js.UndefOr[java.lang.String] = js.undefined
  var cipher: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
}

object MariaSslConfiguration {
  @scala.inline
  def apply(
    ca: java.lang.String = null,
    capath: java.lang.String = null,
    cert: java.lang.String = null,
    cipher: java.lang.String = null,
    key: java.lang.String = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  ): MariaSslConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (capath != null) __obj.updateDynamic("capath")(capath)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[MariaSslConfiguration]
  }
}

