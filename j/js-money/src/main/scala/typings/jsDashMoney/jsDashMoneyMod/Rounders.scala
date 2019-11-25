package typings.jsDashMoney.jsDashMoneyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsDashMoney.jsDashMoneyStrings.round
  - typings.jsDashMoney.jsDashMoneyStrings.floor
  - typings.jsDashMoney.jsDashMoneyStrings.ceil
*/
trait Rounders extends js.Object

object Rounders {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ceil: typings.jsDashMoney.jsDashMoneyStrings.ceil = this.cast("ceil")
  @scala.inline
  def floor: typings.jsDashMoney.jsDashMoneyStrings.floor = this.cast("floor")
  @scala.inline
  def round: typings.jsDashMoney.jsDashMoneyStrings.round = this.cast("round")
}

