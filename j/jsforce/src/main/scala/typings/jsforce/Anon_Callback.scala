package typings.jsforce

import typings.jsforce.describeDashResultMod.DescribeSObjectResult
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
  def apply(`type`: String): DescribeSObjectResult = js.native
  def apply(`type`: String, callback: js.Function2[/* err */ Error, /* result */ DescribeSObjectResult, Unit]): DescribeSObjectResult = js.native
  def clear(): Unit = js.native
}

