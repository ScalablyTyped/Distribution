package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group&#39;s content details.
  */
@js.native
trait SchemaGroupContentDetails extends StObject {
  
  /**
    * The number of items in the group.
    */
  var itemCount: js.UndefOr[String] = js.native
  
  /**
    * The type of resources that the group contains.  Valid values for this
    * property are:  * `youtube#channel`  * `youtube#playlist`  *
    * `youtube#video`  * `youtubePartner#asset`
    */
  var itemType: js.UndefOr[String] = js.native
}
object SchemaGroupContentDetails {
  
  @scala.inline
  def apply(): SchemaGroupContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupContentDetails]
  }
  
  @scala.inline
  implicit class SchemaGroupContentDetailsMutableBuilder[Self <: SchemaGroupContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
  }
}
