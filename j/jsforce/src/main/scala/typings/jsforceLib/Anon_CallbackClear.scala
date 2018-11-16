package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackClear extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls SObject.describe */
  def apply(): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  /** Returns a value from the cache if it exists, otherwise calls SObject.describe */
  def apply(
    callback: jsforceLib.connectionMod.Callback[jsforceLib.describeDashResultMod.DescribeSObjectResult]
  ): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  def clear(): scala.Unit = js.native
}

