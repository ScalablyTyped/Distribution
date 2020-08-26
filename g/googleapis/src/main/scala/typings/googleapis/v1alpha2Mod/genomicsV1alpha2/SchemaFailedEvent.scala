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
  def apply(): SchemaFailedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailedEvent]
  }
  @scala.inline
  implicit class SchemaFailedEventOps[Self <: SchemaFailedEvent] (val x: Self) extends AnyVal {
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
    def setCause(value: String): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
  }
  
}

