package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionContentDetails extends StObject {
  
  /**
    * The type of activity this subscription is for (only uploads, everything).
    */
  var activityType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of new items in the subscription since its content was last read.
    */
  var newItemCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The approximate number of items that the subscription points to.
    */
  var totalItemCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSubscriptionContentDetails {
  
  inline def apply(): SchemaSubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionContentDetails]
  }
  
  extension [Self <: SchemaSubscriptionContentDetails](x: Self) {
    
    inline def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setActivityTypeNull: Self = StObject.set(x, "activityType", null)
    
    inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    inline def setNewItemCount(value: Double): Self = StObject.set(x, "newItemCount", value.asInstanceOf[js.Any])
    
    inline def setNewItemCountNull: Self = StObject.set(x, "newItemCount", null)
    
    inline def setNewItemCountUndefined: Self = StObject.set(x, "newItemCount", js.undefined)
    
    inline def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
    
    inline def setTotalItemCountNull: Self = StObject.set(x, "totalItemCount", null)
    
    inline def setTotalItemCountUndefined: Self = StObject.set(x, "totalItemCount", js.undefined)
  }
}
