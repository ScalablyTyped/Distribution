package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a recipient.
  */
@js.native
trait SchemaRecipient extends js.Object {
  /**
    * The delivery type for the recipient.
    */
  var deliveryType: js.UndefOr[String] = js.native
  /**
    * The email address of the recipient.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#recipient.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaRecipient {
  @scala.inline
  def apply(deliveryType: String = null, email: String = null, kind: String = null): SchemaRecipient = {
    val __obj = js.Dynamic.literal()
    if (deliveryType != null) __obj.updateDynamic("deliveryType")(deliveryType.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRecipient]
  }
}

