package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.default_
  - typings.googlepay.googlepayStrings.black
  - typings.googlepay.googlepayStrings.white
*/
trait ButtonColor extends js.Object

object ButtonColor {
  @scala.inline
  def black: typings.googlepay.googlepayStrings.black = this.cast("black")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: default_ = this.cast("default")
  @scala.inline
  def white: typings.googlepay.googlepayStrings.white = this.cast("white")
}

