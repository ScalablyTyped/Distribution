package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for profile settings
  */
@js.native
trait SchemaProfileSettings extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#profileSettings.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The player&#39;s current profile visibility. This field is visible to
    * both 1P and 3P APIs.
    */
  var profileVisible: js.UndefOr[Boolean] = js.native
}

object SchemaProfileSettings {
  @scala.inline
  def apply(kind: String = null, profileVisible: js.UndefOr[Boolean] = js.undefined): SchemaProfileSettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(profileVisible)) __obj.updateDynamic("profileVisible")(profileVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProfileSettings]
  }
}

