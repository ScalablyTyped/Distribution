package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderConfig extends js.Object {
  /**
    * Max number of load retries
    */
  var maxRetry: scala.Double
  /**
    * max connection retry delay (ms)
    */
  var maxRetryDelay: scala.Double
  /**
    * Delay between an I/O error and following connection retry (ms). This to avoid spamming the server
    */
  var retryDelay: scala.Double
  /**
    * Timeout after which `onTimeOut` callback will be triggered (if loading is still not finished after that delay)
    */
  var timeout: scala.Double
}

