package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameters to the CheckIn method.
  */
@js.native
trait SchemaCheckInRequest extends js.Object {
  /**
    * The deadline has expired and the worker needs more time.
    */
  var deadlineExpired: js.UndefOr[SchemaEmpty] = js.native
  /**
    * A workflow specific event occurred.
    */
  var event: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The operation has finished with the given result.
    */
  var result: js.UndefOr[SchemaStatus] = js.native
  /**
    * Data about the status of the worker VM.
    */
  var workerStatus: js.UndefOr[SchemaWorkerStatus] = js.native
}

object SchemaCheckInRequest {
  @scala.inline
  def apply(
    deadlineExpired: SchemaEmpty = null,
    event: StringDictionary[js.Any] = null,
    result: SchemaStatus = null,
    workerStatus: SchemaWorkerStatus = null
  ): SchemaCheckInRequest = {
    val __obj = js.Dynamic.literal()
    if (deadlineExpired != null) __obj.updateDynamic("deadlineExpired")(deadlineExpired.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (workerStatus != null) __obj.updateDynamic("workerStatus")(workerStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCheckInRequest]
  }
}

