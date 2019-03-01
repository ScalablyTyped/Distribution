package typings
package koaDashCsrfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableQuery extends js.Object {
  var disableQuery: js.UndefOr[scala.Boolean] = js.undefined
  var excludedMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var invalidSessionSecretMessage: js.UndefOr[java.lang.String] = js.undefined
  var invalidSessionSecretStatusCode: js.UndefOr[scala.Double] = js.undefined
  var invalidTokenMessage: js.UndefOr[java.lang.String] = js.undefined
  var invalidTokenStatusCode: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DisableQuery {
  @scala.inline
  def apply(
    disableQuery: js.UndefOr[scala.Boolean] = js.undefined,
    excludedMethods: js.Array[java.lang.String] = null,
    invalidSessionSecretMessage: java.lang.String = null,
    invalidSessionSecretStatusCode: scala.Int | scala.Double = null,
    invalidTokenMessage: java.lang.String = null,
    invalidTokenStatusCode: scala.Int | scala.Double = null
  ): Anon_DisableQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableQuery)) __obj.updateDynamic("disableQuery")(disableQuery)
    if (excludedMethods != null) __obj.updateDynamic("excludedMethods")(excludedMethods)
    if (invalidSessionSecretMessage != null) __obj.updateDynamic("invalidSessionSecretMessage")(invalidSessionSecretMessage)
    if (invalidSessionSecretStatusCode != null) __obj.updateDynamic("invalidSessionSecretStatusCode")(invalidSessionSecretStatusCode.asInstanceOf[js.Any])
    if (invalidTokenMessage != null) __obj.updateDynamic("invalidTokenMessage")(invalidTokenMessage)
    if (invalidTokenStatusCode != null) __obj.updateDynamic("invalidTokenStatusCode")(invalidTokenStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisableQuery]
  }
}

