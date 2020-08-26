package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time-stamped annotation or message event in the Span.
  */
@js.native
trait SchemaTimeEvent extends js.Object {
  /**
    * Text annotation with a set of attributes.
    */
  var annotation: js.UndefOr[SchemaAnnotation] = js.native
  /**
    * An event describing a message sent/received between Spans.
    */
  var messageEvent: js.UndefOr[SchemaMessageEvent] = js.native
  /**
    * The timestamp indicating the time the event occurred.
    */
  var time: js.UndefOr[String] = js.native
}

object SchemaTimeEvent {
  @scala.inline
  def apply(): SchemaTimeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeEvent]
  }
  @scala.inline
  implicit class SchemaTimeEventOps[Self <: SchemaTimeEvent] (val x: Self) extends AnyVal {
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
    def setAnnotation(value: SchemaAnnotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotation: Self = this.set("annotation", js.undefined)
    @scala.inline
    def setMessageEvent(value: SchemaMessageEvent): Self = this.set("messageEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageEvent: Self = this.set("messageEvent", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

