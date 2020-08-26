package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPosDataProvidersPosDataProvider extends js.Object {
  /**
    * The display name of Pos data Provider.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The full name of this POS data Provider.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * The ID of the account.
    */
  var providerId: js.UndefOr[String] = js.native
}

object SchemaPosDataProvidersPosDataProvider {
  @scala.inline
  def apply(): SchemaPosDataProvidersPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosDataProvidersPosDataProvider]
  }
  @scala.inline
  implicit class SchemaPosDataProvidersPosDataProviderOps[Self <: SchemaPosDataProvidersPosDataProvider] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderId: Self = this.set("providerId", js.undefined)
  }
  
}

