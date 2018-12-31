package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_TypeCallback extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
  def apply(`type`: java.lang.String): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  def apply(
    `type`: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeSObjectResult, 
      scala.Unit
    ]
  ): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  def clear(): scala.Unit = js.native
}

