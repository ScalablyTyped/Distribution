package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the ModifyPushConfig method.
  */
@js.native
trait SchemaModifyPushConfigRequest extends StObject {
  
  /**
    * An empty &lt;code&gt;push_config&lt;/code&gt; indicates that the Pub/Sub
    * system should pause pushing messages from the given subscription.
    */
  var pushConfig: js.UndefOr[SchemaPushConfig] = js.native
  
  /**
    * The name of the subscription.
    */
  var subscription: js.UndefOr[String] = js.native
}
object SchemaModifyPushConfigRequest {
  
  @scala.inline
  def apply(): SchemaModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyPushConfigRequest]
  }
  
  @scala.inline
  implicit class SchemaModifyPushConfigRequestMutableBuilder[Self <: SchemaModifyPushConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushConfig(value: SchemaPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
