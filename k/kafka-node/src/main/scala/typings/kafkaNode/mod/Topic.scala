package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic extends js.Object {
  var autoCommit: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Double] = js.native
  var topic: String = js.native
}

object Topic {
  @scala.inline
  def apply(topic: String): Topic = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  @scala.inline
  implicit class TopicOps[Self <: Topic] (val x: Self) extends AnyVal {
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
    def setAutoCommit(value: Boolean): Self = this.set("autoCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCommit: Self = this.set("autoCommit", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

