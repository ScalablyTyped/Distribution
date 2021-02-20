package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A time-stamped annotation or message event in the Span.
  */
@js.native
trait SchemaTimeEvent extends StObject {
  
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
  implicit class SchemaTimeEventMutableBuilder[Self <: SchemaTimeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: SchemaAnnotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    @scala.inline
    def setMessageEvent(value: SchemaMessageEvent): Self = StObject.set(x, "messageEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageEventUndefined: Self = StObject.set(x, "messageEvent", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
