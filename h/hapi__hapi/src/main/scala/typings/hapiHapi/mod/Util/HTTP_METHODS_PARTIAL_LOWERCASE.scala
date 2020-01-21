package typings.hapiHapi.mod.Util

import typings.hapiHapi.hapiHapiStrings.delete_
import typings.hapiHapi.hapiHapiStrings.get_
import typings.hapiHapi.hapiHapiStrings.options_
import typings.hapiHapi.hapiHapiStrings.patch_
import typings.hapiHapi.hapiHapiStrings.post_
import typings.hapiHapi.hapiHapiStrings.put_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.hapiHapiStrings.get_
  - typings.hapiHapi.hapiHapiStrings.post_
  - typings.hapiHapi.hapiHapiStrings.put_
  - typings.hapiHapi.hapiHapiStrings.patch_
  - typings.hapiHapi.hapiHapiStrings.delete_
  - typings.hapiHapi.hapiHapiStrings.options_
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

