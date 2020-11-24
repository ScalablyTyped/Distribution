package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a PubSub connector used by the job.
  */
@js.native
trait SchemaPubSubIODetails extends js.Object {
  
  /**
    * Subscription used in the connection.
    */
  var subscription: js.UndefOr[String] = js.native
  
  /**
    * Topic accessed in the connection.
    */
  var topic: js.UndefOr[String] = js.native
}
object SchemaPubSubIODetails {
  
  @scala.inline
  def apply(): SchemaPubSubIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubSubIODetails]
  }
  
  @scala.inline
  implicit class SchemaPubSubIODetailsOps[Self <: SchemaPubSubIODetails] (val x: Self) extends AnyVal {
    
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
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
}
