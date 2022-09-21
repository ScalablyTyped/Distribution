package typings.hellosignSdk.anon

import typings.hellosignSdk.mod.HellosignEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eventmetadata extends StObject {
  
  var event_hash: String
  
  var event_metadata: GenericObjectrelatedsigna
  
  var event_time: String
  
  var event_type: HellosignEvents
}
object Eventmetadata {
  
  inline def apply(
    event_hash: String,
    event_metadata: GenericObjectrelatedsigna,
    event_time: String,
    event_type: HellosignEvents
  ): Eventmetadata = {
    val __obj = js.Dynamic.literal(event_hash = event_hash.asInstanceOf[js.Any], event_metadata = event_metadata.asInstanceOf[js.Any], event_time = event_time.asInstanceOf[js.Any], event_type = event_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventmetadata]
  }
  
  extension [Self <: Eventmetadata](x: Self) {
    
    inline def setEvent_hash(value: String): Self = StObject.set(x, "event_hash", value.asInstanceOf[js.Any])
    
    inline def setEvent_metadata(value: GenericObjectrelatedsigna): Self = StObject.set(x, "event_metadata", value.asInstanceOf[js.Any])
    
    inline def setEvent_time(value: String): Self = StObject.set(x, "event_time", value.asInstanceOf[js.Any])
    
    inline def setEvent_type(value: HellosignEvents): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
  }
}
