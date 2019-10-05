package typings.jsrsasign

import typings.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I extends js.Object {
  var i: Double
  var r: BigInteger
  var s: BigInteger
}

object Anon_I {
  @scala.inline
  def apply(i: Double, r: BigInteger, s: BigInteger): Anon_I = {
    val __obj = js.Dynamic.literal(i = i, r = r, s = s)
  
    __obj.asInstanceOf[Anon_I]
  }
}

