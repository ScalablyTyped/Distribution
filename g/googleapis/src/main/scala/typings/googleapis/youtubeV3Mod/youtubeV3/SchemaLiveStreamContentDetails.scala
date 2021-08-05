package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed settings of a stream.
  */
trait SchemaLiveStreamContentDetails extends StObject {
  
  /**
    * The ingestion URL where the closed captions of this stream are sent.
    */
  var closedCaptionsIngestionUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the stream is reusable, which means that it can be
    * bound to multiple broadcasts. It is common for broadcasters to reuse the
    * same stream for many different broadcasts if those broadcasts occur at
    * different times.  If you set this value to false, then the stream will
    * not be reusable, which means that it can only be bound to one broadcast.
    * Non-reusable streams differ from reusable streams in the following ways:
    * - A non-reusable stream can only be bound to one broadcast.  - A
    * non-reusable stream might be deleted by an automated process after the
    * broadcast ends.  - The  liveStreams.list method does not list
    * non-reusable streams if you call the method and set the mine parameter to
    * true. The only way to use that method to retrieve the resource for a
    * non-reusable stream is to use the id parameter to identify the stream.
    */
  var isReusable: js.UndefOr[Boolean] = js.undefined
}
object SchemaLiveStreamContentDetails {
  
  inline def apply(): SchemaLiveStreamContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamContentDetails]
  }
  
  extension [Self <: SchemaLiveStreamContentDetails](x: Self) {
    
    inline def setClosedCaptionsIngestionUrl(value: String): Self = StObject.set(x, "closedCaptionsIngestionUrl", value.asInstanceOf[js.Any])
    
    inline def setClosedCaptionsIngestionUrlUndefined: Self = StObject.set(x, "closedCaptionsIngestionUrl", js.undefined)
    
    inline def setIsReusable(value: Boolean): Self = StObject.set(x, "isReusable", value.asInstanceOf[js.Any])
    
    inline def setIsReusableUndefined: Self = StObject.set(x, "isReusable", js.undefined)
  }
}
