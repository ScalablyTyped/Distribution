package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamLocation extends StObject {
  
  /**
    * The stream is a custom source.
    */
  var customSourceLocation: js.UndefOr[SchemaCustomSourceLocation] = js.undefined
  
  /**
    * The stream is a pubsub stream.
    */
  var pubsubLocation: js.UndefOr[SchemaPubsubLocation] = js.undefined
  
  /**
    * The stream is a streaming side input.
    */
  var sideInputLocation: js.UndefOr[SchemaStreamingSideInputLocation] = js.undefined
  
  /**
    * The stream is part of another computation within the current streaming Dataflow job.
    */
  var streamingStageLocation: js.UndefOr[SchemaStreamingStageLocation] = js.undefined
}
object SchemaStreamLocation {
  
  inline def apply(): SchemaStreamLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamLocation]
  }
  
  extension [Self <: SchemaStreamLocation](x: Self) {
    
    inline def setCustomSourceLocation(value: SchemaCustomSourceLocation): Self = StObject.set(x, "customSourceLocation", value.asInstanceOf[js.Any])
    
    inline def setCustomSourceLocationUndefined: Self = StObject.set(x, "customSourceLocation", js.undefined)
    
    inline def setPubsubLocation(value: SchemaPubsubLocation): Self = StObject.set(x, "pubsubLocation", value.asInstanceOf[js.Any])
    
    inline def setPubsubLocationUndefined: Self = StObject.set(x, "pubsubLocation", js.undefined)
    
    inline def setSideInputLocation(value: SchemaStreamingSideInputLocation): Self = StObject.set(x, "sideInputLocation", value.asInstanceOf[js.Any])
    
    inline def setSideInputLocationUndefined: Self = StObject.set(x, "sideInputLocation", js.undefined)
    
    inline def setStreamingStageLocation(value: SchemaStreamingStageLocation): Self = StObject.set(x, "streamingStageLocation", value.asInstanceOf[js.Any])
    
    inline def setStreamingStageLocationUndefined: Self = StObject.set(x, "streamingStageLocation", js.undefined)
  }
}
