package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Org Unit to search
  */
@js.native
trait SchemaOrgUnitInfo extends js.Object {
  /**
    * Org unit to search, as provided by the &lt;a
    * href=&quot;https://developers.google.com/admin-sdk/directory/&quot;&gt;Admin
    * SDK Directory API&lt;/a&gt;.
    */
  var orgUnitId: js.UndefOr[String] = js.native
}

object SchemaOrgUnitInfo {
  @scala.inline
  def apply(orgUnitId: String = null): SchemaOrgUnitInfo = {
    val __obj = js.Dynamic.literal()
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrgUnitInfo]
  }
}

