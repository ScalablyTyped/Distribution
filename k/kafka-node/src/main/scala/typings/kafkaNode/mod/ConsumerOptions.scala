package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.buffer
import typings.kafkaNode.kafkaNodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerOptions extends js.Object {
  var autoCommit: js.UndefOr[Boolean] = js.native
  var autoCommitIntervalMs: js.UndefOr[Double] = js.native
  var encoding: js.UndefOr[buffer | utf8] = js.native
  var fetchMaxBytes: js.UndefOr[Double] = js.native
  var fetchMaxWaitMs: js.UndefOr[Double] = js.native
  var fetchMinBytes: js.UndefOr[Double] = js.native
  var fromOffset: js.UndefOr[Boolean] = js.native
  var groupId: js.UndefOr[String] = js.native
  var keyEncoding: js.UndefOr[buffer | utf8] = js.native
}

object ConsumerOptions {
  @scala.inline
  def apply(): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerOptions]
  }
  @scala.inline
  implicit class ConsumerOptionsOps[Self <: ConsumerOptions] (val x: Self) extends AnyVal {
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
    def setAutoCommit(value: Boolean): Self = this.set("autoCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCommit: Self = this.set("autoCommit", js.undefined)
    @scala.inline
    def setAutoCommitIntervalMs(value: Double): Self = this.set("autoCommitIntervalMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCommitIntervalMs: Self = this.set("autoCommitIntervalMs", js.undefined)
    @scala.inline
    def setEncoding(value: buffer | utf8): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFetchMaxBytes(value: Double): Self = this.set("fetchMaxBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchMaxBytes: Self = this.set("fetchMaxBytes", js.undefined)
    @scala.inline
    def setFetchMaxWaitMs(value: Double): Self = this.set("fetchMaxWaitMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchMaxWaitMs: Self = this.set("fetchMaxWaitMs", js.undefined)
    @scala.inline
    def setFetchMinBytes(value: Double): Self = this.set("fetchMinBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchMinBytes: Self = this.set("fetchMinBytes", js.undefined)
    @scala.inline
    def setFromOffset(value: Boolean): Self = this.set("fromOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromOffset: Self = this.set("fromOffset", js.undefined)
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    @scala.inline
    def setKeyEncoding(value: buffer | utf8): Self = this.set("keyEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyEncoding: Self = this.set("keyEncoding", js.undefined)
  }
  
}

