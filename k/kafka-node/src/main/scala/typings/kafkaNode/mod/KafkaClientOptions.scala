package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KafkaClientOptions extends js.Object {
  
  var autoConnect: js.UndefOr[Boolean] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var connectRetryOptions: js.UndefOr[RetryOptions] = js.native
  
  var connectTimeout: js.UndefOr[Double] = js.native
  
  var idleConnection: js.UndefOr[Double] = js.native
  
  var kafkaHost: js.UndefOr[String] = js.native
  
  var maxAsyncRequests: js.UndefOr[Double] = js.native
  
  var reconnectOnIdle: js.UndefOr[Boolean] = js.native
  
  var requestTimeout: js.UndefOr[Double] = js.native
  
  var sasl: js.UndefOr[js.Any] = js.native
  
  var sslOptions: js.UndefOr[js.Any] = js.native
}
object KafkaClientOptions {
  
  @scala.inline
  def apply(): KafkaClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaClientOptions]
  }
  
  @scala.inline
  implicit class KafkaClientOptionsOps[Self <: KafkaClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoConnect(value: Boolean): Self = this.set("autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConnect: Self = this.set("autoConnect", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setConnectRetryOptions(value: RetryOptions): Self = this.set("connectRetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectRetryOptions: Self = this.set("connectRetryOptions", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setIdleConnection(value: Double): Self = this.set("idleConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleConnection: Self = this.set("idleConnection", js.undefined)
    
    @scala.inline
    def setKafkaHost(value: String): Self = this.set("kafkaHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKafkaHost: Self = this.set("kafkaHost", js.undefined)
    
    @scala.inline
    def setMaxAsyncRequests(value: Double): Self = this.set("maxAsyncRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAsyncRequests: Self = this.set("maxAsyncRequests", js.undefined)
    
    @scala.inline
    def setReconnectOnIdle(value: Boolean): Self = this.set("reconnectOnIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectOnIdle: Self = this.set("reconnectOnIdle", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
    
    @scala.inline
    def setSasl(value: js.Any): Self = this.set("sasl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSasl: Self = this.set("sasl", js.undefined)
    
    @scala.inline
    def setSslOptions(value: js.Any): Self = this.set("sslOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslOptions: Self = this.set("sslOptions", js.undefined)
  }
}
