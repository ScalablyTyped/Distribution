package typings
package lolexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  /**
    * Mimicks process.hrtime().
    *
    * @param prevTime   Previous system time to calculate time elapsed.
    * @returns High resolution real time as [seconds, nanoseconds].
    */
  def hrtime(): js.Tuple2[scala.Double, scala.Double] = js.native
  def hrtime(prevTime: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
    * Simulates process.nextTick().
    */
  def nextTick(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Mimics process.nextTick() explicitly dropping additional arguments.
    */
  def queueMicrotask(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
  	 * Run all pending microtasks scheduled with nextTick.
  	 */
  def runMicrotasks(): scala.Unit = js.native
}

