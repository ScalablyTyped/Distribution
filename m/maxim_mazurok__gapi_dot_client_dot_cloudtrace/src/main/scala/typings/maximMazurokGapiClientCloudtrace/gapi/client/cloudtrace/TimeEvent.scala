package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeEvent extends StObject {
  
  /** Text annotation with a set of attributes. */
  var annotation: js.UndefOr[Annotation] = js.undefined
  
  /** An event describing a message sent/received between Spans. */
  var messageEvent: js.UndefOr[MessageEvent] = js.undefined
  
  /** The timestamp indicating the time the event occurred. */
  var time: js.UndefOr[String] = js.undefined
}
object TimeEvent {
  
  inline def apply(): TimeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeEvent] (val x: Self) extends AnyVal {
    
    inline def setAnnotation(value: Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    inline def setMessageEvent(value: MessageEvent): Self = StObject.set(x, "messageEvent", value.asInstanceOf[js.Any])
    
    inline def setMessageEventUndefined: Self = StObject.set(x, "messageEvent", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
