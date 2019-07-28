package typings.jsforce

import typings.jsforce.connectionMod.Callback
import typings.jsforce.describeDashResultMod.DescribeSObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackClearDescribeSObjectResult extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls SObject.describe */
  def apply(): DescribeSObjectResult = js.native
  def apply(callback: Callback[DescribeSObjectResult]): DescribeSObjectResult = js.native
  def clear(): Unit = js.native
}

