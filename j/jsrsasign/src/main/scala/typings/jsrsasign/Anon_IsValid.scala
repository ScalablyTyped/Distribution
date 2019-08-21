package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsValid extends js.Object {
  var isValid: Boolean
  var parse: Anon_CertsIdx
  var signerInfos: js.Array[_]
}

object Anon_IsValid {
  @scala.inline
  def apply(isValid: Boolean, parse: Anon_CertsIdx, signerInfos: js.Array[_]): Anon_IsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid, parse = parse, signerInfos = signerInfos)
  
    __obj.asInstanceOf[Anon_IsValid]
  }
}

