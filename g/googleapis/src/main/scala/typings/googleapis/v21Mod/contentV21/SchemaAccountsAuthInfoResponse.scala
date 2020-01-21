package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountsAuthInfoResponse extends js.Object {
  /**
    * The account identifiers corresponding to the authenticated user. - For an
    * individual account: only the merchant ID is defined - For an aggregator:
    * only the aggregator ID is defined - For a subaccount of an MCA: both the
    * merchant ID and the aggregator ID are defined.
    */
  var accountIdentifiers: js.UndefOr[js.Array[SchemaAccountIdentifier]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsAuthInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccountsAuthInfoResponse {
  @scala.inline
  def apply(accountIdentifiers: js.Array[SchemaAccountIdentifier] = null, kind: String = null): SchemaAccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (accountIdentifiers != null) __obj.updateDynamic("accountIdentifiers")(accountIdentifiers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountsAuthInfoResponse]
  }
}

