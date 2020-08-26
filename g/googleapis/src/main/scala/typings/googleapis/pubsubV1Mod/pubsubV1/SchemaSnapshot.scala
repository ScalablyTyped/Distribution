package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A snapshot resource. Snapshots are used in &lt;a
  * href=&quot;https://cloud.google.com/pubsub/docs/replay-overview&quot;&gt;Seek&lt;/a&gt;
  * operations, which allow you to manage message acknowledgments in bulk. That
  * is, you can set the acknowledgment state of messages in an existing
  * subscription to the state captured by a snapshot.
  */
@js.native
trait SchemaSnapshot extends js.Object {
  /**
    * The snapshot is guaranteed to exist up until this time. A newly-created
    * snapshot expires no later than 7 days from the time of its creation. Its
    * exact lifetime is determined at creation by the existing backlog in the
    * source subscription. Specifically, the lifetime of the snapshot is `7
    * days - (age of oldest unacked message in the subscription)`. For example,
    * consider a subscription whose oldest unacked message is 3 days old. If a
    * snapshot is created from this subscription, the snapshot -- which will
    * always capture this 3-day-old backlog as long as the snapshot exists --
    * will expire in 4 days. The service will refuse to create a snapshot that
    * would expire in less than 1 hour after creation.
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * See &lt;a
    * href=&quot;https://cloud.google.com/pubsub/docs/labels&quot;&gt; Creating
    * and managing labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The name of the snapshot.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of the topic from which this snapshot is retaining messages.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaSnapshot {
  @scala.inline
  def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  @scala.inline
  implicit class SchemaSnapshotOps[Self <: SchemaSnapshot] (val x: Self) extends AnyVal {
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
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

