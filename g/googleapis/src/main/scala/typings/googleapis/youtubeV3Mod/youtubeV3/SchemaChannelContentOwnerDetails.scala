package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The contentOwnerDetails object encapsulates channel data that is relevant
  * for YouTube Partners linked with the channel.
  */
trait SchemaChannelContentOwnerDetails extends StObject {
  
  /**
    * The ID of the content owner linked to the channel.
    */
  var contentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time of when the channel was linked to the content owner.
    * The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var timeLinked: js.UndefOr[String] = js.undefined
}
object SchemaChannelContentOwnerDetails {
  
  inline def apply(): SchemaChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelContentOwnerDetails]
  }
  
  extension [Self <: SchemaChannelContentOwnerDetails](x: Self) {
    
    inline def setContentOwner(value: String): Self = StObject.set(x, "contentOwner", value.asInstanceOf[js.Any])
    
    inline def setContentOwnerUndefined: Self = StObject.set(x, "contentOwner", js.undefined)
    
    inline def setTimeLinked(value: String): Self = StObject.set(x, "timeLinked", value.asInstanceOf[js.Any])
    
    inline def setTimeLinkedUndefined: Self = StObject.set(x, "timeLinked", js.undefined)
  }
}
