package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSubscriptionPurchasesDeferResponse extends StObject {
  
  /**
    * The new expiry time for the subscription in milliseconds since the Epoch.
    */
  var newExpiryTimeMillis: js.UndefOr[String] = js.native
}
object SchemaSubscriptionPurchasesDeferResponse {
  
  @scala.inline
  def apply(): SchemaSubscriptionPurchasesDeferResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchasesDeferResponse]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionPurchasesDeferResponseMutableBuilder[Self <: SchemaSubscriptionPurchasesDeferResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewExpiryTimeMillis(value: String): Self = StObject.set(x, "newExpiryTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewExpiryTimeMillisUndefined: Self = StObject.set(x, "newExpiryTimeMillis", js.undefined)
  }
}
