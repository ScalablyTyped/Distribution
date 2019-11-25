package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderConfig extends js.Object {
  /**
    * Max number of load retries
    */
  var maxRetry: Double
  /**
    * max connection retry delay (ms)
    */
  var maxRetryDelay: Double
  /**
    * Delay between an I/O error and following connection retry (ms). This to avoid spamming the server
    */
  var retryDelay: Double
  /**
    * Timeout after which `onTimeOut` callback will be triggered (if loading is still not finished after that delay)
    */
  var timeout: Double
}

object LoaderConfig {
  @scala.inline
  def apply(maxRetry: Double, maxRetryDelay: Double, retryDelay: Double, timeout: Double): LoaderConfig = {
    val __obj = js.Dynamic.literal(maxRetry = maxRetry.asInstanceOf[js.Any], maxRetryDelay = maxRetryDelay.asInstanceOf[js.Any], retryDelay = retryDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoaderConfig]
  }
}

