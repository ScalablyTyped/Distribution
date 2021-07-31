package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies the location of a streaming computation stage, for
  * stage-to-stage communication.
  */
trait SchemaStreamingStageLocation extends StObject {
  
  /**
    * Identifies the particular stream within the streaming Dataflow job.
    */
  var streamId: js.UndefOr[String] = js.undefined
}
object SchemaStreamingStageLocation {
  
  @scala.inline
  def apply(): SchemaStreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingStageLocation]
  }
  
  @scala.inline
  implicit class SchemaStreamingStageLocationMutableBuilder[Self <: SchemaStreamingStageLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
  }
}
