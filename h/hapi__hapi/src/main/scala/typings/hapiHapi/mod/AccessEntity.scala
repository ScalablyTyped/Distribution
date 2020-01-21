package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.hapiHapiStrings.any
  - typings.hapiHapi.hapiHapiStrings.user
  - typings.hapiHapi.hapiHapiStrings.app
*/
trait AccessEntity extends js.Object

object AccessEntity {
  @scala.inline
  def any: typings.hapiHapi.hapiHapiStrings.any = this.cast("any")
  @scala.inline
  def app: typings.hapiHapi.hapiHapiStrings.app = this.cast("app")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def user: typings.hapiHapi.hapiHapiStrings.user = this.cast("user")
}

