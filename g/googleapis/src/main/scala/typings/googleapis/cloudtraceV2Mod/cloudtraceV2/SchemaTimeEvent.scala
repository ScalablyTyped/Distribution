package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeEvent extends StObject {
  
  /**
    * Text annotation with a set of attributes.
    */
  var annotation: js.UndefOr[SchemaAnnotation] = js.undefined
  
  /**
    * An event describing a message sent/received between Spans.
    */
  var messageEvent: js.UndefOr[SchemaMessageEvent] = js.undefined
  
  /**
    * The timestamp indicating the time the event occurred.
    */
  var time: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimeEvent {
  
  inline def apply(): SchemaTimeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeEvent]
  }
  
  extension [Self <: SchemaTimeEvent](x: Self) {
    
    inline def setAnnotation(value: SchemaAnnotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    inline def setMessageEvent(value: SchemaMessageEvent): Self = StObject.set(x, "messageEvent", value.asInstanceOf[js.Any])
    
    inline def setMessageEventUndefined: Self = StObject.set(x, "messageEvent", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
