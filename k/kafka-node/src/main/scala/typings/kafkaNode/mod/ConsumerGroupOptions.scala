package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.buffer
import typings.kafkaNode.kafkaNodeStrings.earliest
import typings.kafkaNode.kafkaNodeStrings.latest
import typings.kafkaNode.kafkaNodeStrings.none
import typings.kafkaNode.kafkaNodeStrings.range
import typings.kafkaNode.kafkaNodeStrings.roundrobin
import typings.kafkaNode.kafkaNodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerGroupOptions extends js.Object {
  
  var autoCommit: js.UndefOr[Boolean] = js.native
  
  var autoCommitIntervalMs: js.UndefOr[Double] = js.native
  
  var batch: js.UndefOr[AckBatchOptions] = js.native
  
  var connectOnReady: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[buffer | utf8] = js.native
  
  var fetchMaxBytes: js.UndefOr[Double] = js.native
  
  var fetchMaxWaitMs: js.UndefOr[Double] = js.native
  
  var fetchMinBytes: js.UndefOr[Double] = js.native
  
  var fromOffset: js.UndefOr[earliest | latest | none] = js.native
  
  var groupId: String = js.native
  
  var heartbeatInterval: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kafkaHost: js.UndefOr[String] = js.native
  
  var keyEncoding: js.UndefOr[buffer | utf8] = js.native
  
  var maxNumSegments: js.UndefOr[Double] = js.native
  
  var maxTickMessages: js.UndefOr[Double] = js.native
  
  var migrateHLC: js.UndefOr[Boolean] = js.native
  
  var migrateRolling: js.UndefOr[Boolean] = js.native
  
  var onRebalance: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  var outOfRangeOffset: js.UndefOr[earliest | latest | none] = js.native
  
  var protocol: js.UndefOr[js.Array[roundrobin | range | CustomPartitionAssignmentProtocol]] = js.native
  
  var retries: js.UndefOr[Double] = js.native
  
  var retryFactor: js.UndefOr[Double] = js.native
  
  var retryMinTimeout: js.UndefOr[Double] = js.native
  
  var sasl: js.UndefOr[js.Any] = js.native
  
  var sessionTimeout: js.UndefOr[Double] = js.native
  
  var ssl: js.UndefOr[Boolean] = js.native
  
  var sslOptions: js.UndefOr[js.Any] = js.native
}
object ConsumerGroupOptions {
  
  @scala.inline
  def apply(groupId: String): ConsumerGroupOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerGroupOptions]
  }
  
  @scala.inline
  implicit class ConsumerGroupOptionsOps[Self <: ConsumerGroupOptions] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCommit(value: Boolean): Self = this.set("autoCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCommit: Self = this.set("autoCommit", js.undefined)
    
    @scala.inline
    def setAutoCommitIntervalMs(value: Double): Self = this.set("autoCommitIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCommitIntervalMs: Self = this.set("autoCommitIntervalMs", js.undefined)
    
    @scala.inline
    def setBatch(value: AckBatchOptions): Self = this.set("batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    
    @scala.inline
    def setConnectOnReady(value: Boolean): Self = this.set("connectOnReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectOnReady: Self = this.set("connectOnReady", js.undefined)
    
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
    def setFromOffset(value: earliest | latest | none): Self = this.set("fromOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromOffset: Self = this.set("fromOffset", js.undefined)
    
    @scala.inline
    def setHeartbeatInterval(value: Double): Self = this.set("heartbeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatInterval: Self = this.set("heartbeatInterval", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKafkaHost(value: String): Self = this.set("kafkaHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKafkaHost: Self = this.set("kafkaHost", js.undefined)
    
    @scala.inline
    def setKeyEncoding(value: buffer | utf8): Self = this.set("keyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyEncoding: Self = this.set("keyEncoding", js.undefined)
    
    @scala.inline
    def setMaxNumSegments(value: Double): Self = this.set("maxNumSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumSegments: Self = this.set("maxNumSegments", js.undefined)
    
    @scala.inline
    def setMaxTickMessages(value: Double): Self = this.set("maxTickMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTickMessages: Self = this.set("maxTickMessages", js.undefined)
    
    @scala.inline
    def setMigrateHLC(value: Boolean): Self = this.set("migrateHLC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrateHLC: Self = this.set("migrateHLC", js.undefined)
    
    @scala.inline
    def setMigrateRolling(value: Boolean): Self = this.set("migrateRolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrateRolling: Self = this.set("migrateRolling", js.undefined)
    
    @scala.inline
    def setOnRebalance(value: () => js.Promise[Unit]): Self = this.set("onRebalance", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRebalance: Self = this.set("onRebalance", js.undefined)
    
    @scala.inline
    def setOutOfRangeOffset(value: earliest | latest | none): Self = this.set("outOfRangeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutOfRangeOffset: Self = this.set("outOfRangeOffset", js.undefined)
    
    @scala.inline
    def setProtocolVarargs(value: (roundrobin | range | CustomPartitionAssignmentProtocol)*): Self = this.set("protocol", js.Array(value :_*))
    
    @scala.inline
    def setProtocol(value: js.Array[roundrobin | range | CustomPartitionAssignmentProtocol]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setRetryFactor(value: Double): Self = this.set("retryFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryFactor: Self = this.set("retryFactor", js.undefined)
    
    @scala.inline
    def setRetryMinTimeout(value: Double): Self = this.set("retryMinTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryMinTimeout: Self = this.set("retryMinTimeout", js.undefined)
    
    @scala.inline
    def setSasl(value: js.Any): Self = this.set("sasl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSasl: Self = this.set("sasl", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setSslOptions(value: js.Any): Self = this.set("sslOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslOptions: Self = this.set("sslOptions", js.undefined)
  }
}
