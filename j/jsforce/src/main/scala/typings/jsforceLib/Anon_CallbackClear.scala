package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackClear extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
  def apply(): jsforceLib.describeDashResultMod.DescribeGlobalResult = js.native
  def apply(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeGlobalResult, 
      scala.Unit
    ]
  ): jsforceLib.describeDashResultMod.DescribeGlobalResult = js.native
  def clear(): scala.Unit = js.native
}

