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

