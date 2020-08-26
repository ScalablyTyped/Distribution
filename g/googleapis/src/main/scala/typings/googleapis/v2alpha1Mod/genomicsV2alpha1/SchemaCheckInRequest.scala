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
  def apply(): SchemaCheckInRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInRequest]
  }
  @scala.inline
  implicit class SchemaCheckInRequestOps[Self <: SchemaCheckInRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeadlineExpired(value: SchemaEmpty): Self = this.set("deadlineExpired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadlineExpired: Self = this.set("deadlineExpired", js.undefined)
    @scala.inline
    def setEvent(value: StringDictionary[js.Any]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setResult(value: SchemaStatus): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setWorkerStatus(value: SchemaWorkerStatus): Self = this.set("workerStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerStatus: Self = this.set("workerStatus", js.undefined)
  }
  
}

