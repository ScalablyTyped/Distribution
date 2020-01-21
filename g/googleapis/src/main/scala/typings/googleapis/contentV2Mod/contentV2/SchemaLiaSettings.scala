package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Local Inventory ads (LIA) settings. All methods except listposdataproviders
  * require the admin role.
  */
@js.native
trait SchemaLiaSettings extends js.Object {
  /**
    * The ID of the account to which these LIA settings belong. Ignored upon
    * update, always present in get request responses.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The LIA settings for each country.
    */
  var countrySettings: js.UndefOr[js.Array[SchemaLiaCountrySettings]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liaSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaLiaSettings {
  @scala.inline
  def apply(
    accountId: String = null,
    countrySettings: js.Array[SchemaLiaCountrySettings] = null,
    kind: String = null
  ): SchemaLiaSettings = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (countrySettings != null) __obj.updateDynamic("countrySettings")(countrySettings.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiaSettings]
  }
}

