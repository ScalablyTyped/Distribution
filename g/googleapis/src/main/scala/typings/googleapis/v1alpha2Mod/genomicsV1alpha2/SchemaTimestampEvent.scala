package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores the list of events and times they occured for major events in job
  * execution.
  */
@js.native
trait SchemaTimestampEvent extends js.Object {
  /**
    * String indicating the type of event
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time this event occured.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaTimestampEvent {
  @scala.inline
  def apply(): SchemaTimestampEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampEvent]
  }
  @scala.inline
  implicit class SchemaTimestampEventOps[Self <: SchemaTimestampEvent] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

