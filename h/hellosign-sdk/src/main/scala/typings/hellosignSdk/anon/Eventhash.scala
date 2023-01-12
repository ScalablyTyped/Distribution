package typings.hellosignSdk.anon

import typings.hellosignSdk.mod.GenericObject
import typings.hellosignSdk.mod.HellosignEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eventhash[Metadata] extends StObject {
  
  var event_hash: String
  
  var event_metadata: GenericObject[Relatedsignatureid & Metadata]
  
  var event_time: String
  
  var event_type: HellosignEvents
}
object Eventhash {
  
  inline def apply[Metadata](
    event_hash: String,
    event_metadata: GenericObject[Relatedsignatureid & Metadata],
    event_time: String,
    event_type: HellosignEvents
  ): Eventhash[Metadata] = {
    val __obj = js.Dynamic.literal(event_hash = event_hash.asInstanceOf[js.Any], event_metadata = event_metadata.asInstanceOf[js.Any], event_time = event_time.asInstanceOf[js.Any], event_type = event_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventhash[Metadata]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Eventhash[?], Metadata] (val x: Self & Eventhash[Metadata]) extends AnyVal {
    
    inline def setEvent_hash(value: String): Self = StObject.set(x, "event_hash", value.asInstanceOf[js.Any])
    
    inline def setEvent_metadata(value: GenericObject[Relatedsignatureid & Metadata]): Self = StObject.set(x, "event_metadata", value.asInstanceOf[js.Any])
    
    inline def setEvent_time(value: String): Self = StObject.set(x, "event_time", value.asInstanceOf[js.Any])
    
    inline def setEvent_type(value: HellosignEvents): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
  }
}
