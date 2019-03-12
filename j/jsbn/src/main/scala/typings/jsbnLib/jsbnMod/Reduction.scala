package typings
package jsbnLib.jsbnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduction extends js.Object {
  def convert(x: BigInteger): BigInteger
  def mulTo(x: BigInteger, y: BigInteger, r: BigInteger): scala.Unit
  def reduce(x: BigInteger): scala.Unit
  def revert(x: BigInteger): BigInteger
  def sqrTo(x: BigInteger, r: BigInteger): scala.Unit
}

object Reduction {
  @scala.inline
  def apply(
    convert: BigInteger => BigInteger,
    mulTo: (BigInteger, BigInteger, BigInteger) => scala.Unit,
    reduce: BigInteger => scala.Unit,
    revert: BigInteger => BigInteger,
    sqrTo: (BigInteger, BigInteger) => scala.Unit
  ): Reduction = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), mulTo = js.Any.fromFunction3(mulTo), reduce = js.Any.fromFunction1(reduce), revert = js.Any.fromFunction1(revert), sqrTo = js.Any.fromFunction2(sqrTo))
  
    __obj.asInstanceOf[Reduction]
  }
}

