package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgKeyhash extends js.Object {
  var alg: String
  var keyhash: String
  var namehash: String
  var serial: String
}

object Anon_AlgKeyhash {
  @scala.inline
  def apply(alg: String, keyhash: String, namehash: String, serial: String): Anon_AlgKeyhash = {
    val __obj = js.Dynamic.literal(alg = alg, keyhash = keyhash, namehash = namehash, serial = serial)
  
    __obj.asInstanceOf[Anon_AlgKeyhash]
  }
}

