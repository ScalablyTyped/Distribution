package typings.jsforce

import typings.jsforce.describeDashResultMod.DescribeGlobalResult
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackClear extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
  def apply(): DescribeGlobalResult = js.native
  def apply(callback: js.Function2[/* err */ Error, /* result */ DescribeGlobalResult, Unit]): DescribeGlobalResult = js.native
  def clear(): Unit = js.native
}

