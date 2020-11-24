package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Subscriptions. This is the response from the server to GET
  * requests on the subscription collection.
  */
@js.native
trait SchemaSubscriptionsListResponse extends js.Object {
  
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
  implicit class SchemaSubscriptionsListResponseOps[Self <: SchemaSubscriptionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: SchemaSubscription*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaSubscription]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
