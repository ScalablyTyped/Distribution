package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerLifecycleEvent extends StObject {
  
  /**
    * The start time of this container. All events will report this so that events can be grouped together across container/VM restarts.
    */
  var containerStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The event being reported.
    */
  var event: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Other stats that can accompany an event. E.g. { "downloaded_bytes" : "123456" \}
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaWorkerLifecycleEvent {
  
  inline def apply(): SchemaWorkerLifecycleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerLifecycleEvent]
  }
  
  extension [Self <: SchemaWorkerLifecycleEvent](x: Self) {
    
    inline def setContainerStartTime(value: String): Self = StObject.set(x, "containerStartTime", value.asInstanceOf[js.Any])
    
    inline def setContainerStartTimeNull: Self = StObject.set(x, "containerStartTime", null)
    
    inline def setContainerStartTimeUndefined: Self = StObject.set(x, "containerStartTime", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
