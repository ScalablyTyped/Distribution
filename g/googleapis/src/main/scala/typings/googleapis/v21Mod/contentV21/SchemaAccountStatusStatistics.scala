package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountStatusStatistics extends js.Object {
  /**
    * Number of active offers.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Number of disapproved offers.
    */
  var disapproved: js.UndefOr[String] = js.native
  /**
    * Number of expiring offers.
    */
  var expiring: js.UndefOr[String] = js.native
  /**
    * Number of pending offers.
    */
  var pending: js.UndefOr[String] = js.native
}

object SchemaAccountStatusStatistics {
  @scala.inline
  def apply(active: String = null, disapproved: String = null, expiring: String = null, pending: String = null): SchemaAccountStatusStatistics = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (disapproved != null) __obj.updateDynamic("disapproved")(disapproved.asInstanceOf[js.Any])
    if (expiring != null) __obj.updateDynamic("expiring")(expiring.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountStatusStatistics]
  }
}

