package typings.koaCsrf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisableQuery extends js.Object {
  var disableQuery: js.UndefOr[Boolean] = js.undefined
  var excludedMethods: js.UndefOr[js.Array[String]] = js.undefined
  var invalidSessionSecretMessage: js.UndefOr[String] = js.undefined
  var invalidSessionSecretStatusCode: js.UndefOr[Double] = js.undefined
  var invalidTokenMessage: js.UndefOr[String] = js.undefined
  var invalidTokenStatusCode: js.UndefOr[Double] = js.undefined
}

object AnonDisableQuery {
  @scala.inline
  def apply(
    disableQuery: js.UndefOr[Boolean] = js.undefined,
    excludedMethods: js.Array[String] = null,
    invalidSessionSecretMessage: String = null,
    invalidSessionSecretStatusCode: Int | Double = null,
    invalidTokenMessage: String = null,
    invalidTokenStatusCode: Int | Double = null
  ): AnonDisableQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableQuery)) __obj.updateDynamic("disableQuery")(disableQuery.asInstanceOf[js.Any])
    if (excludedMethods != null) __obj.updateDynamic("excludedMethods")(excludedMethods.asInstanceOf[js.Any])
    if (invalidSessionSecretMessage != null) __obj.updateDynamic("invalidSessionSecretMessage")(invalidSessionSecretMessage.asInstanceOf[js.Any])
    if (invalidSessionSecretStatusCode != null) __obj.updateDynamic("invalidSessionSecretStatusCode")(invalidSessionSecretStatusCode.asInstanceOf[js.Any])
    if (invalidTokenMessage != null) __obj.updateDynamic("invalidTokenMessage")(invalidTokenMessage.asInstanceOf[js.Any])
    if (invalidTokenStatusCode != null) __obj.updateDynamic("invalidTokenStatusCode")(invalidTokenStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisableQuery]
  }
}

