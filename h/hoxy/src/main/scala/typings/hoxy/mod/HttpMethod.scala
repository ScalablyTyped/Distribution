package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hoxy.hoxyStrings.POST
  - typings.hoxy.hoxyStrings.GET
  - typings.hoxy.hoxyStrings.PUT
  - typings.hoxy.hoxyStrings.PATCH
  - typings.hoxy.hoxyStrings.DELETE
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.hoxy.hoxyStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.hoxy.hoxyStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typings.hoxy.hoxyStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.hoxy.hoxyStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.hoxy.hoxyStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

