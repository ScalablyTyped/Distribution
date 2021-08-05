package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A liveBroadcast resource represents an event that will be streamed, via
  * live video, on YouTube.
  */
trait SchemaLiveBroadcast extends StObject {
  
  /**
    * The contentDetails object contains information about the event&#39;s
    * video content, such as whether the content can be shown in an embedded
    * video player or if it will be archived and therefore available for
    * viewing after the event has concluded.
    */
  var contentDetails: js.UndefOr[SchemaLiveBroadcastContentDetails] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube assigns to uniquely identify the broadcast.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveBroadcast&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The snippet object contains basic details about the event, including its
    * title, description, start time, and end time.
    */
  var snippet: js.UndefOr[SchemaLiveBroadcastSnippet] = js.undefined
  
  /**
    * The statistics object contains info about the event&#39;s current stats.
    * These include concurrent viewers and total chat count. Statistics can
    * change (in either direction) during the lifetime of an event. Statistics
    * are only returned while the event is live.
    */
  var statistics: js.UndefOr[SchemaLiveBroadcastStatistics] = js.undefined
  
  /**
    * The status object contains information about the event&#39;s status.
    */
  var status: js.UndefOr[SchemaLiveBroadcastStatus] = js.undefined
}
object SchemaLiveBroadcast {
  
  inline def apply(): SchemaLiveBroadcast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcast]
  }
  
  extension [Self <: SchemaLiveBroadcast](x: Self) {
    
    inline def setContentDetails(value: SchemaLiveBroadcastContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSnippet(value: SchemaLiveBroadcastSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStatistics(value: SchemaLiveBroadcastStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setStatus(value: SchemaLiveBroadcastStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
