package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for Drive export.
  */
@js.native
trait SchemaDriveExportOptions extends js.Object {
  /**
    * Set to true to include access level information for users with &lt;a
    * href=&quot;https://support.google.com/vault/answer/6099459#metadata&quot;&gt;indirect
    * access&lt;/a&gt; to files.
    */
  var includeAccessInfo: js.UndefOr[Boolean] = js.native
}

object SchemaDriveExportOptions {
  @scala.inline
  def apply(includeAccessInfo: js.UndefOr[Boolean] = js.undefined): SchemaDriveExportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAccessInfo)) __obj.updateDynamic("includeAccessInfo")(includeAccessInfo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDriveExportOptions]
  }
}

