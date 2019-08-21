package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alg extends js.Object {
  var alg: String
  var hash: String
}

object Anon_Alg {
  @scala.inline
  def apply(alg: String, hash: String): Anon_Alg = {
    val __obj = js.Dynamic.literal(alg = alg, hash = hash)
  
    __obj.asInstanceOf[Anon_Alg]
  }
}

