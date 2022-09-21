package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNegativeKeywordList extends StObject {
  
  /**
    * Output only. The unique ID of the advertiser the negative keyword list belongs to.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display name of the negative keyword list. Must be UTF-8 encoded with a maximum size of 255 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the negative keyword list.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique ID of the negative keyword list. Assigned by the system.
    */
  var negativeKeywordListId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of line items that are directly targeting this negative keyword list.
    */
  var targetedLineItemCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaNegativeKeywordList {
  
  inline def apply(): SchemaNegativeKeywordList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNegativeKeywordList]
  }
  
  extension [Self <: SchemaNegativeKeywordList](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNegativeKeywordListId(value: String): Self = StObject.set(x, "negativeKeywordListId", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListIdNull: Self = StObject.set(x, "negativeKeywordListId", null)
    
    inline def setNegativeKeywordListIdUndefined: Self = StObject.set(x, "negativeKeywordListId", js.undefined)
    
    inline def setTargetedLineItemCount(value: String): Self = StObject.set(x, "targetedLineItemCount", value.asInstanceOf[js.Any])
    
    inline def setTargetedLineItemCountNull: Self = StObject.set(x, "targetedLineItemCount", null)
    
    inline def setTargetedLineItemCountUndefined: Self = StObject.set(x, "targetedLineItemCount", js.undefined)
  }
}
