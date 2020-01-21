package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The report event request.
  */
@js.native
trait SchemaCreateClientEventRequest extends js.Object {
  /**
    * Required.  Events issued when end user interacts with customer&#39;s
    * application that uses Cloud Talent Solution.
    */
  var clientEvent: js.UndefOr[SchemaClientEvent] = js.native
}

object SchemaCreateClientEventRequest {
  @scala.inline
  def apply(clientEvent: SchemaClientEvent = null): SchemaCreateClientEventRequest = {
    val __obj = js.Dynamic.literal()
    if (clientEvent != null) __obj.updateDynamic("clientEvent")(clientEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateClientEventRequest]
  }
}

