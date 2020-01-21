package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hellojs.hellojsStrings.code
  - typings.hellojs.hellojsStrings.`code id_token`
  - typings.hellojs.hellojsStrings.`code id_token token`
  - typings.hellojs.hellojsStrings.`code token`
  - typings.hellojs.hellojsStrings.id_token
  - typings.hellojs.hellojsStrings.`id_token token`
  - typings.hellojs.hellojsStrings.none
  - typings.hellojs.hellojsStrings.token
*/
trait HelloJSTokenResponseType extends js.Object

object HelloJSTokenResponseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.hellojs.hellojsStrings.code = this.cast("code")
  @scala.inline
  def `code id_token`: typings.hellojs.hellojsStrings.`code id_token` = this.cast("code id_token")
  @scala.inline
  def `code id_token token`: typings.hellojs.hellojsStrings.`code id_token token` = this.cast("code id_token token")
  @scala.inline
  def `code token`: typings.hellojs.hellojsStrings.`code token` = this.cast("code token")
  @scala.inline
  def id_token: typings.hellojs.hellojsStrings.id_token = this.cast("id_token")
  @scala.inline
  def `id_token token`: typings.hellojs.hellojsStrings.`id_token token` = this.cast("id_token token")
  @scala.inline
  def none: typings.hellojs.hellojsStrings.none = this.cast("none")
  @scala.inline
  def token: typings.hellojs.hellojsStrings.token = this.cast("token")
}

