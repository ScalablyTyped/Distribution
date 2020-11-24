package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Publish the results of a DlpJob to a pub sub channel. Compatible with:
  * Inspect, Risk
  */
@js.native
trait SchemaGooglePrivacyDlpV2PublishToPubSub extends js.Object {
  
  /**
    * Cloud Pub/Sub topic to send notifications to. The topic must have given
    * publishing access rights to the DLP API service account executing the
    * long running DlpJob sending the notifications. Format is
    * projects/{project}/topics/{topic}.
    */
  var topic: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2PublishToPubSub {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2PublishToPubSub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PublishToPubSub]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PublishToPubSubOps[Self <: SchemaGooglePrivacyDlpV2PublishToPubSub] (val x: Self) extends AnyVal {
    
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
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
}
