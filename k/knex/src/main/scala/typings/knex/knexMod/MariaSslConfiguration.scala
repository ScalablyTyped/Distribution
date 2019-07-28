package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MariaSslConfiguration extends js.Object {
  var ca: js.UndefOr[String] = js.undefined
  var capath: js.UndefOr[String] = js.undefined
  var cert: js.UndefOr[String] = js.undefined
  var cipher: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object MariaSslConfiguration {
  @scala.inline
  def apply(
    ca: String = null,
    capath: String = null,
    cert: String = null,
    cipher: String = null,
    key: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
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

