package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.hapiHapiBooleans.`false`
  - typings.hapiHapi.hapiHapiStrings.None
  - typings.hapiHapi.hapiHapiStrings.Lax
  - typings.hapiHapi.hapiHapiStrings.Strict
*/
trait SameSitePolicy extends js.Object

object SameSitePolicy {
  @scala.inline
  def Lax: typings.hapiHapi.hapiHapiStrings.Lax = this.cast("Lax")
  @scala.inline
  def None: typings.hapiHapi.hapiHapiStrings.None = this.cast("None")
  @scala.inline
  def Strict: typings.hapiHapi.hapiHapiStrings.Strict = this.cast("Strict")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typings.hapiHapi.hapiHapiBooleans.`false` = this.cast(false)
}

