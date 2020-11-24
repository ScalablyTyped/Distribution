package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeEvent extends js.Object {
  
  /** Text annotation with a set of attributes. */
  var annotation: js.UndefOr[Annotation] = js.native
  
  /** An event describing a message sent/received between Spans. */
  var messageEvent: js.UndefOr[MessageEvent] = js.native
  
  /** The timestamp indicating the time the event occurred. */
  var time: js.UndefOr[String] = js.native
}
object TimeEvent {
  
  @scala.inline
  def apply(): TimeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeEvent]
  }
  
  @scala.inline
  implicit class TimeEventOps[Self <: TimeEvent] (val x: Self) extends AnyVal {
    
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
    def setAnnotation(value: Annotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotation: Self = this.set("annotation", js.undefined)
    
    @scala.inline
    def setMessageEvent(value: MessageEvent): Self = this.set("messageEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageEvent: Self = this.set("messageEvent", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
