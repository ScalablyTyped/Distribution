package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MariaSslConfiguration extends js.Object {
  var ca: js.UndefOr[String] = js.undefined
  var capath: js.UndefOr[String] = js.undefined
  var cert: js.UndefOr[String] = js.undefined
  var cipher: js.UndefOr[String] = js.undefined
  var expirationChecker: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
    expirationChecker: () => Boolean = null,
    key: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  ): MariaSslConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (capath != null) __obj.updateDynamic("capath")(capath.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MariaSslConfiguration]
  }
}

