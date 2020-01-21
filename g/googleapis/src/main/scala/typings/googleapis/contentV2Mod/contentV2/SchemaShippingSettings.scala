package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The merchant account&#39;s shipping settings. All methods except
  * getsupportedcarriers and getsupportedholidays require the admin role.
  */
@js.native
trait SchemaShippingSettings extends js.Object {
  /**
    * The ID of the account to which these account shipping settings belong.
    * Ignored upon update, always present in get request responses.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * A list of postal code groups that can be referred to in services.
    * Optional.
    */
  var postalCodeGroups: js.UndefOr[js.Array[SchemaPostalCodeGroup]] = js.native
  /**
    * The target account&#39;s list of services. Optional.
    */
  var services: js.UndefOr[js.Array[SchemaService]] = js.native
}

object SchemaShippingSettings {
  @scala.inline
  def apply(
    accountId: String = null,
    postalCodeGroups: js.Array[SchemaPostalCodeGroup] = null,
    services: js.Array[SchemaService] = null
  ): SchemaShippingSettings = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (postalCodeGroups != null) __obj.updateDynamic("postalCodeGroups")(postalCodeGroups.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShippingSettings]
  }
}

