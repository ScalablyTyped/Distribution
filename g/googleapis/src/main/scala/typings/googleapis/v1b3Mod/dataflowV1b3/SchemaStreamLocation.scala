package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a stream of data, either as input to be processed or as output of
  * a streaming Dataflow job.
  */
@js.native
trait SchemaStreamLocation extends js.Object {
  
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
  implicit class SchemaStreamLocationOps[Self <: SchemaStreamLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomSourceLocation(value: SchemaCustomSourceLocation): Self = this.set("customSourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSourceLocation: Self = this.set("customSourceLocation", js.undefined)
    
    @scala.inline
    def setPubsubLocation(value: SchemaPubsubLocation): Self = this.set("pubsubLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubLocation: Self = this.set("pubsubLocation", js.undefined)
    
    @scala.inline
    def setSideInputLocation(value: SchemaStreamingSideInputLocation): Self = this.set("sideInputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideInputLocation: Self = this.set("sideInputLocation", js.undefined)
    
    @scala.inline
    def setStreamingStageLocation(value: SchemaStreamingStageLocation): Self = this.set("streamingStageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingStageLocation: Self = this.set("streamingStageLocation", js.undefined)
  }
}
