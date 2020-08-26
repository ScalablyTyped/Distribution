package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for watching changes to creative Status.
  */
@js.native
trait SchemaWatchCreativeRequest extends js.Object {
  /**
    * The Pub/Sub topic to publish notifications to. This topic must already
    * exist and must give permission to ad-exchange-buyside-reports@google.com
    * to write to the topic. This should be the full resource name in
    * &quot;projects/{project_id}/topics/{topic_id}&quot; format.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaWatchCreativeRequest {
  @scala.inline
  def apply(): SchemaWatchCreativeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchCreativeRequest]
  }
  @scala.inline
  implicit class SchemaWatchCreativeRequestOps[Self <: SchemaWatchCreativeRequest] (val x: Self) extends AnyVal {
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

