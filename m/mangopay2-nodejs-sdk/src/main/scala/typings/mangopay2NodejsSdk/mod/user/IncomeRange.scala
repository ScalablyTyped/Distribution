package typings.mangopay2NodejsSdk.mod.user

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Should be only one of these values:
  * 1 - for incomes <18K€),
  * 2 - for incomes between 18 and 30K€,
  * 3 - for incomes between 30 and 50K€,
  * 4 - for incomes between 50 and 80K€,
  * 5 - for incomes between 80 and 120K€,
  * 6 - for incomes >120K€
  */
/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`1`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`2`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`3`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`4`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`5`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`6`
*/
trait IncomeRange extends js.Object

object IncomeRange {
  @scala.inline
  def `1`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`2` = this.cast(2)
  @scala.inline
  def `3`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`3` = this.cast(3)
  @scala.inline
  def `4`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`4` = this.cast(4)
  @scala.inline
  def `5`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`5` = this.cast(5)
  @scala.inline
  def `6`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkNumbers.`6` = this.cast(6)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

