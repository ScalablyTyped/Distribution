package typings.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAlert extends js.Object {
  /**
    * Unique identifier of this alert. This should be considered an opaque
    * identifier; it is not safe to rely on it being in any particular format.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this alert can be dismissed.
    */
  var isDismissible: js.UndefOr[Boolean] = js.native
  /**
    * Kind of resource this is, in this case adsense#alert.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The localized alert message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Severity of this alert. Possible values: INFO, WARNING, SEVERE.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * Type of this alert. Possible values: SELF_HOLD, MIGRATED_TO_BILLING3,
    * ADDRESS_PIN_VERIFICATION, PHONE_PIN_VERIFICATION, CORPORATE_ENTITY,
    * GRAYLISTED_PUBLISHER, API_HOLD.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAlert {
  @scala.inline
  def apply(
    id: String = null,
    isDismissible: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    message: String = null,
    severity: String = null,
    `type`: String = null
  ): SchemaAlert = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isDismissible)) __obj.updateDynamic("isDismissible")(isDismissible.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAlert]
  }
}

