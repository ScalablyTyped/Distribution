package typings.atGrpcGrpcDashJs.buildSrcBackoffDashTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/backoff-timeout", "BackoffTimeout")
@js.native
class BackoffTimeout protected () extends js.Object {
  def this(callback: js.Function0[Unit]) = this()
  def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
  var callback: js.Any = js.native
  var initialDelay: js.Any = js.native
  var jitter: js.Any = js.native
  var maxDelay: js.Any = js.native
  var multiplier: js.Any = js.native
  var nextDelay: js.Any = js.native
  var running: js.Any = js.native
  var timerId: js.Any = js.native
  def isRunning(): Boolean = js.native
  /**
    * Reset the delay time to its initial value.
    */
  def reset(): Unit = js.native
  /**
    * Call the callback after the current amount of delay time
    */
  def runOnce(): Unit = js.native
  /**
    * Stop the timer. The callback will not be called until `runOnce` is called
    * again.
    */
  def stop(): Unit = js.native
}

