package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the ModifyPushConfig method.
  */
@js.native
trait SchemaModifyPushConfigRequest extends js.Object {
  
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
  implicit class SchemaModifyPushConfigRequestOps[Self <: SchemaModifyPushConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setPushConfig(value: SchemaPushConfig): Self = this.set("pushConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushConfig: Self = this.set("pushConfig", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
}
