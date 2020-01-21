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
  - typings.hapi.hapiStrings.get_
  - typings.hapi.hapiStrings.post_
  - typings.hapi.hapiStrings.put_
  - typings.hapi.hapiStrings.patch_
  - typings.hapi.hapiStrings.delete_
  - typings.hapi.hapiStrings.options_
*/
trait HTTP_METHODS_PARTIAL_LOWERCASE extends js.Object

object HTTP_METHODS_PARTIAL_LOWERCASE {
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

