package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly The reason and details for a disapproval.
  */
@js.native
trait SchemaDisapproval extends js.Object {
  /**
    * Additional details about the reason for disapproval.
    */
  var details: js.UndefOr[js.Array[String]] = js.native
  /**
    * The categorized reason for disapproval.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaDisapproval {
  @scala.inline
  def apply(details: js.Array[String] = null, reason: String = null): SchemaDisapproval = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisapproval]
  }
}

