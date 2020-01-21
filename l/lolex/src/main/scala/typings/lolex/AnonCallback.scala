package typings.lolex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback extends js.Object {
  /**
    * Mimicks process.hrtime().
    *
    * @param prevTime   Previous system time to calculate time elapsed.
    * @returns High resolution real time as [seconds, nanoseconds].
    */
  def hrtime(): js.Tuple2[Double, Double] = js.native
  def hrtime(prevTime: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  /**
    * Simulates process.nextTick().
    */
  def nextTick(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Mimics process.nextTick() explicitly dropping additional arguments.
    */
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Run all pending microtasks scheduled with nextTick.
    */
  def runMicrotasks(): Unit = js.native
}

