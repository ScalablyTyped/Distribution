package typings.koaCsrf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableQuery extends js.Object {
  var disableQuery: js.UndefOr[Boolean] = js.undefined
  var excludedMethods: js.UndefOr[js.Array[String]] = js.undefined
  var invalidSessionSecretMessage: js.UndefOr[String] = js.undefined
  var invalidSessionSecretStatusCode: js.UndefOr[Double] = js.undefined
  var invalidTokenMessage: js.UndefOr[String] = js.undefined
  var invalidTokenStatusCode: js.UndefOr[Double] = js.undefined
}

object DisableQuery {
  @scala.inline
  def apply(
    disableQuery: js.UndefOr[Boolean] = js.undefined,
    excludedMethods: js.Array[String] = null,
    invalidSessionSecretMessage: String = null,
    invalidSessionSecretStatusCode: js.UndefOr[Double] = js.undefined,
    invalidTokenMessage: String = null,
    invalidTokenStatusCode: js.UndefOr[Double] = js.undefined
  ): DisableQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableQuery)) __obj.updateDynamic("disableQuery")(disableQuery.get.asInstanceOf[js.Any])
    if (excludedMethods != null) __obj.updateDynamic("excludedMethods")(excludedMethods.asInstanceOf[js.Any])
    if (invalidSessionSecretMessage != null) __obj.updateDynamic("invalidSessionSecretMessage")(invalidSessionSecretMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(invalidSessionSecretStatusCode)) __obj.updateDynamic("invalidSessionSecretStatusCode")(invalidSessionSecretStatusCode.get.asInstanceOf[js.Any])
    if (invalidTokenMessage != null) __obj.updateDynamic("invalidTokenMessage")(invalidTokenMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(invalidTokenStatusCode)) __obj.updateDynamic("invalidTokenStatusCode")(invalidTokenStatusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableQuery]
  }
}

