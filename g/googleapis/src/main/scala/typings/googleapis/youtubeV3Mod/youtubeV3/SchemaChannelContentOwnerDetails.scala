package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The contentOwnerDetails object encapsulates channel data that is relevant
  * for YouTube Partners linked with the channel.
  */
@js.native
trait SchemaChannelContentOwnerDetails extends StObject {
  
  /**
    * The ID of the content owner linked to the channel.
    */
  var contentOwner: js.UndefOr[String] = js.native
  
  /**
    * The date and time of when the channel was linked to the content owner.
    * The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var timeLinked: js.UndefOr[String] = js.native
}
object SchemaChannelContentOwnerDetails {
  
  @scala.inline
  def apply(): SchemaChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelContentOwnerDetails]
  }
  
  @scala.inline
  implicit class SchemaChannelContentOwnerDetailsMutableBuilder[Self <: SchemaChannelContentOwnerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentOwner(value: String): Self = StObject.set(x, "contentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOwnerUndefined: Self = StObject.set(x, "contentOwner", js.undefined)
    
    @scala.inline
    def setTimeLinked(value: String): Self = StObject.set(x, "timeLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLinkedUndefined: Self = StObject.set(x, "timeLinked", js.undefined)
  }
}
