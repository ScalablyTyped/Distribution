package typings.inputmask.inputmaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inputmask.inputmaskStrings.verbatim
  - typings.inputmask.inputmaskStrings.none
  - typings.inputmask.inputmaskStrings.text
  - typings.inputmask.inputmaskStrings.decimal
  - typings.inputmask.inputmaskStrings.numeric
  - typings.inputmask.inputmaskStrings.tel
  - typings.inputmask.inputmaskStrings.search
  - typings.inputmask.inputmaskStrings.email
  - typings.inputmask.inputmaskStrings.url
*/
trait InputMode extends js.Object

object InputMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decimal: typings.inputmask.inputmaskStrings.decimal = this.cast("decimal")
  @scala.inline
  def email: typings.inputmask.inputmaskStrings.email = this.cast("email")
  @scala.inline
  def none: typings.inputmask.inputmaskStrings.none = this.cast("none")
  @scala.inline
  def numeric: typings.inputmask.inputmaskStrings.numeric = this.cast("numeric")
  @scala.inline
  def search: typings.inputmask.inputmaskStrings.search = this.cast("search")
  @scala.inline
  def tel: typings.inputmask.inputmaskStrings.tel = this.cast("tel")
  @scala.inline
  def text: typings.inputmask.inputmaskStrings.text = this.cast("text")
  @scala.inline
  def url: typings.inputmask.inputmaskStrings.url = this.cast("url")
  @scala.inline
  def verbatim: typings.inputmask.inputmaskStrings.verbatim = this.cast("verbatim")
}

