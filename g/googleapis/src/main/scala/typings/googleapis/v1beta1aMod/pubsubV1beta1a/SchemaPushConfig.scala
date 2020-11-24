package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a push delivery endpoint.
  */
@js.native
trait SchemaPushConfig extends js.Object {
  
  /**
    * A URL locating the endpoint to which messages should be pushed. For
    * example, a Webhook endpoint might use
    * &quot;https://example.com/push&quot;.
    */
  var pushEndpoint: js.UndefOr[String] = js.native
}
object SchemaPushConfig {
  
  @scala.inline
  def apply(): SchemaPushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushConfig]
  }
  
  @scala.inline
  implicit class SchemaPushConfigOps[Self <: SchemaPushConfig] (val x: Self) extends AnyVal {
    
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
    def setPushEndpoint(value: String): Self = this.set("pushEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushEndpoint: Self = this.set("pushEndpoint", js.undefined)
  }
}
