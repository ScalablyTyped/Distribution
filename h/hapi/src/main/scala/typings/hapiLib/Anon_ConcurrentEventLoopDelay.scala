package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConcurrentEventLoopDelay extends js.Object {
  /**
    * Max concurrent requests.
    */
  var concurrent: scala.Double
  /**
    * event loop delay milliseconds.
    */
  var eventLoopDelay: scala.Double
  /**
    * V8 heap usage.
    */
  var heapUsed: scala.Double
  /**
    * RSS memory usage.
    */
  var rss: scala.Double
}

