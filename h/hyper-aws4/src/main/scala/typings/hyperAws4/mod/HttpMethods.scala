package typings.hyperAws4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hyperAws4.hyperAws4Strings.GET
  - typings.hyperAws4.hyperAws4Strings.POST
  - typings.hyperAws4.hyperAws4Strings.PUT
  - typings.hyperAws4.hyperAws4Strings.DELETE
  - typings.hyperAws4.hyperAws4Strings.PATCH
*/
trait HttpMethods extends js.Object

object HttpMethods {
  @scala.inline
  def DELETE: typings.hyperAws4.hyperAws4Strings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.hyperAws4.hyperAws4Strings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typings.hyperAws4.hyperAws4Strings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.hyperAws4.hyperAws4Strings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.hyperAws4.hyperAws4Strings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

