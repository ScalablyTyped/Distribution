package typings.hapi.mod.Util

import typings.hapi.hapiStrings.delete_
import typings.hapi.hapiStrings.get_
import typings.hapi.hapiStrings.options_
import typings.hapi.hapiStrings.patch_
import typings.hapi.hapiStrings.post_
import typings.hapi.hapiStrings.put_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapi.hapiStrings.GET
  - typings.hapi.hapiStrings.POST
  - typings.hapi.hapiStrings.PUT
  - typings.hapi.hapiStrings.PATCH
  - typings.hapi.hapiStrings.DELETE
  - typings.hapi.hapiStrings.OPTIONS
  - typings.hapi.hapiStrings.get_
  - typings.hapi.hapiStrings.post_
  - typings.hapi.hapiStrings.put_
  - typings.hapi.hapiStrings.patch_
  - typings.hapi.hapiStrings.delete_
  - typings.hapi.hapiStrings.options_
*/
trait HTTP_METHODS_PARTIAL extends js.Object

object HTTP_METHODS_PARTIAL {
  @scala.inline
  def DELETE: typings.hapi.hapiStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.hapi.hapiStrings.GET = this.cast("GET")
  @scala.inline
  def OPTIONS: typings.hapi.hapiStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.hapi.hapiStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.hapi.hapiStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.hapi.hapiStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def get: get_ = this.cast("get")
  @scala.inline
  def options: options_ = this.cast("options")
  @scala.inline
  def patch: patch_ = this.cast("patch")
  @scala.inline
  def post: post_ = this.cast("post")
  @scala.inline
  def put: put_ = this.cast("put")
}

