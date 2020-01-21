package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Alerts for user account warning events.
  */
@js.native
trait SchemaAccountWarning extends js.Object {
  /**
    * Required. The email of the user that this event belongs to.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Optional. Details of the login action associated with the warning event.
    * This is only available for:  * Suspicious login * Suspicious login (less
    * secure app) * Suspicious programmatic login * User suspended (suspicious
    * activity)
    */
  var loginDetails: js.UndefOr[SchemaLoginDetails] = js.native
}

object SchemaAccountWarning {
  @scala.inline
  def apply(email: String = null, loginDetails: SchemaLoginDetails = null): SchemaAccountWarning = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (loginDetails != null) __obj.updateDynamic("loginDetails")(loginDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountWarning]
  }
}

