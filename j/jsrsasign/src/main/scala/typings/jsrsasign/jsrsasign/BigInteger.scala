package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.BigInteger")
@js.native
class BigInteger () extends js.Object {
  def abs(): BigInteger = js.native
  def bitLength(): Double = js.native
  def compareTo(a: BigInteger): Double = js.native
  def mod(a: BigInteger): BigInteger = js.native
  def modPowInt(e: Double, m: BigInteger): BigInteger = js.native
  def negate(): BigInteger = js.native
  def toString(b: Double): String = js.native
}

/* static members */
@JSGlobal("jsrsasign.BigInteger")
@js.native
object BigInteger extends js.Object {
  val ONE: BigInteger = js.native
  val ZERO: BigInteger = js.native
}

