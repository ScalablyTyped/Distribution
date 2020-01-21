package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the execution of a pipeline has failed. Note that
  * other events can continue to occur after this event.
  */
@js.native
trait SchemaFailedEvent extends js.Object {
  /**
    * The human-readable description of the cause of the failure.
    */
  var cause: js.UndefOr[String] = js.native
  /**
    * The Google standard error code that best describes this failure.
    */
  var code: js.UndefOr[String] = js.native
}

object SchemaFailedEvent {
  @scala.inline
  def apply(cause: String = null, code: String = null): SchemaFailedEvent = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFailedEvent]
  }
}

