package typings.googleapis.pubsubV1Mod.pubsubV1

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
    * The push configuration for future deliveries.  An empty `pushConfig`
    * indicates that the Pub/Sub system should stop pushing messages from the
    * given subscription and allow messages to be pulled and acknowledged -
    * effectively pausing the subscription if `Pull` or `StreamingPull` is not
    * called.
    */
  var pushConfig: js.UndefOr[SchemaPushConfig] = js.native
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
  }
}
