package typings.googleapis.v21Mod.contentV21

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
  def apply(): SchemaLiaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaSettings]
  }
  @scala.inline
  implicit class SchemaLiaSettingsOps[Self <: SchemaLiaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setCountrySettingsVarargs(value: SchemaLiaCountrySettings*): Self = this.set("countrySettings", js.Array(value :_*))
    @scala.inline
    def setCountrySettings(value: js.Array[SchemaLiaCountrySettings]): Self = this.set("countrySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySettings: Self = this.set("countrySettings", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

