package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransport extends StObject {
  
  /**
    * The Pub/Sub topic and subscription used by Eventarc as a transport intermediary.
    */
  var pubsub: js.UndefOr[SchemaPubsub] = js.undefined
}
object SchemaTransport {
  
  inline def apply(): SchemaTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransport]
  }
  
  extension [Self <: SchemaTransport](x: Self) {
    
    inline def setPubsub(value: SchemaPubsub): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
    
    inline def setPubsubUndefined: Self = StObject.set(x, "pubsub", js.undefined)
  }
}
