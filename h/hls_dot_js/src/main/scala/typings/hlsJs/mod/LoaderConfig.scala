package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderConfig extends js.Object {
  
  /**
    * Max number of load retries
    */
  var maxRetry: Double = js.native
  
  /**
    * max connection retry delay (ms)
    */
  var maxRetryDelay: Double = js.native
  
  /**
    * Delay between an I/O error and following connection retry (ms). This to avoid spamming the server
    */
  var retryDelay: Double = js.native
  
  /**
    * Timeout after which `onTimeOut` callback will be triggered (if loading is still not finished after that delay)
    */
  var timeout: Double = js.native
}
object LoaderConfig {
  
  @scala.inline
  def apply(maxRetry: Double, maxRetryDelay: Double, retryDelay: Double, timeout: Double): LoaderConfig = {
    val __obj = js.Dynamic.literal(maxRetry = maxRetry.asInstanceOf[js.Any], maxRetryDelay = maxRetryDelay.asInstanceOf[js.Any], retryDelay = retryDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderConfig]
  }
  
  @scala.inline
  implicit class LoaderConfigOps[Self <: LoaderConfig] (val x: Self) extends AnyVal {
    
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
    def setMaxRetry(value: Double): Self = this.set("maxRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetryDelay(value: Double): Self = this.set("maxRetryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
