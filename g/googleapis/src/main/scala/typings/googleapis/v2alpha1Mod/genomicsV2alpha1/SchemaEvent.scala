package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about events that occur during pipeline execution.
  */
@js.native
trait SchemaEvent extends js.Object {
  /**
    * A human-readable description of the event. Note that these strings can
    * change at any time without notice. Any application logic must use the
    * information in the `details` field.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Machine-readable details about the event.
    */
  var details: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The time at which the event occurred.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaEvent {
  @scala.inline
  def apply(): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvent]
  }
  @scala.inline
  implicit class SchemaEventOps[Self <: SchemaEvent] (val x: Self) extends AnyVal {
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
    def setDetails(value: StringDictionary[js.Any]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

