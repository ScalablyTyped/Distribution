package typings
package lolexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Hrtime extends js.Object {
  /**
       * Mimicks process.hrtime().
       *
       * @param prevTime   Previous system time to calculate time elapsed.
       * @returns High resolution real time as [seconds, nanoseconds].
       */
  def hrtime(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
       * Mimicks process.hrtime().
       *
       * @param prevTime   Previous system time to calculate time elapsed.
       * @returns High resolution real time as [seconds, nanoseconds].
       */
  def hrtime(prevTime: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
}

