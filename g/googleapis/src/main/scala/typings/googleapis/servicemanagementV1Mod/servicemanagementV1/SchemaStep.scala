package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the status of one operation step.
  */
@js.native
trait SchemaStep extends js.Object {
  /**
    * The short description of the step.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The status code.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaStep {
  @scala.inline
  def apply(description: String = null, status: String = null): SchemaStep = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStep]
  }
}

