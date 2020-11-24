package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedOutputConfig extends js.Object {
  
  /** Destination on Pub/Sub. */
  var pubsubDestination: js.UndefOr[PubsubDestination] = js.native
}
object FeedOutputConfig {
  
  @scala.inline
  def apply(): FeedOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedOutputConfig]
  }
  
  @scala.inline
  implicit class FeedOutputConfigOps[Self <: FeedOutputConfig] (val x: Self) extends AnyVal {
    
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
    def setPubsubDestination(value: PubsubDestination): Self = this.set("pubsubDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubDestination: Self = this.set("pubsubDestination", js.undefined)
  }
}
