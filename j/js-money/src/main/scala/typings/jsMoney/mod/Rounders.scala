package typings.jsMoney.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsMoney.jsMoneyStrings.round
  - typings.jsMoney.jsMoneyStrings.floor
  - typings.jsMoney.jsMoneyStrings.ceil
*/
trait Rounders extends js.Object

object Rounders {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ceil: typings.jsMoney.jsMoneyStrings.ceil = this.cast("ceil")
  @scala.inline
  def floor: typings.jsMoney.jsMoneyStrings.floor = this.cast("floor")
  @scala.inline
  def round: typings.jsMoney.jsMoneyStrings.round = this.cast("round")
}

