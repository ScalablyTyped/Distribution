package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alg extends js.Object {
  var alg: String
  var hash: String
}

object Alg {
  @scala.inline
  def apply(alg: String, hash: String): Alg = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alg]
  }
}

