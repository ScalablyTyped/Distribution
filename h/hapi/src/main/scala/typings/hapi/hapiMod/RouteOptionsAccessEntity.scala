package typings.hapi.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapi.hapiStrings.any
  - typings.hapi.hapiStrings.user
  - typings.hapi.hapiStrings.app
*/
trait RouteOptionsAccessEntity extends js.Object

object RouteOptionsAccessEntity {
  @scala.inline
  def any: typings.hapi.hapiStrings.any = this.cast("any")
  @scala.inline
  def app: typings.hapi.hapiStrings.app = this.cast("app")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def user: typings.hapi.hapiStrings.user = this.cast("user")
}

