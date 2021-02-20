package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Subscriptions. This is the response from the server to GET
  * requests on the subscription collection.
  */
@js.native
trait SchemaSubscriptionsListResponse extends StObject {
  
  /**
    * The list of subscriptions.
    */
  var items: js.UndefOr[js.Array[SchemaSubscription]] = js.native
  
  /**
    * The type of resource. This is always mirror#subscriptionsList.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaSubscriptionsListResponse {
  
  @scala.inline
  def apply(): SchemaSubscriptionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionsListResponse]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionsListResponseMutableBuilder[Self <: SchemaSubscriptionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaSubscription]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaSubscription*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
