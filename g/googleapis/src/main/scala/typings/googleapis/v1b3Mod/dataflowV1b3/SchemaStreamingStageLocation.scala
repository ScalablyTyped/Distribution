package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamingStageLocation extends StObject {
  
  /**
    * Identifies the particular stream within the streaming Dataflow job.
    */
  var streamId: js.UndefOr[String | Null] = js.undefined
}
object SchemaStreamingStageLocation {
  
  inline def apply(): SchemaStreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingStageLocation]
  }
  
  extension [Self <: SchemaStreamingStageLocation](x: Self) {
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdNull: Self = StObject.set(x, "streamId", null)
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
  }
}
