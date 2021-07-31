package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the content to witch a subscription refers.
  */
trait SchemaSubscriptionContentDetails extends StObject {
  
  /**
    * The type of activity this subscription is for (only uploads, everything).
    */
  var activityType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of new items in the subscription since its content was last
    * read.
    */
  var newItemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The approximate number of items that the subscription points to.
    */
  var totalItemCount: js.UndefOr[Double] = js.undefined
}
object SchemaSubscriptionContentDetails {
  
  @scala.inline
  def apply(): SchemaSubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionContentDetails]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionContentDetailsMutableBuilder[Self <: SchemaSubscriptionContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    @scala.inline
    def setNewItemCount(value: Double): Self = StObject.set(x, "newItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItemCountUndefined: Self = StObject.set(x, "newItemCount", js.undefined)
    
    @scala.inline
    def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemCountUndefined: Self = StObject.set(x, "totalItemCount", js.undefined)
  }
}
