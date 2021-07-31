package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the UpdateSubscription method.
  */
trait SchemaUpdateSubscriptionRequest extends StObject {
  
  /**
    * The updated subscription object.
    */
  var subscription: js.UndefOr[SchemaSubscription] = js.undefined
  
  /**
    * Indicates which fields in the provided subscription to update. Must be
    * specified and non-empty.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaUpdateSubscriptionRequest {
  
  @scala.inline
  def apply(): SchemaUpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSubscriptionRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateSubscriptionRequestMutableBuilder[Self <: SchemaUpdateSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: SchemaSubscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
