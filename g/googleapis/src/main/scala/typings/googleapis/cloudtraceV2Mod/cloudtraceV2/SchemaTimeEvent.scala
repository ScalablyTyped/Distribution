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
  def apply(annotation: SchemaAnnotation = null, messageEvent: SchemaMessageEvent = null, time: String = null): SchemaTimeEvent = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (messageEvent != null) __obj.updateDynamic("messageEvent")(messageEvent.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimeEvent]
  }
}

