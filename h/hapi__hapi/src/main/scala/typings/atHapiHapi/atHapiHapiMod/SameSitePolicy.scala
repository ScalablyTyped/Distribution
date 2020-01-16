package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atHapiHapi.atHapiHapiBooleans.`false`
  - typings.atHapiHapi.atHapiHapiStrings.None
  - typings.atHapiHapi.atHapiHapiStrings.Lax
  - typings.atHapiHapi.atHapiHapiStrings.Strict
*/
trait SameSitePolicy extends js.Object

object SameSitePolicy {
  @scala.inline
  def Lax: typings.atHapiHapi.atHapiHapiStrings.Lax = this.cast("Lax")
  @scala.inline
  def None: typings.atHapiHapi.atHapiHapiStrings.None = this.cast("None")
  @scala.inline
  def Strict: typings.atHapiHapi.atHapiHapiStrings.Strict = this.cast("Strict")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typings.atHapiHapi.atHapiHapiBooleans.`false` = this.cast(false)
}

