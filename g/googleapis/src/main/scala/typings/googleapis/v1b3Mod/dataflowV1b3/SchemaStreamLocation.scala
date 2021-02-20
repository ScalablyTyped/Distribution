package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a stream of data, either as input to be processed or as output of
  * a streaming Dataflow job.
  */
@js.native
trait SchemaStreamLocation extends StObject {
  
  /**
    * The stream is a custom source.
    */
  var customSourceLocation: js.UndefOr[SchemaCustomSourceLocation] = js.native
  
  /**
    * The stream is a pubsub stream.
    */
  var pubsubLocation: js.UndefOr[SchemaPubsubLocation] = js.native
  
  /**
    * The stream is a streaming side input.
    */
  var sideInputLocation: js.UndefOr[SchemaStreamingSideInputLocation] = js.native
  
  /**
    * The stream is part of another computation within the current streaming
    * Dataflow job.
    */
  var streamingStageLocation: js.UndefOr[SchemaStreamingStageLocation] = js.native
}
object SchemaStreamLocation {
  
  @scala.inline
  def apply(): SchemaStreamLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamLocation]
  }
  
  @scala.inline
  implicit class SchemaStreamLocationMutableBuilder[Self <: SchemaStreamLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSourceLocation(value: SchemaCustomSourceLocation): Self = StObject.set(x, "customSourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSourceLocationUndefined: Self = StObject.set(x, "customSourceLocation", js.undefined)
    
    @scala.inline
    def setPubsubLocation(value: SchemaPubsubLocation): Self = StObject.set(x, "pubsubLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubLocationUndefined: Self = StObject.set(x, "pubsubLocation", js.undefined)
    
    @scala.inline
    def setSideInputLocation(value: SchemaStreamingSideInputLocation): Self = StObject.set(x, "sideInputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideInputLocationUndefined: Self = StObject.set(x, "sideInputLocation", js.undefined)
    
    @scala.inline
    def setStreamingStageLocation(value: SchemaStreamingStageLocation): Self = StObject.set(x, "streamingStageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingStageLocationUndefined: Self = StObject.set(x, "streamingStageLocation", js.undefined)
  }
}
