package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupContentDetails extends StObject {
  
  /**
    * The number of items in the group.
    */
  var itemCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of resources that the group contains. Valid values for this property are: * `youtube#channel` * `youtube#playlist` * `youtube#video` * `youtubePartner#asset`
    */
  var itemType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroupContentDetails {
  
  inline def apply(): SchemaGroupContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupContentDetails]
  }
  
  extension [Self <: SchemaGroupContentDetails](x: Self) {
    
    inline def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountNull: Self = StObject.set(x, "itemCount", null)
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeNull: Self = StObject.set(x, "itemType", null)
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
  }
}
