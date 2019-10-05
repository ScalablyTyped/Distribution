package typings.jsrsasign

import typings.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_R extends js.Object {
  var r: BigInteger
  var s: BigInteger
}

object Anon_R {
  @scala.inline
  def apply(r: BigInteger, s: BigInteger): Anon_R = {
    val __obj = js.Dynamic.literal(r = r, s = s)
  
    __obj.asInstanceOf[Anon_R]
  }
}

