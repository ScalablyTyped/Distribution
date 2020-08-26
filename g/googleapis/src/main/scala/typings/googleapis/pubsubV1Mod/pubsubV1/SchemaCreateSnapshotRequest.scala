package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the `CreateSnapshot` method.
  */
@js.native
trait SchemaCreateSnapshotRequest extends js.Object {
  /**
    * See &lt;a
    * href=&quot;https://cloud.google.com/pubsub/docs/labels&quot;&gt; Creating
    * and managing labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The subscription whose backlog the snapshot retains. Specifically, the
    * created snapshot is guaranteed to retain:  (a) The existing backlog on
    * the subscription. More precisely, this is      defined as the messages in
    * the subscription&#39;s backlog that are      unacknowledged upon the
    * successful completion of the      `CreateSnapshot` request; as well as:
    * (b) Any messages published to the subscription&#39;s topic following the
    * successful completion of the CreateSnapshot request. Format is
    * `projects/{project}/subscriptions/{sub}`.
    */
  var subscription: js.UndefOr[String] = js.native
}

object SchemaCreateSnapshotRequest {
  @scala.inline
  def apply(): SchemaCreateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSnapshotRequest]
  }
  @scala.inline
  implicit class SchemaCreateSnapshotRequestOps[Self <: SchemaCreateSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
  
}

