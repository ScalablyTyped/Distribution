package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about a resource which was added to a channel.
  */
@js.native
trait SchemaActivityContentDetailsChannelItem extends StObject {
  
  /**
    * The resourceId object contains information that identifies the resource
    * that was added to the channel.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}
object SchemaActivityContentDetailsChannelItem {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsChannelItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsChannelItem]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsChannelItemMutableBuilder[Self <: SchemaActivityContentDetailsChannelItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
