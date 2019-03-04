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
    convert: js.Function1[BigInteger, BigInteger],
    mulTo: js.Function3[BigInteger, BigInteger, BigInteger, scala.Unit],
    reduce: js.Function1[BigInteger, scala.Unit],
    revert: js.Function1[BigInteger, BigInteger],
    sqrTo: js.Function2[BigInteger, BigInteger, scala.Unit]
  ): Reduction = {
    val __obj = js.Dynamic.literal(convert = convert, mulTo = mulTo, reduce = reduce, revert = revert, sqrTo = sqrTo)
  
    __obj.asInstanceOf[Reduction]
  }
}

